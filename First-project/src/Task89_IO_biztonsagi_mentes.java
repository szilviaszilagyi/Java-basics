import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * (Órai) Írjunk egy alkalmazást, amely biztonsági mentést készít a használt Program arguments-ekről. Ehhez készítsünk egy metódust, amely
 * elvégzi a fájlba írást nekünk. A fájl neve legyen used_arguments.txt.
 */
public class Task89_IO_biztonsagi_mentes {
    public static void main(String[] args) {
        saveArgumentsToFile(args);
    }

    public static void saveArgumentsToFile(String[] usedArgsArray) {
        writeToFile("", false);
        for (int i = 0; i < usedArgsArray.length; i++) {
            writeToFile(usedArgsArray[i] + " ", true);
        }
    }

    public static void writeToFile(String content, boolean append) {
        try {
            if (append) {
                Files.writeString(Path.of("src/resources/used_arguments.txt"), content, StandardOpenOption.APPEND);
            } else {
                Files.writeString(Path.of("src/resources/used_arguments.txt"), content);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong the arguments saving: " + e.getMessage());
        }
    }
}
