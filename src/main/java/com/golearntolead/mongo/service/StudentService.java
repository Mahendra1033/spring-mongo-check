package com.golearntolead.mongo.service;

import com.golearntolead.mongo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();

    Student saveStudent(Student student);

    Student getStudentById(String id);

    Student updateStudent(Student student);

    void deleteStudentById(String id);
}
