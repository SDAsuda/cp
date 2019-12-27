package salary;

import java.time.LocalDate;

public class Manager extends Employee {
    private double bonus;
    private LocalDate fireDay;

    public Manager(String name, double salary, int year, int month, int day, int fireYear, int fireMonth, int fireDay) {
        super(name, salary, year, month, day);
        this.fireDay = LocalDate.of(fireYear, fireMonth, fireDay);
        bonus = 0;
    }

    public double getSalary() {
        double basicSalary = super.getSalary();

        //this.salary = basicSalary + this.bonus;    错误：salary是超类的私有数据域，因此不能在子类中直接改变

        return basicSalary + this.bonus;
    }

    public void setSalary(double bonus) {
        this.bonus = bonus;
    }
}