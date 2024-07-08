package com.students.students.Students.Teachers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teachers")
public class TeachersController {

    @Autowired
    private TeachersService service;

    @GetMapping("/all")
    public List<Teachers> getAllTeachers() {
        return service.getAllTeachers();
    }

    @PostMapping("/add")
    public void addTeacher(@RequestBody Teachers teacher) {
        service.addTeacher(teacher);
    }

    @GetMapping("/{id}")
    public Optional<Teachers> findTeacher(@PathVariable Long id) {
        return service.findTeacher(id);
    }
    @GetMapping("/home")
    public HomeResponse getHome() {
        HomeResponse response = new HomeResponse();
        response.setMessage("Welcome to the home page!");

        // Add the URLs of the student APIs
        response.setStudentApiUrls(Arrays.asList(
                "/students/all",
                "/students/add",
                "/students/{id}",
                "/students/update/{id}",
                "/students/delete/{id}"
        ));

        return response;
    }
}
