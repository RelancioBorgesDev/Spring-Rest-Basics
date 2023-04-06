package com.relnc.springrest.controller;

import com.relnc.springrest.entity.Student;
import com.relnc.springrest.exception.StudentErrorResponse;
import com.relnc.springrest.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Lionel", "Messi"));
        students.add(new Student("Cristiano", "Ronaldo"));
        students.add(new Student("Neymar", "Junior"));

        if((studentId >= students.size()) || (studentId < 0)){
            throw new StudentNotFoundException("Student não encontrado - " + studentId);
        }

        return students.get(studentId);
    }
}
