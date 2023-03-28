package Enum;
/**
 * (Órai) Készítsünk egy alkalmazást, mely előre definiált vizsgához tartozó értékelési PASSED, FAILED értékeket hoz létre enumként. A program
 * a konzolról bekéri a felhasználótól az elért pontszámot, és a parancssori argumentumként megadott köszöbérték vagy a feletti érték esetén kiírja
 * a felhasználónak, hogy PASSED, egyéb esetben pedig hogy FAILED.
 * Finomhangoljuk az alkalmazásunk tovább úgy, hogy az enum értékei esetén egy konszolidáltabb, nem csak az enum értékét tartalmazó szöveget írunk
 * ki a képernyőre.
 */

import java.util.Scanner;

public class Task106_Enum {
    public static void main(String[] args) {
        int boundaryValue = Integer.parseInt(args[0]);
        System.out.println("Please add your points:");
        Scanner scanner = new Scanner(System.in);
        int userPoints = scanner.nextInt();

        System.out.print("Your result: ");
        if (userPoints >= boundaryValue) {
            System.out.println(Evaluation.PASSED);
        } else {
            System.out.println(Evaluation.FAILD);
        }
    }
}
