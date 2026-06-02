package com.crud.crud_backend.controller;

import com.crud.crud_backend.model.Student;
import com.crud.crud_backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService s;

    @GetMapping
    public List<Student> getAllStudents() {
        return s.getAllStudentData();
    }

    @PostMapping
    public String addStudent(@RequestBody Student std) {
        s.addStudent(std);
        return "Successfully added to the database";
    }

    @GetMapping("/{rno}")
    public Student getStudentByRollNo(@PathVariable int rno) {
        return s.getStudentByRollNo(rno);
    }

    @PutMapping
    public String updateStudent(@RequestBody Student std) {
        s.updateStudent(std);
        return "Successfully updated";
    }

    @DeleteMapping("/{rno}")
    public String deleteStudent(@PathVariable int rno) {
        s.deleteStudent(rno);
        return "Successfully deleted";
    }

    @GetMapping("/custom")
    public List<Student> getStudentByGenderAndTech(
            @RequestParam String gender,
            @RequestParam String tech) {

        return s.getStudentByGenderAndTech(gender, tech);
    }
}