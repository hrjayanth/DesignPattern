package com.learn.jay.handlers;

import com.learn.jay.pojo.Employee;
import com.learn.jay.pojo.EmployeeGenerator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class NameHandler extends EmployeeHandler {
    @Override
    public void handleRequest(EmployeeGenerator generator, Employee employee) {
        if (generator.getName() == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        employee.setName(generator.getName());
        log.info("Name set to: {}", generator.getName());
        log.info("Next Handler -> {}", getNext());
        super.handleRequest(generator, employee);
    }
}
