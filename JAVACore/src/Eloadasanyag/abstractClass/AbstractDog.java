package Eloadasanyag.abstractClass;

public abstract class AbstractDog {
    protected String name;
    protected String gender;
    protected String birthDay;
    protected double weight;

    protected AbstractDog(String gender, String birthDay, double weight) {
        this("anonymous", gender, birthDay, weight);
    }

    public AbstractDog(String name, String gender, String birthDay, double weight) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.weight = weight;
    }


    public abstract String getType();

    public abstract String doSomethingBad();

    public String bark() {
        return "Wau";
    }

    @Override
    public String toString() {
        return getType() + "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                ", weight=" + weight +
                '}';
    }
}

