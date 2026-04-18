package com.learn.jay.handlers;

import com.learn.jay.pojo.Employee;
import com.learn.jay.pojo.EmployeeGenerator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class EmailHandler extends EmployeeHandler {
    @Override
    public void handleRequest(EmployeeGenerator generator, Employee employee) {
        if (generator.getEmail() == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        employee.setEmail(generator.getEmail());
        log.info("Email set to: {}", generator.getEmail());
        log.info("Next Handler -> {}", getNext());
        super.handleRequest(generator, employee);
    }
}
