package abstractClasses;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return this.salary;
    } 
 
    public LocalDate getHireDay() {
        return this.hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double percent) {
        double raise = this.salary * percent / 100;
        this.salary += raise;
    }
}