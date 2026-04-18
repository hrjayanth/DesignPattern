package com.learn.jay;

import java.time.LocalDate;

public class Student {
    private String name;
    private String studentId;
    private LocalDate dateOfBirth;
    private String branch;
    private String university;
    private String year;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.studentId = studentBuilder.studentId;
        this.dateOfBirth = studentBuilder.dateOfBirth;
        this.branch = studentBuilder.branch;
        this.university = studentBuilder.university;
        this.year = studentBuilder.year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return new StringBuilder(name).append("::").append(studentId).toString();
    }

    public static class StudentBuilder {

        private String name;
        private String studentId;
        private LocalDate dateOfBirth;
        private String branch;
        private String university;
        private String year;

        public StudentBuilder() {

        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public StudentBuilder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public StudentBuilder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public StudentBuilder setYear(String year) {
            this.year = year;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
