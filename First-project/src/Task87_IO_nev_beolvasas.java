import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Órai) Adott egy neveket tartalmazó fájl. Készítsünk egy programot, ami beolvassa annak tartalmát és megvizsgálja, hogy a console-ról
 * beolvasott név benne van-e.
 */
public class Task87_IO_nev_beolvasas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a name to search.");
        String nameToFind = scanner.nextLine();
        List<String> namesList = new ArrayList<>();
        try {
            namesList = Files.readAllLines(Path.of("src/resources/names.txt"));
            System.out.println(namesList);
        } catch (IOException e) {
            System.out.println("I can't find the file that you request.");
        }
        System.out.println("File data: " + namesList);

        if (namesList.contains(nameToFind)) {
            System.out.println("Hurray! I found a name in the list!");
        } else {
            System.out.println("The name was not in the list.");
        }

    }
}
