package springbootProject.example.springbootProject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.StubNotFoundException;
import java.util.List;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){

        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();

    }

    public void addStudent(Student student) {

        System.out.println(student);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
        System.out.println("Student deleted");
    }
}
