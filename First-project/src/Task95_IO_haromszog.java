import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Készítsetek egy olyan alkalmazást, amely egy fájlból felolvas különböző háromszögek lehetséges értékeit. Minden egyes sor egy lehetséges
 * háromszög oldalait tartalmazza. (triangleExamples.txt). A program végig iterál a listán ami a fájlban van és minden egyes sorról eldönti hogy a
 * háromszög szerkeszthető-e és ki is írja a képernyőre. Minimum minden olyan esetet vegyetek fel mint példa háromszög, amire szerintetek szükség van,
 * hogy megfelelően le legyen tesztelve a logika. Az eredmény kerüljön lementésre egy (triangeResults.log) fájlba.
 */

public class Task95_IO_haromszog {
    public static void main(String[] args) {
        List<String> triangles = getListFromText();
        String result = "";
        for (String lines : triangles) {
            String[] rowArray = lines.split(",");
            try {
                double aSide = Double.parseDouble(rowArray[0]);
                double bSide = Double.parseDouble(rowArray[1]);
                double cSide = Double.parseDouble(rowArray[2]);
                result += getResult(aSide, bSide, cSide);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Nem megfelelő mennyiségű adat");
                result += "Nem megfelelő mennyiségű adat" + System.lineSeparator();
            }catch (NumberFormatException e){
                System.out.println("Helytelen adattípus.");
                result += "Helytelen adattípus." + System.lineSeparator();
            }

        }
        resultsOfFile(result);
    }

    public static List<String> getListFromText() {
        List<String> fileList = new ArrayList<>();
        try {
            fileList = Files.readAllLines(Paths.get("src/resources/triangleExamples.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileList;
    }
    public static void resultsOfFile(String results){
        try {
            Files.writeString(Paths.get("src/resources/triangeResults.log"), results);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getResult(double a, double b, double c){
        String result = "";
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("negativ vagy nem létező oldal");
            result += "negativ vagy nem létező oldal" + System.lineSeparator();
        } else if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("ez valóban egy háromszög");
            result += "ez valóban egy háromszög" + System.lineSeparator();
        } else {
            System.out.println("ez nem egy háromszög");
            result += "ez nem egy háromszög" + System.lineSeparator();
        }
        return result;
    }
}
