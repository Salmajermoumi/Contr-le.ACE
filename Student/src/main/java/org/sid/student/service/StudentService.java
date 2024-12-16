package org.sid.student.service;


import org.sid.student.mapper.StudentDto;

import java.util.List;
public interface StudentService  {
    StudentDto saveStudent(StudentDto studentDto);

    boolean deleteStudent(Long id);

    List<StudentDto> getStudentsByName(String name);

    List<StudentDto> getStudentsByNameAndEmail(String name, String email);

    List<StudentDto> saveStudents(List<StudentDto> studentDtos);


}
