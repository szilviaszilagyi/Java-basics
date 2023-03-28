import java.util.Scanner;

public class Task63_method_alternativ2 {

    public static void main(String[] args) {
        int[] triangle = getTriangleDataFromConsole();
        boolean result = isTriangleValid(triangle);
        showResultToTheUser(result);

    }

    public static int[] getTriangleDataFromConsole() {
        System.out.println("Hello give me 3 number for a triangle:");
        Scanner scanner = new Scanner(System.in);
        int aSide = scanner.nextInt();
        int bSide = scanner.nextInt();
        int cSide = scanner.nextInt();
        int[] sidesArrays = {aSide, bSide, cSide};
        return sidesArrays;
    }

    public static boolean isTriangleValid(int[] array) {
        int a = array[0];
        int b = array[1];
        int c = array[2];
        boolean isValid;
        if (a + b >= c && b + c >= a && a + c >= b) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {
            System.out.println("Triangle!");
        } else {
            System.out.println("Not a triangle.");
        }
    }

}

