import java.util.Scanner;
/** Fejlesszétek tovább a Háromszög alkalmazást (8as), hogy mindaddig ismételje a bekérést a felhasználótól, amíg nem ad neki helyes háromszög
 * oldal adatokat. */
public class Task21_ciklus_haromszog {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Hello give me 3 number for a triangle:");
            Scanner scanner = new Scanner(System.in);
            int aSide = scanner.nextInt();
            int bSide = scanner.nextInt();
            int cSide = scanner.nextInt();
            if ((aSide + bSide) > cSide && (bSide + cSide) > aSide && (aSide + cSide) > bSide) {
                System.out.println("You are a lucky person!");
                flag = false;
            } else {
                System.out.println("Please try again!");
            }
        }
    }
}
