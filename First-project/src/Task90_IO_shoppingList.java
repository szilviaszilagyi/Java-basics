import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Készítsétek el a classic bevásárlólista alkalmazás egyszerűsített változatát, amely beolvas a konzolról tételeket és darabszámokat
 * (pl.: “tej 3db”). Ezen tételeket elmenti egy String elemű listába. Készítsünk egy metódust, amely a paraméterül kapott String-et kiírja egy
 * shoppinglist.txt-be. (Tehát a listát át kell alakítani, összefűzni egy hosszú Stringgé egy elválasztó karakter, pl vessző használatával)
 */
public class
Task90_IO_shoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();
        System.out.println("Add your items to the shopping list.");
        String userInput = "";

        for (int i = 1; shoppingList.size() <= 5; i++) {
            System.out.println("Your item and number of item: ");
            userInput = scanner.nextLine();
            shoppingList.add(userInput);
        }
        String allOfItem = "";
        for (String item : shoppingList) {
            allOfItem += item + System.lineSeparator(); /** ez új sorba menti a lista elemeit */
        }
        saveShoppingListToFile(allOfItem);
    }

    public static void saveShoppingListToFile(String item) {
        System.out.println("I will save: " + System.lineSeparator() + item + "to file.");
        try {
            /** new File("src/resources/savedfiles").mkdirs(); új mappa létrehozása a projektben */
            Files.writeString(Paths.get("src/resources/shopping-list.txt"), item);
            System.out.println("File saved.");
        } catch (IOException e) {
            System.out.println("Couldn't save the following file: " + e.getMessage());
        }

    }
}
