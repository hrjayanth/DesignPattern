package com.learn.jay;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
                .setName("Jay")
                .setStudentId("123456789")
                .setDateOfBirth(java.time.LocalDate.of(2000, 1, 1))
                .setBranch("Computer Science")
                .setUniversity("University of Technology")
                .setYear("2023")
                .build();

        log.info("Student Details: {}", student);
    }
}
