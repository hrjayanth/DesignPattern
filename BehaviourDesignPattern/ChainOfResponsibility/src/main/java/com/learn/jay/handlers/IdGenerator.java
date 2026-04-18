package com.learn.jay.handlers;

import com.learn.jay.pojo.Employee;
import com.learn.jay.pojo.EmployeeGenerator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class IdGenerator extends EmployeeHandler {
    @Override
    public void handleRequest(EmployeeGenerator generator, Employee employee) {
        if (generator.getId() == 0) {
            throw new IllegalArgumentException("Id cannot be 0");
        }
        employee.setId(generator.getId());
        log.info("Id set to: {}", generator.getId());
        log.info("Next Handler -> {}", getNext());
        super.handleRequest(generator, employee);
    }
}
