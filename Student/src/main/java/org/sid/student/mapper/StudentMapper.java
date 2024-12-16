package org.sid.student.mapper;

import org.modelmapper.ModelMapper;
import org.sid.student.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDto studentDto) {
        return modelMapper.map(studentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDto(Student student) {
        return modelMapper.map(student, StudentDto.class);
    }
}
