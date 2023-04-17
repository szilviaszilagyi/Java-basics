package Task14_Employee;

public class HrAssistant extends Abstract_Employee{
    private boolean noMorePeople;
    private int salary;

    public HrAssistant(String name, String position, boolean noMorePeople) {
        super(name, position);
        this.noMorePeople = noMorePeople;
        comutePay();
    }

    @Override
    void comutePay() {
        if(noMorePeople){
            salary = 100;
        }else{
            salary = 560000;
        }
    }

    @Override
    public String toString() {
        return "HrAssistant{" +
                "noMorePeople=" + noMorePeople +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
