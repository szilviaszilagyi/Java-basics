import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Írjatok családbarát metódust, amely egy, a metódusban előre létrehozott listában tárolt szavazat megkeres egyesével a paraméterként
 * kapott szövegben.Amennyiben megtalálja, cserélje ezeket “*” karakterekre. A csillagozott rész legyen pont annyi karakter, amennyi az eredeti szó
 * volt
 */

public class Task82_String_replaceMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a text: ");
        String text = scanner.nextLine();
        System.out.println(getCancelSwearingInText(text));
        // Elmentem abba a kaki boltba és találkoztam azzal a macskapisi bácsival, akinél volt egy kutyagumi.

    }

    public static String getCancelSwearingInText(String text) {
        List<String> words = Arrays.asList("kaki", "macskapisi", "kutyagumi", "libafos");
        for (String word : words) {
            int starCount = word.length();
            String stars = "";
            for (int i = 0; i < starCount; i++) {
                stars = stars + "*";
            }
            text = text.replaceAll(word, stars);
        }
        return text;
    }
}
