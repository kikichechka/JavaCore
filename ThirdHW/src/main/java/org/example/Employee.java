package org.example;

public abstract class Employee {
    private static final int CURRENT_YEAR = 2023;
    private final String name;
    private final String midName;
    private final String surName;
    private final String position;
    private final String phone;
    private int salary;
    private final int bYear;
    private final int bMonth;
    private final int bDay;

    public Employee(String name,
                    String midName,
                    String surName,
                    String phone,
                    String position,
                    int salary,
                    int bYear,
                    int bMonth,
                    int bDay) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.bYear = bYear;
        this.bMonth = bMonth;
        this.bDay = bDay;
    }

    public void increaseSalary(Employee[] emp, int amount) {
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getbYear() {
        return bYear;
    }

    public int getbMonth() {
        return bMonth;
    }

    public int getbDay() {
        return bDay;
    }

    public int getAge() {
        return CURRENT_YEAR - bYear;
    }

    public int compare( Employee employee) {
        int empl = getbDay() + (getbMonth() << 6) + (getbYear() << 11);
        int income = employee.getbDay() + (employee.getbMonth() << 6) + (employee.getbYear() << 11);
        return empl - income;
    }

    @Override
    public String toString() {
        return String.format("""
                Сотрудник: %s %s %s,
                должность: %s
                телефон: %s
                зарплата: %d руб.
                возраст: %d
                """, getName(), getMidName(), getSurName(), getPosition(), getPhone(), getSalary(), getAge());
    }
}
