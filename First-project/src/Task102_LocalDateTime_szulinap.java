import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** (Órai) Hozzunk létre egy LocalDateTime típusú birthday változót, melyben elmentjünk a születésnapunkat dátum + idő formátumban. Írjunk
 * programot, mely kiírja hogy a következő 5 évben milyen napra fog esni a születésnapunk*/
public class Task102_LocalDateTime_szulinap {
    public static void main(String[] args) {
        LocalDateTime myBirthday = LocalDateTime.parse("1988-09-22T14:30");
        LocalDateTime birthdayOtherYears = LocalDateTime.of(LocalDateTime.now().getYear(),myBirthday.getMonth(),myBirthday.getDayOfMonth(),
                myBirthday.getHour(), myBirthday.getMinute());

        for(int i = 0; i < 6; i++) {
            System.out.println(birthdayOtherYears.getDayOfWeek());
            birthdayOtherYears = birthdayOtherYears.plusYears(1);
        }
    }


}
