package org.example.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 10)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 10)
    private String lastName;
    @Column(name = "email", nullable = false, unique = true, length = 30)
    private String email;

}
