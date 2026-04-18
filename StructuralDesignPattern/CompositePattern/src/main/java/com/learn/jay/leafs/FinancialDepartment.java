package com.learn.jay.leafs;

import com.learn.jay.base.Department;

public class FinancialDepartment implements Department {
    private Integer id;
    private String name;

    public FinancialDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
