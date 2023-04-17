package Task9_Emlployee;

public class Manager extends Employee {
    private boolean amIworkingToday;
    private int roomsize;


    public Manager(String name, int age) {
        super(name, age);
    }

    public void leadigThePeople() {
        System.out.println("I'm leading a people.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "amIworkingToday=" + amIworkingToday +
                ", roomsize=" + roomsize +
                super.toString() +
                '}';
    }
}
