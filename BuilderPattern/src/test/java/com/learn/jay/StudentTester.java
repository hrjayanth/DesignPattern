package com.learn.jay;


import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class StudentTester {

    @Test
    public void buildStudent() {
        String name = "ABCD";
        String studentId = "2021XX98765";
        LocalDate dateOfBirth = LocalDate.of(1989, 12, 20);
        String branch = "ISE";
        String university = "VTU";
        String year = "1";
        Student student = new Student.StudentBuilder()
                .setName(name)
                .setStudentId(studentId)
                .setBranch(branch)
                .setDateOfBirth(dateOfBirth)
                .setUniversity(university)
                .setYear(year)
                .build();

        assertEquals(student.toString(), new StringBuilder(name).append("::").append(studentId).toString());
    }
}
