package org.example.services.impl;

import org.example.beans.Student;
import org.example.converter.StudentConverter;
import org.example.dao.StudentDao;
import org.example.dto.StudentDto;
import org.example.services.facade.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;
    private StudentConverter studentConverter;

    public StudentServiceImpl(StudentDao studentDao, StudentConverter studentConverter) {
        this.studentDao = studentDao;
        this.studentConverter = studentConverter;
    }

    @Override
    public List<StudentDto> findAll() {
        List<Student> students = studentDao.findAll();
        return students.stream().map(studentConverter::toDto).toList();
    }

    @Override
    public StudentDto findById(Long id) {
        Student student = studentDao.findById(id);
        return studentConverter.toDto(student);
    }

    @Override
    public StudentDto save(StudentDto studentDto) {
        Student student = studentConverter.toEntity(studentDto);
        Student savedStudent = studentDao.save(student);
        return studentConverter.toDto(savedStudent);
    }

    @Override
    public StudentDto update(StudentDto studentDto, Long id) {
        Student student = studentConverter.toEntity(studentDto);
        Student updatedStudent = studentDao.update(student, id);
        return studentConverter.toDto(updatedStudent);
    }

    @Override
    public int delete(Long id) {
        return studentDao.delete(id);
    }


}
