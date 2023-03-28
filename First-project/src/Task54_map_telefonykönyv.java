import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/** Írjatok egy telefonkönyv programot, amely a konzolról a felhasználó által megadott és beolvasott 5 darab név-hez a hozzá tartozó telefonszámot
 * lementi egy HashMap-ben. Ha már szerepelt a név, írja, felül a névhez tartozó számot, viszont ha már szereplő teleszonszámot adunk hozzá,
 * figyelmeztető üzenetet kell kapjunk, hogy ez a szám már létezik. */
public class Task54_map_telefonykönyv {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Give me a name of contact.");
            String name = scanner.nextLine();
            System.out.println("Give me a phone number of contact.");
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            if(phoneBook.containsKey(name)){
                System.out.println("Phone number is updated.");
            }
            if(phoneBook.containsValue(phoneNumber)){
                System.out.println("Phone number is exist with someone else.");
            }
            phoneBook.put(name, phoneNumber);
        }
        System.out.println(phoneBook);

    }
}
