package Task9_Emlployee;

public class Employee {
    private String name;
    private int age;
    private String degree;
    private String gender;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void overTime(){
        System.out.println("Sorry you'll overtime today");
    }

    public void getSalary(){
        System.out.println("Your salary in the box to the next door,");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", degree='" + degree + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
