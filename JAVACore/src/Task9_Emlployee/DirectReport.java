package Task9_Emlployee;

public class DirectReport extends Employee {

    private String goal;
    private boolean halfTimeWorker;


    public DirectReport(String name, int age) {
        super(name, age);
    }

    public DirectReport(String name, int age, boolean halfTimeWorker) {
        super(name, age);
        this.halfTimeWorker = halfTimeWorker;
    }

    public void createExcelTable() {
        System.out.println("Here the excel sheet.");
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setHalfTimeWorker(boolean halfTimeWorker) {
        this.halfTimeWorker = halfTimeWorker;
    }

    @Override
    public String toString() {
        return "DirectReport{" +
                "goal='" + goal + '\'' +
                ", halfTimeWorker=" + halfTimeWorker +
                super.toString() +
                '}';
    }
}
