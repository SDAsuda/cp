package salary;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee (String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return this.hireDay;
    }

    public void raiseSalary(double percent) {
        double raise = this.salary * percent / 100;
        this.salary += raise;
    }
}