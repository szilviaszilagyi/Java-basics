package HomeWork;

public class ElectricDevices extends Present {


    public ElectricDevices(String presentName, String presentType, double weightOfGift) {
        super(presentName, presentType, weightOfGift);
    }

    public String getType() {
        return presentType;
    }

    @Override
    public double getWeight() {
        return weightOfGift;
    }

    @Override
    public String toString() {
        return "ElectricDevices{" +
                "weigthOfGift=" + weightOfGift +
                ", presentName='" + presentName + '\'' +
                ", presentType='" + presentType + '\'' +
                '}';
    }
}
