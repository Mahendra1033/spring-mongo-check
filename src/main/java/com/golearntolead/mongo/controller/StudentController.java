package com.golearntolead.mongo.controller;

import com.golearntolead.mongo.entity.Student;
import com.golearntolead.mongo.repository.StudentRepository;
import com.golearntolead.mongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("getStudentById/{id}")
    private Student getStudentById(@PathVariable("id") String id){
        return studentService.getStudentById(id);
    }

    @PutMapping("updateStudent")
    private Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @GetMapping("deleteStudentById/{id}")
    private void deleteStudentById(@PathVariable("id") String id){
        studentService.deleteStudentById(id);
    }
}
