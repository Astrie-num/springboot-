package springbootProject.example.springbootProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;
import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student astrie = new Student(

                     "Astrie",
                    "astrie@codergmail.com",
                    LocalDate.of(2005, JANUARY, 12)
            );
            Student alex = new Student(


                    "alex",
                    "alex.coder@gmail.com",
                    LocalDate.of(2004, APRIL, 29)
            );
            repository.saveAll(
                    List.of(astrie, alex)
            );
        };

    }
}
