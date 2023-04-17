package Task14_Employee;

public class SoftwerTester extends Abstract_Employee{
    private int bugCount;
    private int salary;
    public SoftwerTester(String name, String position, int bugCount) {
        super(name, position);
        this.bugCount = bugCount;
        comutePay(); /** mivel beletettük a konstruktorba a metódust, ezért nem hívom meg a mainben.*/
    }

    @Override
    void comutePay() {
        salary = 20000*bugCount;
    }

    @Override
    public String toString() {
        return "SoftwerTester{" +
                "bugCount=" + bugCount +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +  /** azért teszi bele az abstract employee osztályban létrehoztott változókat a toStringbe, mert a
                                                            változók protected-ek, tehát a package-n belül látszódnak. */
                '}';
    }
}
