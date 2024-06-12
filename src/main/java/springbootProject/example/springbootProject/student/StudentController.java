package springbootProject.example.springbootProject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbootProject.example.springbootProject.student.StudentService;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
       return studentService.getStudents();

    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
         studentService.addStudent(student);
    }

    @DeleteMapping
    public void deleteStudentById(Student student) {
        studentService.deleteStudent(student);
    }
}
