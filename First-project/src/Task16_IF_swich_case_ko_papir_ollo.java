import java.util.Random;
import java.util.Scanner;
/** (Órai) Írjunk kő-papír-olló játékot. A program minden indítás után válasszon egy random eszközt, majd vesse össze a felhasználó által megadott
 * eszközzel. Miután kiértékelte, hogy ki nyert írja ki, hogy mi volt nála és hogy ki nyerte a játékot. Figyeljünk rá, hogy a játékos csak a
 * kő, papír, olló eszközöket választhassa. Ellenkező esetben írjunk ki egy figyelmeztető üzenetet. */
public class Task16_IF_swich_case_ko_papir_ollo {
    public static void main(String[] args) {
        System.out.println("Guess one: rock, paper, scissors");
        Scanner scanner = new Scanner(System.in);
        String userHand = scanner.nextLine();
        Random randomGenerator = new Random();
        String computerHand;
        int computerGuess = randomGenerator.nextInt(3);
        switch (computerGuess) {
            case 0:
                computerHand = "rock";
                break;
            case 1:
                computerHand = "paper";
                break;
            default:
                computerHand = "scissors";
        }
        System.out.println(computerHand);
        System.out.println(userHand);
        if (!userHand.equals("rock") && !userHand.equals("paper") &&  !userHand.equals("scissors")) {
            System.out.println("Bad choice! Try again!");
        } else if ((userHand.equals(computerHand))) {
            System.out.println("Draw");
        } else if (userHand.equals("rock") && computerHand.equals("scissors")) {
            System.out.println("You win!");
        } else if (userHand.equals("paper") && computerHand.equals("rock")) {
            System.out.println("You win!");
        } else if (userHand.equals("scissors") && computerHand.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer win!");
        }


    }
}
