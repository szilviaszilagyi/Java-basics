import java.util.Random;
import java.util.Scanner;

/** (Órai) Írjunk programot, amely beolvassa hogy hányadik nap van a héten (1-7-ig), majd egy változóban tárolja azt. A hét napjai közül kitüntetett
 * nap a csütörtök, péntek, szombat. Ha a változó értéke ezen napok valamelyike, akkor írja ki a program hogy “Italos nap van, ide a citromos sört
 * de gyorsan”. Egyébként írja ki, hogy “Ez nem a Te napod, majd talán holnap”. a sorszám beolvasás történjen console-ról */
public class Task7_het_napjai_IF_feltetel_logikai_operatorokkal {
    public static void main(String[] args) {
        System.out.println("Whitch day is today? (1-7):");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(7);
        if (dayOfWeek == 5 || dayOfWeek == 4 || dayOfWeek == 6){
            System.out.println("Italos nap van, ide a citromos sört!");
        }else{
            System.out.println("Ez nem a te napod, majd talán holnap!");
        }

    }
}
