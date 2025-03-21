package studentteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import studentteacher.model.Student;
import studentteacher.service.StudentService;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        //return null;
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }


}
