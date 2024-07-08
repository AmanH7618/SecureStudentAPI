package com.students.students.Students.ExceptionsHandler.CustomValidators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<CustomValidator, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value!=null && value.matches("[a-zA-z]");
    }
}
