package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Kate", List.of(4.9, 5.0, 4.6), "informatics"),
                new Student("Anna", List.of(4.1, 3.0, 3.6), "informatics"),
                new Student("Roma", List.of(2.5, 4.0, 4.1), "informatics"),
                new Student("Nikita", List.of(4.1, 5.0, 2.7), "informatics"),
                new Student("Vadim", List.of(4.7, 5.0, 4.6), "history"),
                new Student("Ivan", List.of(3.5, 3.0, 3.6), "informatics"),
                new Student("Alexey", List.of(4.5, 5.0, 4.6), "informatics"),
                new Student("Arina", List.of(4.5, 5.0, 4.9), "informatics"),
                new Student("Miroslava", List.of(4.7, 3.1, 4.3), "informatics"),
                new Student("Sergey", List.of(4.5, 5.0, 4.6), "informatics"),
                new Student("Mikhail", List.of(4.5, 5.0, 4.1), "informatics"),
                new Student("Oleg", List.of(4.5, 5.0, 4.6), "history"),
                new Student("Arina", List.of(4.5, 5.0, 4.9), "informatics"),
                new Student("Miroslava", List.of(4.7, 3.1, 4.3), "informatics")
        );

        search(list).forEach(System.out::println);
    }

    public static List<Student> search(List<Student> list) {
        return list.stream()
                .filter(x -> x.specialty.equals("informatics") && x.getAverageGrade() >= 4.5)
                .limit(5)
                .collect(Collectors.toList());
    }
}