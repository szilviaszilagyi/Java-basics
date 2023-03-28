package Task103_LocalDateTime_osztaly;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Készítsetek programot, mely képes arra, hogy a console-ról Stringként beolvassa az adataitokat és letárolja egy Person nevű DOJO osztályban azokat.
 * Minimum keresztnév, vezetéknév, születési hely, (String-ként) és születési idő (LocalDate-ként), valamint kedvenc filmek listája (List<String>-ként),
 * boldog-e (boolean), testmagasság (int-ként) kerüljön letárolásra private osztályváltozók segítségével. Ezen, példányosításkor kötelezően megadandó
 * attribútumok pedig konstruktor segítségével kapjanak értéket. E mellett adjatok hozzá legalább 2 tetszőleges opcionális attribútumot az osztályhoz,
 * melyet példányosítást követően a setter metódusokkal (ha akarunk), be lehet állítani. Készítsetek egy toString metódust is, mely visszaadja az
 * összes beállított tulajdonságot, és írassátok ki vele a konzolra a lementett adatokat.
 * Készüljön el a fenti követelmény.
 *
 * Refactoráljátok úgy a kódot, hogy az adatok beolvasása egy metódusban történik, mely a String-ként beolvasott elemeket egy List-be pakolja és a
 * metódus ezzel a listával tér vissza. A példányosításkor pedig a konstruktor ezen lista elemeit kapja meg és kerüljön neki átadásra.
 * Pl.: getUserInputList()
 *
 * Refaktoráljátok úgy a kódot, hogy a példányosítás is külön metódusban történik, amely medódus megkapja paraméterként a beolvasott értékeket
 * tartalmazó listát, elvégzi a példányosítást és visszatérési értéke ez a létrehozott Person típusú példány. Pl.: getPerson() A main metódusban így
 * a két metódushívás szükségeltetik, illetve egy utasítás, mely kiírja ezt a létrehozott példányt a konzolra.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Give me your second name:");
        String secondName = scanner.nextLine();

        System.out.println("Give me your place of birth");
        String placeOfBirth = scanner.nextLine();

        System.out.println("Give me your date of birth (YYYY-MM-DD)");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.println("Give me 3 favorite movies (separated by ','");
        String favMovies = scanner.nextLine();
        List<String> moviesInput = Arrays.asList(favMovies.split(","));

        System.out.println("Are you happy? (Y/N");
        String isHappy = scanner.nextLine();
        boolean happy;
        if(isHappy.equalsIgnoreCase("Y")) {
            happy = true;
        }else {
            happy = false;
        }

        System.out.println("How tall are you?");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.println("Your gender: (optional)");
        String gender = scanner.nextLine();

        System.out.println("Number of yearly blackaout: (optional)");
        int numberOfYearlyBlackout;
        try{
            numberOfYearlyBlackout = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            numberOfYearlyBlackout = 0;
        }

        Person me = new Person(firstName,secondName,placeOfBirth, dateOfBirth, moviesInput,happy,height );
        me.setGender(gender);
        me.setNumberOfYearlyBlackout(numberOfYearlyBlackout);
        System.out.println(me);

        System.out.println("-------------------version 2----------------------------");
        List<String> meList = MeMethods.getUserInputList();
        System.out.println(MeMethods.getPerson(meList));


    }


}
