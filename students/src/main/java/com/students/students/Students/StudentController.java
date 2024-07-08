package com.students.students.Students;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(service.getStudents(), HttpStatus.OK);
    }
    @PostMapping("student")
    public ResponseEntity<String> addStudent(@Valid  @RequestBody Student student, BindingResult result){
        service.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body("Student added successfully");

    }
    @GetMapping("students/{id}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable Integer id){
        return new ResponseEntity<>(service.getStudentById(id),HttpStatus.OK);
    }

}
