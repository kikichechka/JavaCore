package org.example;

public class Manager extends Employee{
    public Manager(String name, String midName, String surName, String phone, String position, int salary, int bYear, int bMonth, int bDay) {
        super(name, midName, surName, phone, position, salary, bYear, bMonth, bDay);
    }

    @Override
    public void increaseSalary(Employee[] emp, int amount) {
        for (Employee employee : emp) {
            if (!(employee instanceof Manager)) {
                int salary = employee.getSalary();
                employee.setSalary(salary + amount);
            }
        }
    }
}
