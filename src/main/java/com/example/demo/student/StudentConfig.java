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
                    LocalDate.of(2002, FEBRUARY, 22)
            );

            Student Nikki = new Student(
                    "Nikki",
                    "Nikkidelatorre@gbox.adnu.edu.ph",
                    LocalDate.of(1996, FEBRUARY, 22)
            );

            Student John = new Student(
                    "John",
                    "Johndelacruz@gbox.adnu.edu.ph",
                    LocalDate.of(2003, FEBRUARY, 22)
            );

            Student Betty = new Student(
                    "Betty",
                    "BettyMayn@gbox.adnu.edu.ph",
                    LocalDate.of(2001, FEBRUARY, 22)
            );
            repository.saveAll(
                    Arrays.asList(Alfonz, Nikki, John, Betty)
            );
        };
    }
}
