import java.util.Scanner;

/**
 * (Órai) Írjunk programot, amely a beolvasott szövegben lecseréli a “legrosszabb” szót, a “legjobb”-ra.
 */
public class Task81_String_csereMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the text: ");
        String text = scanner.nextLine();
        System.out.println("Add the text what you looking for: ");
        String oldValue = scanner.nextLine();
        System.out.println("Add the new value for that: ");
        String newValue = scanner.nextLine();
        String result = text.replaceAll(oldValue, newValue);
        System.out.println(result);

        /** ezzel pl az összes szóközt el tudjuk távolítani ha szeretnénk .replaceAll(" ", ""); utasítással*/
    }
}
