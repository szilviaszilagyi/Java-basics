package Task103_LocalDateTime_osztaly;

/** * Refaktoráljátok úgy a kódot, hogy a példányosítás is külön metódusban történik, amely medódus megkapja paraméterként a beolvasott értékeket
 * tartalmazó listát, elvégzi a példányosítást és visszatérési értéke ez a létrehozott Person típusú példány. Pl.: getPerson() A main metódusban így
 * a két metódushívás szükségeltetik, illetve egy utasítás, mely kiírja ezt a létrehozott példányt a konzolra.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeMethods {
     public static List<String> getUserInputList(){
         List<String> list = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Give me your first name:");
         String firstName = scanner.nextLine();
         list.add(firstName);

         System.out.println("Give me your second name:");
         String secondName = scanner.nextLine();
         list.add(secondName);

         System.out.println("Give me your place of birth");
         String placeOfBirth = scanner.nextLine();
         list.add(placeOfBirth);

         System.out.println("Give me your date of birth (YYYY-MM-DD)");
         String dateOfBirth = scanner.nextLine();
         list.add(dateOfBirth);

         System.out.println("Give me 3 favorite movies (separated by ','");
         String favMovies = scanner.nextLine();
         list.add(favMovies);

         System.out.println("Are you happy? (Y/N)");
         String isHappy = scanner.nextLine();
          list.add(isHappy);

         System.out.println("How tall are you?");
         String height = scanner.nextLine();
         list.add(height);

         System.out.println("Your gender: (optional)");
         String gender = scanner.nextLine();
         list.add(gender);

         System.out.println("Number of yearly blackaout: (optional)");
         String numberOfYearlyBlackout = scanner.nextLine();
         list.add(numberOfYearlyBlackout);

         return list;
     }

     public static Me getPerson(List<String> list){
        Me me = new Me(list.get(0),list.get(1),list.get(2), list.get(3), list.get(4), list.get(5), list.get(6));
         me.setGender(list.get(7));
         me.setNumberOfYearlyBlackout(list.get(8));
         return me;
     }

}
