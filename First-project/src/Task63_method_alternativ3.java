import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task63_method_alternativ3 {
    public static void main(String[] args) {
        List<Integer> triangle = getTriangleDataFromConsole();
        boolean result = isTriangleValid(triangle);
        showResultToTheUser(result);

        /** ez ugyanaz, mint a fenti 3 sor, de nem raktunk külön változókat, egybe tettük az egészet */
        showResultToTheUser(isTriangleValid(getTriangleDataFromConsole()));

    }

    public static List<Integer> getTriangleDataFromConsole() {
        System.out.println("Hello give me 3 number for a triangle:");
        Scanner scanner = new Scanner(System.in);
        int aSide = scanner.nextInt();
        int bSide = scanner.nextInt();
        int cSide = scanner.nextInt();
        List<Integer> sidesList = Arrays.asList(aSide,bSide,cSide);
        return sidesList;
    }

    public static boolean isTriangleValid(List<Integer> list) {
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
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
