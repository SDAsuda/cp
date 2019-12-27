package salary;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("suda", 10000, 1996, 9, 17, 1998, 12, 11);
        boss.setSalary(1000);

        Employee[] staff = new Employee[2];
        staff[0] = boss;
        staff[1] = new Employee("tian", 10000, 1998, 1, 12);

        for (Employee e : staff) {
            System.out.println(e.getName() + e.getSalary());
        }
    }
}
