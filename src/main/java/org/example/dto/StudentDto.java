package org.example.dto;

public record StudentDto(Long id, String firstName, String lastName, String email, String level) {
    public StudentDto(String firstName, String lastName, String email, String level) {
        this(null, firstName, lastName, email, level);
    }
}
