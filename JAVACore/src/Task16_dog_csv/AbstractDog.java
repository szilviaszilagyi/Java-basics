package Task16_dog_csv;

public abstract class AbstractDog {
    private String type;
    private String name;
    private String gender;
    private String birthday;
    private String weight;
    private String additionalProperties;

    public AbstractDog(String type, String name, String gender, String birthday, String weight, String additionalProperties) {
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.weight = weight;
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "AbstractDog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", weight='" + weight + '\'' +
                ", additionalProperties='" + additionalProperties + '\'' +
                '}';
    }
}
