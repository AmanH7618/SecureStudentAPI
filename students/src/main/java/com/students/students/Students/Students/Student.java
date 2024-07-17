package com.students.students.Students.Students;

import com.students.students.Students.ExceptionsHandler.CustomValidators.CustomValidator;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
public class Student {
    @Id
    private int id;
    @NotNull
    @CustomValidator(message = "Name must contains alphabt only")
    @Size(min = 2, message = "Requires name consisting alphabet greater than 2")
    private String name;
    @NotNull
    private int standard;
    @NotNull
    private char sec;
    @NotNull
    private String email;

//    public Student(String name, int id, int standard, char sec, String email) {
//        this.name = name;
//        this.id = id;
//        this.standard = standard;
//        this.sec = sec;
//        this.email = email;
//    }
//    public Student() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getStandard() {
//        return standard;
//    }
//
//    public char getSec() {
//        return sec;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStandard(int standard) {
//        this.standard = standard;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setSec(char sec) {
//        this.sec = sec;
//    }
}
