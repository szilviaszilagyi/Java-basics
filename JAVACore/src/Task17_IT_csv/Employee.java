package Task17_IT_csv;

public abstract class Employee {
    private String position;
    private String name;
    private String salary;
    private String customField;

    public Employee(String position, String name, String salary, String customField) {
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.customField = customField;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", customField='" + customField + '\'' +
                '}';
    }
}
