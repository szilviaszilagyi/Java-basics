import java.util.Scanner;

/**
 * (Órai) Írjunk programot, amely a beolvasott cikkszám (fixen 6 karakter hosszú), majd közvetlen utána lévő darabszám beviteli értéket fel
 * tudja dolgozni, és össze tudja adni őket, hogy összesen hány termék van. Figyelünk oda, hogy 0-s darabszám nem lehet, illetve az egyszerűség
 * kedvéért maximum 9 lehet a darabszám. Egy példa tétel: 1376367
 */
public class Task74_String_cikkszam {
    public static void main(String[] args) {
        String input = "";
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Add the ID with count: (7 length)");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("x")) {
                String countAsString = String.valueOf(input.charAt(6));
                int countAsInt = Integer.parseInt(countAsString);
                if (countAsInt == 0) {
                    System.out.println("Count is 0!");
                } else {
                    result = result + countAsInt;
                    System.out.println(countAsInt);
                }
            }

        } while (!input.equalsIgnoreCase("x"));

        System.out.println("Total count: " + result);
    }
}
