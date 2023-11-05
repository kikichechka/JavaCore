package org.example;
import java.util.List;

public class Student {
    private final String name;
    private final List<Double> grades;
    final String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public double getAverageGrade() {
        Double a = grades.stream().reduce(0.0, Double::sum);
        return a/grades.size();
    }

    @Override
    public String toString() {
        return String.format("Студент %s, специальность \"%s\", средний балл %.1f", name, specialty, getAverageGrade());
    }
}
