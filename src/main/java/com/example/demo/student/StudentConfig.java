package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository) {
        return args -> {
            Student Alfonz = new Student(
                    "Alfonz",
                    "aldelatorre@gbox.adnu.edu.ph",
                    LocalDate.of(2002, FEBRUARY, 22),
                    19
            );

            Student John = new Student(
                    "John",
                    "Johndelacruz@gbox.adnu.edu.ph",
                    LocalDate.of(2003, FEBRUARY, 22),
                    18
            );

            Student Betty = new Student(
                    "Betty",
                    "BettyMayn@gbox.adnu.edu.ph",
                    LocalDate.of(2001, FEBRUARY, 22),
                    20
            );
            repository.saveAll(
                    Arrays.asList(Alfonz, John, Betty)
            );
        };
    }
}
