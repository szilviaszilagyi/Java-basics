import java.util.Scanner;
/** oldjuk meg, hogy a getTriangleDataFromConsole() adjon vissza nekünk értéket. */
public class Task63_method_alternative {

    public static void main(String[] args) {
        int aSide = getTriangleDataFromConsole();
        int bSide = getTriangleDataFromConsole();
        int cSide = getTriangleDataFromConsole();
        boolean result = isTriangleValid(aSide, bSide, cSide);
        showResultToTheUser(result);

    }

    public static int getTriangleDataFromConsole() {
        System.out.println("Hello give me 3 number for a triangle:");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        return side;
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
