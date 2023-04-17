package Eloadasanyag.encapsulation.employee;

public class Employee {
    private String name;
    private String role;

    public Employee(){
        name = "anonymus";
        role = "n/a";
    }
    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
