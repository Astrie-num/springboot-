package springbootProject.example.springbootProject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @DeleteMapping(path = "{studentId}")
    public void deleteStudentById(@PathVariable("studentId") int studentId) {
        studentService.deleteStudentById(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudentById(
            @PathVariable("studentId") int studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        studentService.updateStudentById(studentId, name, email);
    }
}
