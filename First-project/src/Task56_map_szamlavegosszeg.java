import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Készítsetek egy számla végösszeg kalkulátor programot, amelybe be lehet rögzíteni az adott hónap különböző számláinak az összegét.
 * A program pedig összeadja őket és kiírja mennyit kell a családi kasszából fizetni összesen. Magát, hogy milyen számla az amit be kell fizetni,
 * az is kerüljön beolvasásra az összegekkel együtt (de külön beolvasással - 3 darab -). Az elemek kerüljenek Mapben mentésre,
 * majd összeadásra és kiíratása.
 * Amennyiben a felhasználó 0 ft-os számlát ír, úgy azt törölje ki a Map-ből a program
 */

public class Task56_map_szamlavegosszeg {
    public static void main(String[] args) {
        Map<String, Integer> billMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int totalAmount = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Give me the type of bill.");
            String billType = scanner.nextLine();
            System.out.println("Give me the amount of bill.");
            int billAmount = Integer.parseInt(scanner.nextLine());
            billMap.put(billType, billAmount);
            if (billAmount == 0) {
                billMap.remove(billType);
            }
            // totalAmount += billAmount;        ez ugyanaz, amint a lenti foreach
        }
        /** ez ugyanaz, mint a fenti for-ban az IF */
        for (String billname : billMap.keySet()) { /** .keyset() ez az összes kulcsot adja vissza, db szám nélkül */
            if(billMap.get(billname) ==0){
                billMap.remove(billname);
            }
            totalAmount += billMap.get(billname);  /** itt pedig a .get-tel elkérem az adott kulcshoz tartozó darabszámot */
        }

        System.out.println("Family bills: " + billMap);
        System.out.println("Amount of bills: " + totalAmount + " Ft");

    }
}
