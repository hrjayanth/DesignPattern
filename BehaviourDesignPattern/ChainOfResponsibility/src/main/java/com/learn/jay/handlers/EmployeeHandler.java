package com.learn.jay.handlers;

import com.learn.jay.pojo.Employee;
import com.learn.jay.pojo.EmployeeGenerator;

public abstract class EmployeeHandler {
    private EmployeeHandler nextHandler;

    public EmployeeHandler next(EmployeeHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public EmployeeHandler getNext() {
        return nextHandler;
    }

    public void handleRequest(EmployeeGenerator generator, Employee employee) {
        if (nextHandler != null) {
            nextHandler.handleRequest(generator, employee);
        }
    }
}
