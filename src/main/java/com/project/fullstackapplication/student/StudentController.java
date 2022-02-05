package com.project.fullstackapplication.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(UUID.randomUUID(), "Michael", "Jackson", "mjsinger@mail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Michael", "Jordan", "mjballer@mail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Mary", "Jane", "mjspider@hotmail.com", Student.Gender.FEMALE),
                new Student(UUID.randomUUID(), "Mother", "Theresa", "m_T@gmail.com", Student.Gender.FEMALE)
        );
    }

}
