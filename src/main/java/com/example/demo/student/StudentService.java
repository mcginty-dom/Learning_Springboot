package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Adam",
                        "dem@ITDGlobal.com",
                        LocalDate.of(1999, Month.APRIL, 28),
                        22
                )
        );
    }
}
