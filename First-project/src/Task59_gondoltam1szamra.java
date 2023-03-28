import java.util.Random;
import java.util.Scanner;

public class Task59_gondoltam1szamra {
    public static void main(String[] args) {
        System.out.println("Gondoltam egy számra 0-10 között. Tippelj, mire gondoltam! Három lehetőséged van eltalálni a számot! :)");
        Random randomGenerator = new Random();
        int myNumber = 0;
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int tip = 0;
        boolean flag = true;
        int i = 0;

        do {
            myNumber = randomGenerator.nextInt(10);
            System.out.println(myNumber);
            while (flag && i < 3) {
                System.out.println("Mi a tipped?");
                int userInput = Integer.parseInt(scanner.nextLine());
                if (myNumber == userInput) {
                    System.out.println("Nyertél!");
                    flag = false;
                } else {
                    System.out.println("Sajnos nem talált!");
                }
                tip++;
                i++;
            }
            System.out.println("Szeretnél még egy kört? (I/N)");
            answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("I")) {
                System.out.println("Köszi, hogy játszottál!");
            } else {
                flag = true;
                i = 0;
            }
        } while (answer.equalsIgnoreCase("I"));
        System.out.println("Összesen " + tip + " tippre volt szükséged, hogy eltaláld.");
        if (tip < 2) {
            System.out.println("Zseni vagy!");
        } else if (tip <= 3) {
            System.out.println("Nem is rossz!");
        } else {
            System.out.println("Hát ezt még gyakorolni kell!");
        }

    }
}
