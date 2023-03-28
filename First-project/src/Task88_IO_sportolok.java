import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Készítsetek programot, amely beolvas egy híres sportolóat tartalmazó fájlt, majd megvizsgálja, hogy a parancssori argumentumként megadott
 * sportolót tartalmazza-e. Ha igen, írja ki hogy “It’s in the file”, egyébként pedig írja ki, hogy “No luck” a konzolra.
 */
public class Task88_IO_sportolok {
    public static void main(String[] args) {
        List<String> athletesList = new ArrayList<>();
        try {
            athletesList = Files.readAllLines(Path.of("src/resources/famous-athletes.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(athletesList);
        try {
            if (athletesList.contains(args[0])) {
                System.out.println("It’s in the file.");
            } else {
                System.out.println("No luck! :(");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no program arguments added");
        }
    }
}
