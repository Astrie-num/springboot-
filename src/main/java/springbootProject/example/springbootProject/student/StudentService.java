package springbootProject.example.springbootProject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
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
