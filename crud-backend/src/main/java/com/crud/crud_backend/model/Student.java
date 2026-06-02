package com.crud.crud_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    private int rno;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String tech;
    @Column(nullable = false)
    private String gender;
}