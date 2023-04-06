package com.relnc.springrest.controller;

import com.relnc.springrest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Lionel", "Messi"));
        students.add(new Student("Cristiano", "Ronaldo"));
        students.add(new Student("Neymar", "Junior"));

        return students;
    }
}
