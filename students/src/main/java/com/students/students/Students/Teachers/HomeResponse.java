package com.students.students.Students.Teachers;

import java.util.List;

public class HomeResponse {
    private String message;
    private List<String> studentApiUrls;

    // Getters and setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getStudentApiUrls() {
        return studentApiUrls;
    }

    public void setStudentApiUrls(List<String> studentApiUrls) {
        this.studentApiUrls = studentApiUrls;
    }
}