package com.learn.jay;

import com.learn.jay.handlers.DeptHandler;
import com.learn.jay.handlers.EmailHandler;
import com.learn.jay.handlers.EmployeeHandler;
import com.learn.jay.handlers.IdGenerator;
import com.learn.jay.handlers.NameHandler;
import com.learn.jay.pojo.Employee;
import com.learn.jay.pojo.EmployeeGenerator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        EmployeeGenerator employeeGenerator = new EmployeeGenerator("Alice", "HR", 1, "alice.hr@gmail.com");

        EmployeeHandler handler = new NameHandler();
        handler.next(new IdGenerator())
                .next(new DeptHandler())
                .next(new EmailHandler());

        Employee employee = new Employee();
        handler.handleRequest(employeeGenerator, employee);

        log.info(" -------- ");
        log.info("Employee -> {}", employee);
    }
}
