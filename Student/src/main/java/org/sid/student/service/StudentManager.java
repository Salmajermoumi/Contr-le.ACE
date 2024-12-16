package org.sid.student.service;

import lombok.AllArgsConstructor;
import org.sid.student.entities.Student;
import org.sid.student.mapper.StudentDto;
import org.sid.student.mapper.StudentMapper;
import org.sid.student.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        return studentMapper.fromStudentToStudentDto(student);
    }

    @Override
    public boolean deleteStudent(Long id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<StudentDto> getStudentsByName(String name) {
        List<Student> students = studentRepository.findByName(name);
        List<StudentDto> studentDto = new ArrayList<>();
        for (Student student : students) {
            studentDto.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDto;
    }

    @Override
    public List<StudentDto> getStudentsByNameAndEmail(String name, String email) {
        List<Student> students = studentRepository.findByNameAndemaiAndEmailAndEmail(name, Integer.parseInt(email));
        List<StudentDto> studentDto = new ArrayList<>();
        for (Student student : students) {
            studentDto.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDto;
    }

    @Override
    public List<StudentDto> saveStudents(List<StudentDto> studentDtos) {
        List<Student> students = new ArrayList<>();
        for (StudentDto studentDto : studentDtos) {
            students.add(studentMapper.fromStudentDtoToStudent(studentDto));
        }

        students = studentRepository.saveAll(students);

        studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }
}
