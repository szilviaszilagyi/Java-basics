import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/** Írjatok vendéglista programot, amit a felhasználó tud feltölteni. Házibulit szervezünk és tudjuk, hogy 11-en férnek el a lakásban.
 * Tároljuk a vendégeket Set-ben, hogy ne kelljen arra figyelni, hogy valaki benne van-e a listában már vagy sem. Viszont oldjuk meg, hogy addig
 * kérje inputként a program a vendégeket, amíg fel nem töltjük a 11 helyet A felhasználó a program indításakor dönthesse el, hány vendéget szeretne
 * meghívni */
public class Task50_set_vendeglista {
    public static void main(String[] args) {
        Set<String> guests = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me how many guests you wan to invite?");
        int numberOfGuests = Integer.parseInt(scanner.nextLine());

        while (guests.size() < numberOfGuests) {
            System.out.println("Please add your guest name. You have: " + guests.size() + " guest added already.");
            String userGuest = scanner.nextLine();
            if (guests.contains(userGuest)) {
                System.out.println("Give me another one!");
            }
            guests.add(userGuest);
        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
