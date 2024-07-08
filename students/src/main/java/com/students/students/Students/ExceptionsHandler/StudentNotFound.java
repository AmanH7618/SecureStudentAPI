package com.students.students.Students.ExceptionsHandler;

public class StudentNotFound extends  RuntimeException{
    public StudentNotFound(String message) {
        super(message);
    }
}
