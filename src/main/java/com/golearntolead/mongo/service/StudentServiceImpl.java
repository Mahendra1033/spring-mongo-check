package com.golearntolead.mongo.service;

import com.golearntolead.mongo.entity.Student;
import com.golearntolead.mongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("No student Found"));
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(String id) {
        boolean check = studentRepository.findById(id).isPresent();
        if(!check){
            throw new IllegalArgumentException("No student with this id please try again");
        }else {
            studentRepository.deleteById(id);
        }
    }

}
