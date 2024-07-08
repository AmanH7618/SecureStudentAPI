package com.students.students.Students.ExceptionsHandler;

public class InValidDetails extends RuntimeException{
    public InValidDetails(String message) {
        super(message);
    }
}
