package com.crud.crud_backend.service;

import com.crud.crud_backend.model.Student;
import com.crud.crud_backend.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo rp;

    public List<Student> getAllStudentData() {
        return rp.findAll();
    }

    public Student addStudent(Student std) {
        return rp.save(std);
    }

    public Student getStudentByRollNo(int roll) {
        return rp.findById(roll).orElse(null);
    }

    public Student updateStudent(Student std) {
        return rp.save(std);
    }

    public void deleteStudent(int roll) {
        rp.deleteById(roll);
    }

    // Add this method
    public List<Student> getStudentByGenderAndTech(String gender, String tech) {
        return rp.findByGenderAndTech(gender, tech);
    }
}