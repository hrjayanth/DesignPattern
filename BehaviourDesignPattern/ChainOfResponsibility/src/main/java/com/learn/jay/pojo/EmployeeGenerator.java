package com.learn.jay.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmployeeGenerator {
    private final String name;
    private final String dept;
    private final int id;
    private final String email;
}
