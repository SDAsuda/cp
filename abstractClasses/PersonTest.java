package abstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("suda", 1000, 1998, 2, 3);
        people[1] = new Employee("sudaa", 1000, 1998, 2, 3);

        for (Person e : people) {
            System.out.println(e.getName());
        }
    }

}