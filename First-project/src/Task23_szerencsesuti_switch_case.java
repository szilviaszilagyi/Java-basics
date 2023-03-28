import java.util.Random;
import java.util.Scanner;

public class Task23_szerencsesuti_switch_case {
    public static void main(String[] args) {
        String answer;
        System.out.println("Szia! Kapni fogsz egy jókívánságot!");
        do {
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(5);

            switch (randomNumber) {
                case 0:
                    System.out.println("Minden nap új nap!");
                    break;
                case 1:
                    System.out.println("Ez a te napod!");
                    break;
                case 2:
                    System.out.println("A legjobb dolgok ingyen vannak!");
                    break;
                case 3:
                    System.out.println("Éld meg a pillanatot");
                    break;
                case 4:
                    System.out.println("Több ilyen Coelho-s hülyeség nem jut eszembe!");
                    break;
                default:
                    System.out.println("Nem lehetságes opció."); /** ez sose fut le */
            }
            System.out.println("Szeretnél még jókívánságokat? (I/N)");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (answer.equals("I")) {
                System.out.println("Ez az!");
            } else {
                System.out.println("Sajnálom, hogy nem tartasz velem :(");
            }
        } while (answer.equals("I"));
    }
}
