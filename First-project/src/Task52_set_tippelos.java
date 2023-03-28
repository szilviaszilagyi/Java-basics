import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * Írjatok egy tippelő játék programot. Töltsünk fel egy Set-et 3 darab random számmal. A számok 0 és 10 között lehetnek (0-val, de 10-el nem).
 * A felhasználótól kérjünk be számokat hasonlóan 0 és 10 között és vizsgáljuk meg benne van-e a Set-ben. Amennyiben igen, vegyük ki belőle.
 * Ha kiürült a Set, mert kivettünk belőle minden elemet, akkor vége a játéknak. Számoljuk, hogy hányszor kellett tippelnie a felhasználónak,
 * majd írjuk ki: “Gratulálunk, X kör kellett a sikerhez”. Ha eltalált egy számot a felhasználó a játék során, akkor írja ki a program,
 * hogy “Talált, még X szám, amit meg kell keresned”.
 */
public class Task52_set_tippelos {
    public static void main(String[] args) {
        Set<Integer> randomSet = new HashSet<>();
        Random randomGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        int round = 0;


        while (randomSet.size() != 3) {
            int randomNumber = randomGenerator.nextInt(10);
            randomSet.add(randomNumber);
        }
        System.out.println(randomSet);

        while (!randomSet.isEmpty()) {
            System.out.println("Give me " + randomSet.size() + " numbers (0-10).");
            int userInput = scanner.nextInt();
            round++;
            System.out.println(userInput);
            if (randomSet.contains(userInput)) {
                randomSet.remove(userInput);
                System.out.println("Correct! you have " + randomSet.size() + " number to find.");
            }
        }
        System.out.println("Congrat, you have " + round + " round for win!");
    }
}
