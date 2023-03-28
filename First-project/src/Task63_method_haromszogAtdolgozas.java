import java.util.Scanner;

/**
 * (Órai) A háromszög eldöntős programunk dolgozzuk át, hogy külön metódus legyen az oldal beolvasás (getTriangleDataFromConsole() ),
 * külön metódus a háromszög szerkeszthetősége ( isTriangeValid(aoldal,boldal,coldal) )és külön az eredmény String kiíratása
 * (showResultToTheUser(result) )
 */
public class Task63_method_haromszogAtdolgozas {
    /** osztály szintű változók, static kulcsszó kell, hogy az osztályban mindenhol látszódjon */
    static int aSide;

    static int bSide;
    static int cSide;

    public static void main(String[] args) {
        getTriangleDataFromConsole();
        boolean result = isTriangleValid(aSide, bSide, cSide);
        showResultToTheUser(result);

    }

    public static void getTriangleDataFromConsole() {
        System.out.println("Hello give me 3 number for a triangle:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a side:");
        aSide = scanner.nextInt();
        System.out.println("b side:");
        bSide = scanner.nextInt();
        System.out.println("c side:");
        cSide = scanner.nextInt();
    }

    public static boolean isTriangleValid(int a, int b, int c) {
        boolean isValid;
        if (a + b >= c && b + c >= a && a + c >= b) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    public static void showResultToTheUser(boolean result){
        if(result){
            System.out.println("Triangle!");
        }else{
            System.out.println("Not a triangle.");
        }
    }

}
