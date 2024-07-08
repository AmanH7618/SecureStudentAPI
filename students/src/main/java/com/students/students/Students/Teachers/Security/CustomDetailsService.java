package com.students.students.Students.Teachers.Security;

import com.students.students.Students.Teachers.Teachers;
import com.students.students.Students.Teachers.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomDetailsService implements UserDetailsService {

    private final TeachersRepository repo;

    @Autowired
    public CustomDetailsService(@Lazy TeachersRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Teachers teacher = repo.findByusername(username);
        if (teacher == null) {
            throw new UsernameNotFoundException("Teacher not found " + username);
        }
        return new org.springframework.security.core.userdetails.User(
                teacher.getUsername(), teacher.getPassword(), Collections.emptyList());
    }
}
