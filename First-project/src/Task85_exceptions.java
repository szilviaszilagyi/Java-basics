import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Készítsetek egy metódust (getNumberFromConsole()), amely beolvas egy számot a konzolról, a nextInt() metódus segítségével. Próbáljátok ki,
 * milyen exception érkezik, ha futtatáskor szám helyett valami szöveget írtuk. Ha megvan az exception neve, akkor írjatok rá egy try-catch
 * blokkot, amely-ben elkapjátok ezt az exceptiont és kiírjátok a konzolra az alábbi üzenetet: “You added a string, only number please!”
 * Dobjátok tovább a metódusban keletkező lehetséges exceptiont, és a hívás helyén a main-ben kapjátok el
 * (extra) mindaddig kérjen be a felhasználótól adatot, amíg számot nem ad
 */
public class Task85_exceptions {
    public static void main(String[] args) {
        int result = 0;
        boolean requestInput = true;
        while (requestInput) {
            try {
                result = getNumberFromConsole();
                requestInput = false;
            } catch (InputMismatchException exception) {
                System.out.println("You added a string, only number please!");
                requestInput = true;
            }
            if (result != 0) {
                System.out.println(result);
            }
        }

    }

    public static int getNumberFromConsole() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        return number;
    }
}
