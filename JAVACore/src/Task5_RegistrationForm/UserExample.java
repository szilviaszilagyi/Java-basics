package Task5_RegistrationForm;

import java.util.Scanner;

/**
 * (Órai) Regisztrációs lap. Egy közösségi oldal regisztrációs űrlapját kell elkészíteni. Készíts egy POJO-t amely magába foglalja a következő információkat a felhasználóról:
 * email
 * név
 * születési idő
 * telefonszám
 * munkahely
 * A sikeres regisztrációhoz kötelező megadni az email címet, nevet, illetve a születési dátumot. A többi adatot opcionálisan adhatja meg a felhasználó.
 * Készíts olyan osztályt, amely rendelkezik a megfelelő konstruktorokkal, illetve getter és setter metódusokkal. Ha egy felhasználó nem rendelkezik a megfelelő adatokkal, a program írjon ki hibaüzentet.
 * Abban az esetben, ha a felhasználó kitöltötte a kötelező mezőket, a program írja ki az összes megadott adatot.
 */

public class UserExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your e-mail address:");
        String email = scanner.nextLine();
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your birth date:");
        String birthday = scanner.nextLine();
        System.out.println("Please enter your workplace:");
        String workplace = scanner.nextLine();
        System.out.println("Please enter your phone number:");
        String phoneNumber = scanner.nextLine();

        if (email.isEmpty() || name.isEmpty() || birthday.isEmpty()) {
            System.out.println("The email, name, and birth date must not be empty!");
            System.exit(0); /** ez megszakítja a program futását, nem hozza létre a példányt, erre akár a return; is jó lenne */
        }

        User testElek = new User(email, name, birthday);
        if (!phoneNumber.isEmpty()) {
            testElek.setPhoneNumber(Integer.parseInt(phoneNumber));
        }
        if (!workplace.equals("")) {  /** lehetne még if(workplace.length() > 0) */
            testElek.setCompany(workplace);
        }
        System.out.println(testElek);
    }
}