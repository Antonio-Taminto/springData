package com.exercise.springData.entities;

import jakarta.persistence.*;

@Table
@Entity
public class Enrollments {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Class aClass;


}
