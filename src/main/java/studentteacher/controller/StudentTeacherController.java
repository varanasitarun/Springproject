package studentteacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import studentteacher.exception.ResourceNotFoundException;
import studentteacher.model.StudentTeacher;
import studentteacher.service.StudentTeacherService;

@RestController
@RequestMapping("/student-teacher")
public class StudentTeacherController {

    @Autowired
    private StudentTeacherService studentTeacherService;

    @PostMapping
    public ResponseEntity<StudentTeacher> assignStudentToTeacher(@RequestBody StudentTeacher studentTeacher) {
        return ResponseEntity.ok(studentTeacherService.assignStudentToTeacher(studentTeacher));
    }


}
