package com.students.students.Students;

import com.students.students.Students.ExceptionsHandler.StudentNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public List<Student> getStudents(){
        return repo.findAll();
    }

    public void addStudent( Student student) {
        repo.save(student);
    }

    public Optional<Student> getStudentById(Integer id) {
        return Optional.ofNullable(repo.findById(id).orElseThrow(() -> new StudentNotFound("Student not found " + id)));
    }
}
