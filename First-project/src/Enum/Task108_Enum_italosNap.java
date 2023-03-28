package Enum;

import java.time.DayOfWeek;
import java.time.LocalDate;

/** (Órai) Készítsünk egy alkalmazást, mely az aktuális napról eldönti, hogy az italos nap-e vagy sem. A napok vizsgálatához használjunk switch-case-t.*/
public class Task108_Enum_italosNap {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek actualDayOfWeek = today.getDayOfWeek();

        switch (actualDayOfWeek){
            case MONDAY, TUESDAY, WEDNESDAY, SUNDAY -> System.out.println(CanWeDrink.NO_LUCK);
            default -> System.out.println(CanWeDrink.DRINK_DAY);


        }


    }

    enum CanWeDrink{
        NO_LUCK, DRINK_DAY
    }


}
