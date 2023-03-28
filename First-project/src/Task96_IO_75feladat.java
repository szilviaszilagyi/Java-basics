import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Készítsünk egy reportoló alkalmazást, ami a 75-s feladat megoldásán alapul. Tegyük fel, hogy a teszt futások eredményei egy
 * testexecutionresults.txt-ben vannak tárolva. Olvassuk be a fájl (minimum 20 sor szerepeljen benne), dolgozzuk fel és az eredményt egy
 * testexecutionreport.txt-be mentsük el.
 */
public class Task96_IO_75feladat {
    public static void main(String[] args) {
        List<String> testRuns = getListFromFile();
        int passCount = 0;
        int skipCount = 0;
        int failedCount = 0;
        for (String testRun : testRuns) {
            String executionResult = testRun.substring(4);
            switch (executionResult) {
                case "1":
                    passCount++;
                    break;
                case "0":
                    failedCount++;
                    break;
                case "X":
                    skipCount++;
                    break;
                default:
                    System.out.println("Wrong ID");
            }
        }
        String result = "Total test case number to run: " + testRuns.size() + System.lineSeparator() + "Count off passed tests: " + passCount +
                " ratio: " + passCount * 100 / testRuns.size() + " %." + System.lineSeparator() + "Count off failed tests: " + failedCount +
                " ratio: " + failedCount * 100 / testRuns.size() + "%." + System.lineSeparator() + "Count off skipped tests: " + skipCount +
                " ratio: " + skipCount * 100 / testRuns.size() + "%";
        writeExecutionResultToFile(result);

    }

    public static List<String> getListFromFile() {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Path.of("src/resources/testexecutionresults.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void writeExecutionResultToFile(String result){
        try {
            Files.writeString(Path.of("src/resources/testexecutionreport.txt"), result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
