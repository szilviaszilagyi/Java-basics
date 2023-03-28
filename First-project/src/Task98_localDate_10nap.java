import java.time.LocalDate;

/**
 * Készítsetek egy programot amely kiírja az aktuális napot és még 10 darab napot, melyek az ezt követő hónapban vannak. (Tehát minden egyes
 * kiírt nap pontosan egy hónappal későbbi az előző dátumnál)
 */
public class Task98_localDate_10nap {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate nextDate = now;
        for (int i = 1; i <= 10; i++) {
            //solution 1
            System.out.println(now.plusMonths(i));
            //solution2
            System.out.println(nextDate.plusMonths(i));
        }


    }
}
