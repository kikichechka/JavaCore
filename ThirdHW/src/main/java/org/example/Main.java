package org.example;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Ivan", "Igorevich", "Ovchinnikov", "8(495)000-11-22", "developer", 70000, 1985, 11, 29);
        Employee seller1 = new Seller("Andrey", "Viktorovich", "Bezrukov", "8(495)111-22-33", "fitter", 42000, 1973, 2, 9);
        Employee seller2 = new Seller("Evgeniy", "Viktorovich", "Delfinov", "8(495)222-33-44", "projectmanager", 40000, 1963, 7, 7);
        Employee seller3 = new Seller("Tatiana", "Sergeevna", "Krasotkina", "8(495)444-55-66", "accountant", 45000, 1983, 8, 23);

        Employee[] employees = {
                manager, seller1, seller2, seller3};

        printListEmployee(employees);

        manager.increaseSalary(employees, 10000);

        printListEmployee(employees);

        System.out.println(manager.compare(seller1));

    }

    private static void printListEmployee(Employee[] employees) {
        for (Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }
}