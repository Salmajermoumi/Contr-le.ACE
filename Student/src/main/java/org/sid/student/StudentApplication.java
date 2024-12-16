package org.sid.student;

import org.sid.student.dto.StudentDTO;
import org.sid.student.entities.Student;
import org.sid.student.mapper.StudentDto;
import org.sid.student.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }
    @Bean
    CommandLineRunner start(StudentService StudentService){
        return  args -> {
            StudentService.saveStudent(
                    (StudentDto) List.of(
                            StudentDTO.builder().Name("salma").email("salma@gmail.com").build(),
                            StudentDTO.builder().Name("safaa").email("safaa@gmail.com").build(),
                            StudentDTO.builder().Name("ibtissame").email("ibtissame@gmail.com").build(),
                            StudentDTO.builder().Name("rihame").email("rihame@gmail.com").build()
                    )

            );
        };
    }
}

