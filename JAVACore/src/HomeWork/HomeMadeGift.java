package HomeWork;

public class HomeMadeGift extends Present {

    public HomeMadeGift(String presentName, String presentType, double weightOfGift) {
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
        return "HomeMadeGift{" +
                "weightOfGift=" + weightOfGift +
                ", presentName='" + presentName + '\'' +
                ", presentType='" + presentType + '\'' +
                '}';
    }
}
