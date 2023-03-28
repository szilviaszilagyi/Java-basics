import java.util.Random;
import java.util.Scanner;
/** kő-papír-olló feladat metódusítása */
public class Task65_method_koPapirOllo {
    public static void main(String[] args) {
        String userHand = getComputerValueFromUser();
        String computerHand = getComputerHandFromRandom();
        fight(userHand,computerHand);
    }
    public static String getComputerValueFromUser(){
        System.out.println("Guess one: rock, paper, scissors");
        Scanner scanner = new Scanner(System.in);
        String userHand = scanner.nextLine();
        return userHand;
    }

    public static String getComputerHandFromRandom(){
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
        return computerHand;
    }
    public static void fight(String userHand, String computerHand){
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

