package springbootProject.example.springbootProject.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
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

        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()) {
            throw new IllegalStateException("Email taken already!");
        }
        studentRepository.save(student);
    }

    public void deleteStudentById(int studentId){
        boolean exists = studentRepository.existsById(studentId);
        if(!exists) {
            throw new IllegalStateException("Student with id " + studentId + " does not exist");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudentById(int studentId, String name, String email) {
        Student student =  studentRepository.findById(studentId)
                .orElseThrow( () -> new IllegalStateException("As student with id " + studentId + " does not exist"));

        if(name != null && name.length() > 0 &&
        !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if(email != null && email.length() > 0 &&
        !Objects.equals(student.getEmail(), email)){
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("Email is already taken");
            }
            student.setEmail(email);
        }

    }
}
