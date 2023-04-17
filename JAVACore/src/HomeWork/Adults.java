package HomeWork;

public class Adults implements Person{
    private int age;
    private  String name;

    private String presentType;

    public Adults(int age, String name) {
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

        if(presentType.equalsIgnoreCase("Home Made gift")) {
            System.out.println("Very impressed.");
            return "Very impressed.";
        } else if (presentType.equalsIgnoreCase("electric devices")) {
            System.out.println("Oh, I'm very happy for that!");
            return "Oh, I'm very happy for that!";
        }else{
            System.out.println("I think I'm not a kid!");
            return "I think I'm not a kid!";
        }

    }

    @Override
    public String toString() {
        return "Adults{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", presentType='" + presentType + '\'' +
                '}';
    }
}
