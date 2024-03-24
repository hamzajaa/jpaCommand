package org.example.services.facade;

import org.example.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
    StudentDto findById(Long id);
    StudentDto save(StudentDto studentDto);
    StudentDto update(StudentDto studentDto,Long id);
    int delete(Long id);
}
