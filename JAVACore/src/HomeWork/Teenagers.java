package HomeWork;

public class Teenagers implements Person{
    private int age;
    private  String name;
    private String presentType;

    public Teenagers(int age, String name) {
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
            System.out.println("Nice but old fashioned!");
            return "Nice but old fashioned!";
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
        return "Teenagers{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", presentType='" + presentType + '\'' +
                '}';
    }
}
