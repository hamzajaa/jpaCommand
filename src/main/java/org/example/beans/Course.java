package org.example.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "course_name", nullable = false, length = 45)
    private String courseName;
    @Column(name ="course_duration", nullable = false, length = 45)
    private String courseDuration;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;



}
