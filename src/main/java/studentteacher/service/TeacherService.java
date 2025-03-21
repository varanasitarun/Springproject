package studentteacher.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentteacher.exception.ResourceNotFoundException;
import studentteacher.model.Student;
import studentteacher.model.Teacher;
import studentteacher.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Teacher not found"));
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
}
