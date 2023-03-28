import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**  Írjatok vendéglista programot. Házibulit szervezünk és tudjuk, hogy 11-en férnek el a lakásban. Azonban fontos, hogy egy vendéget
 * csak egyszer adhasson hozzá a felhasználó. */
public class Task40_list_vendeglista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guestList = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            System.out.println("Please add your guest name (max 11 person). You have: " + guestList.size() + " guest added already.");
            String userGuest = scanner.nextLine();
            if(guestList.contains(userGuest)){
                System.out.println("Give me another one!");
                i--;
            }else{
                guestList.add(userGuest);
            }
        }
        for (String guest:guestList) {
            System.out.print(guest + " ");
        }
    }
}
