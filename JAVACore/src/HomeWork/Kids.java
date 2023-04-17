package HomeWork;

public class Kids implements Person{
    private int age;
    private  String name;

    private String presentType;

    public Kids(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String receivePresent(Present present) {

        presentType = present.getType();

        if(presentType.equalsIgnoreCase("toy")) {
            System.out.println("Very happy!");
            return "Very impressed.";
        } else if (presentType.equalsIgnoreCase("electric devices")) {
            System.out.println("Oh, what is this?");
            return "Oh, what is this?";
        }else{
            System.out.println("Mommy, I don't want it!");
            return "Mommy, I don't want it!";
        }

    }

    @Override
    public String toString() {
        return "Kids{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", presentType='" + presentType + '\'' +
                '}';
    }
}
