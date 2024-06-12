package springbootProject.example.springbootProject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


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

        Optional<Student> optional = studentRepository.findStudentByEmail(student.getEmail());
        if(optional.isPresent()) {
            throw new IllegalStateException("Email taken already!");
        }
        studentRepository.save(student);
    }
}
