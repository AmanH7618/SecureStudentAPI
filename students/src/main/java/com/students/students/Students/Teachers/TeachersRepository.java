package com.students.students.Students.Teachers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachersRepository extends JpaRepository<Teachers, Long> {
    Teachers findByusername(String username);
}
