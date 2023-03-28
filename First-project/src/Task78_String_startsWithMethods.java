import java.util.Scanner;

/**
 * Írjatok egy metódust, amely a paraméterként kapott szövegről, illetve a másik paraméterként kapott kifejezésről eldönti, hogy azzal a
 * kifejezéssel kezdődik-e az adott szöveg vagy sem. Amennyiben igen, térjen vissza true-val, egyébként false-al. Hogy ki tudjuk próbálni a metódust,
 * konzolról olvassunk be két értéket a main metódusban és hívjuk meg a készített metódust velük.
 * parancssori argumentumként olvassunk be két értéket a main metódusban és hívjuk meg a készített metódust velük.
 * Biztosítsátok be a metódust, hogy nem került a szövegbe szóköz.
 * Amennyiben a program indításakor panacssori argumentum van beállítva, akkor hazsnálja, azt, egyébént olvassa be az adatokat a konzolról
 */

public class Task78_String_startsWithMethods {
    public static void main(String[] args) {
        String string;
        String text;
        boolean result;

        if (args.length != 0) {
            string = args[0];
            text = args[1];
        } else {
            string = readStringFromConsole();
            text = readStringFromConsole();
        }
        result = isStrigStartWhithText(string, text);
        System.out.println(result);
    }

    public static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the string: ");
        return scanner.nextLine();
    }

    public static boolean isStrigStartWhithText(String first, String second) {
        first = first.trim();
        second = second.trim();
        if (first.startsWith(second)) {
            return true;
        } else {
            return false;
        }
    }
}
