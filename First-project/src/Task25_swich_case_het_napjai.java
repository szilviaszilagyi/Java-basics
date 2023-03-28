import java.util.Random;
import java.util.Scanner;
/** Készítsétek el az hét napjai program switch case szerinti megvalósítását. Cseréljétek le az if/else if/else blokkokat switch case-ekkel. */
public class Task25_swich_case_het_napjai {
    public static void main(String[] args) {
        System.out.println("Whitch day is today? (1-7):");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(7) + 1;
        switch (dayOfWeek) {
            case 4, 5, 6:
                System.out.println("Italos nap van, ide a citromos sört!");
                break;
            case 1, 2, 3, 7:
                System.out.println("Ez nem a te napod, majd talán holnap!");
                break;
            default:
                System.out.println("Rerun and give number 1-7, please!");
        }
    }
}
