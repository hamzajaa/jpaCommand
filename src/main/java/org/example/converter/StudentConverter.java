package org.example.converter;

import org.example.beans.Student;
import org.example.dto.StudentDto;

public class StudentConverter implements IConverter<Student, StudentDto> {
    @Override
    public Student toEntity(StudentDto dto) {
        if (dto == null) {
            return null;
        }
        Student student = new Student();
        student.setId(dto.id());
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        student.setLevel(dto.level());
        return student;
    }

    @Override
    public StudentDto toDto(Student entity) {
        if (entity == null) {
            return null;
        }
        return new StudentDto(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getLevel()
        );
    }
}
