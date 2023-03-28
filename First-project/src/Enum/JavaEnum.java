package Enum;

public class JavaEnum {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        System.out.println(Level.MEDIUM);
        for (Level element:Level.values()){ /** Level enum bejárása és értékeinek kiíratása */
            System.out.println(element);
        }
        System.out.println(Days.FRIDAY);
    }
}
