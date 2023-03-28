import java.util.Random;
import java.util.Scanner;

/** (Órai) Írjunk Fej vagy írás programot, amely kérdezze meg, hogy mire tippelünk, mit választunk. Ezután sorsolja ki, hogy az érme melyik
 * oldala kerül felülre. Attól függően, hogy eltaláltuk, vagy hibáztunk írja ki az eredményt.*/
public class Task4_fej_v_iras_IF_feltetel {
    public static void main(String[] args){
        System.out.println("Hy there! I wanna play with you");
        System.out.println("Please give me head/tail:");
        Scanner scanner = new Scanner(System.in);
        String userChoose = scanner.nextLine();
        String computerChoose;

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(2); // bound azért 2, mert 0,1 között oszt random számot, a 2 már nincs benne
        if(randomNumber == 0){
             computerChoose = "head";
        }else{
            computerChoose = "tail";
        }
        if(userChoose.equals(computerChoose)){ //Stringeket és referencia adattípusokat a .equals() operátorral hasonlítjuk össze
            System.out.println("You win!");
        }else{
            System.out.println("You lose!");
        }

    }
}
