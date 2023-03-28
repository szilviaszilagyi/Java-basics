import java.util.Scanner;

/** Készítsetek programot, amely a felhasználótól vár 3 számot, amely számokról el tudja dönteni, hogy lehet-e egy háromszög 3 oldala, vagyis
 * szerkeszthető-e a háromszög. Ha lehet, akkor írja ki: “You are a lucky person.” (Pl.: 2,3,4-re) Egyébként, írja ki: “Please, try again.”
 * (Pl.: 1,2,4-re) */
public class Task8_haromszog_IF_feltetel_logikai_operatorokkal {
    public static void main(String[] args) {
        System.out.println("Hello give me 3 number for a triangle:");
        Scanner scanner = new Scanner(System.in);
        int aSide = scanner.nextInt();
        int bSide = scanner.nextInt();
        int cSide = scanner.nextInt();
        if (aSide + bSide >= cSide && bSide + cSide >= aSide && aSide + cSide >= bSide) {
            System.out.println("You are a lucky person!");
        } else {
            System.out.println("Please try again!");
        }
    }
}
