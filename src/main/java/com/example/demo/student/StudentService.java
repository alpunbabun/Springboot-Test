package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        Student student = new Student(
                1L,
                "Alfonz",
                "aldelatorre@gbox.adnu.edu.ph",
                LocalDate.of(2002, Month.FEBRUARY, 22),
                21
        );
        return Arrays.asList(student);
    }
}
