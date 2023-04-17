package HomeWork;

public abstract class Present {
    protected String presentName;
    protected String presentType;

    protected double weightOfGift;

    public Present(String presentName, String presentType, double weightOfGift) {
        this.presentName = presentName;
        this.presentType = presentType;
        this.weightOfGift = weightOfGift;
    }


    abstract double getWeight();
    abstract String getType();




}
