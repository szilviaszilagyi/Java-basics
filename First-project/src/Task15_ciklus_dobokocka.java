import java.util.Random;
import java.util.Scanner;

/**(Órai) Írjunk programot, amely egy dobókocka szerencsejáték program. A játékot 2 játékos játsza, neveiket kérje be a program.
 * A játékosok felváltva dobnak. A játék 3+1 fordulóból áll. A 4. Forduló dupla pontért megy.Az a játékos nyer, aki a legtöbb pontot összegyűjti.
 * (Amennyit dob a játékos az egyes fordulókban, annyival több van neki.) */
public class Task15_ciklus_dobokocka {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        System.out.println("What's your name?");
        String player2 = scanner.nextLine();
        Random randomGenerator = new Random();
        int player1Total = 0;
        int player2Total = 0;
        int circle = 0;
        while (circle <= 3) {
            int player1ActualNumber = randomGenerator.nextInt(6) + 1;
            int player2ActualNumber = randomGenerator.nextInt(6) + 1;
            if (circle == 4) {
                player1Total = player1Total + player1ActualNumber * 2;
                player2Total = player2Total + player2ActualNumber * 2;
            } else {
                player1Total = player1Total + player1ActualNumber;
                player2Total = player2Total + player2ActualNumber;
            }
            circle++;
        }
        if (player1Total > player2Total) {
            System.out.println("The winner is: " + player1);
        } else if (player2Total > player1Total) {
            System.out.println("The winner is: " + player2);
        } else {
            System.out.println("The result is a draw.");
        }

    }
}
