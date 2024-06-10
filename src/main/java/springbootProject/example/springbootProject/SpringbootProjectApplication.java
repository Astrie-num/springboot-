package springbootProject.example.springbootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootProject.example.springbootProject.student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

	@GetMapping
	public List<Student> greeting(){
		return List.of(
				new Student(
						"Astrie",
						"astrie@codergmail.com",
						19,
						LocalDate.of(2005, Month.JANUARY, 12)
				)
		);
	}

}
