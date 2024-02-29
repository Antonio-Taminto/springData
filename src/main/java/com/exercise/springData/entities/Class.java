package com.exercise.springData.entities;

import jakarta.persistence.*;

@Table(name = "classes")
@Entity
public class Class {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
}
