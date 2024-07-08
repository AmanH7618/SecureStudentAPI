package com.students.students.Students.Teachers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeachersService {
    @Autowired
    TeachersRepository repo;


    public List<Teachers> getAllTeachers() {
        return  repo.findAll();
    }

    public void addTeacher(Teachers teacher) {

        repo.save(teacher);
    }

    public Optional<Teachers> findTeacher(Long id) {
        return repo.findById(id);
    }
}
