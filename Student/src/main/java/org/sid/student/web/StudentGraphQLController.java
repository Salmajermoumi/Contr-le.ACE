package org.sid.student.web;

import lombok.AllArgsConstructor;
import org.sid.student.mapper.StudentDto;
import org.sid.student.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {
    private final StudentService studentService;
    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto student) {
        return studentService.saveStudent(student);
    }
    @QueryMapping
    public List<StudentDto> getStudentsByName(@Argument String name) {
        return studentService.getStudentsByName(name);
    }

}
