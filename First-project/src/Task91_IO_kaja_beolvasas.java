import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Készítsetek egy élelmiszerkészlet alkalmazást. Tegyünk fel, hogy van egy fájl, ami tartalmazza, hogy éppen milyen típusú élelmiszerből
 * mennyi van otthon és hogy mennyi az ajánlott mennyiség. A fájl hasonlóan néz ki a ehhez (actual-food-set.csv):
 * Name,Amount, Required Amount
 * Coffee, 17, 25
 * Milk, 0, 3
 * Cola, 1, 2
 * Orange, 4, 5
 * Oat flakes, 2, 4
 * A feladat, hogy készítsünk egy programot, ami értesít minket arról, hogyha valamelyik komponensből 50%, vagy annál kevesebb van, és szól, hogy
 * vegyünk belőle annyit amennyi hiányzik az ajánlott mennyiség eléréséhez.
 */
public class Task91_IO_kaja_beolvasas {
    public static void main(String[] args) {
        List<String> foodList = getFoodStateList();
        foodList.remove(0); /** a lista első sorát eltávolítottuk, mert nincs rá szükségünk */


        for (String foodState : foodList) {
            String[] rowArray = foodState.split(",");
            String name = rowArray[0].trim();  /** levágtuk a szőközöket, hogy ne zavarjanak */
            int amount = Integer.parseInt(rowArray[1].trim());
            int requiredAmount = Integer.parseInt(rowArray[2].trim());
            if (amount <= requiredAmount / 2) {
                System.out.println("Your " + name + " amount less or equal than a required 50%. Please buy: " + (requiredAmount - amount) + " "
                        + name + ".");
            }
        }

    }

    public static List<String> getFoodStateList() {
        List<String> foodStateList;
        try {
            foodStateList = Files.readAllLines(Paths.get("src/resources/actual-food-set.csv"));
            System.out.println(foodStateList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return foodStateList;
    }
}
