package com.learn.jay.handlers;

import com.learn.jay.pojo.Employee;
import com.learn.jay.pojo.EmployeeGenerator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class DeptHandler extends EmployeeHandler {
    @Override
    public void handleRequest(EmployeeGenerator generator, Employee employee) {
        if (generator.getDept() == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }
        employee.setDept(generator.getDept());
        log.info("Department set to: {}", generator.getDept());
        log.info("Next Handler -> {}", getNext());
        super.handleRequest(generator, employee);
    }
}
