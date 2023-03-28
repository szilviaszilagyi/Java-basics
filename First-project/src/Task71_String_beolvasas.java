import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Készítsetek egy alkalmazást ami mindaddig beolvas egy szöveget a konzolról, amíg x-et nem kap. Minden értéket amit beolvasott mentsünk
 * el egy List-be, de már csak a bevitt szöveg kisbetűs változatát! Az x, ne legyen a lista része!
 */
public class Task71_String_beolvasas {
    public static void main(String[] args) {

        List<String> myList = getLowerCaseList();
        System.out.println(myList);

        /**String consoleInput = "";
         List<String> userInput = new ArrayList<>();
         do {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please write anything and press ENTER. If you write X then execution ends.");
         consoleInput = scanner.nextLine();
         userInput.add(consoleInput.toLowerCase());

         }while(!consoleInput.equals("X"));
         System.out.println(userInput); */
    }

    public static List<String> getLowerCaseList() {
        String consoleInput = "";
        List<String> userInput = new ArrayList<>();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please write anything and press ENTER. If you write X then execution ends.");
            consoleInput = scanner.nextLine();
            if (!consoleInput.equalsIgnoreCase("X")) {
                userInput.add(consoleInput.toLowerCase());
            }
        } while (!consoleInput.equalsIgnoreCase("X"));
        return userInput;
    }
}
