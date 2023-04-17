package HomeWork;

public class Toys extends Present {


    public Toys(String presentName, String presentType, double weightOfGift) {
        super(presentName, presentType, weightOfGift);
    }

    @Override
    public double getWeight() {
        return weightOfGift;
    }

    public String getType() {
        return presentType;
    }

    @Override
    public String toString() {
        return "Toys{" +
                ", weightOfGift=" + weightOfGift +
                ", presentName='" + presentName + '\'' +
                ", presentType='" + presentType + '\'' +
                '}';
    }
}