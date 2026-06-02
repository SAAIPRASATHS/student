package com.crud.crud_backend.repository;

import com.crud.crud_backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByGenderAndTech(String gender, String tech);

}