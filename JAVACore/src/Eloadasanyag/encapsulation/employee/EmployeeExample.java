package Eloadasanyag.encapsulation.employee;

public class EmployeeExample {
    public static void main(String[] args) {

        Employee anonymus = new Employee();
        System.out.println(anonymus.getName());
        Employee anonymus2 = new Employee("Fred", "business analyst");
        System.out.println(anonymus2.getName());
        System.out.println(anonymus2.getRole());
        Employee bob = new Employee("Bob");
        Employee kateTheDeveloper = new Employee("Kate", "Developer");

        System.out.println(bob.getName());

        System.out.println(kateTheDeveloper.getName());
        System.out.println(kateTheDeveloper.getRole());
    }
}

