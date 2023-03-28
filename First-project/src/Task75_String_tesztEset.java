import java.util.Arrays;
import java.util.List;

/**
 * Készítsetek teszteset futási összesítő alkalmazást. A futási eredmények az alábbi formában tároljuk le egy ArrayList-ben vagy
 * konzolról beolvasva kapjuk. Minden teszteset futás kezdődik egy 4 számjegyű számmal, majd egy 1-es ha PASS, X ha SKIP, valamint 0 ha FAILED.
 * Egy példa adat tehát: 00171
 * A feladat, hogy számoljuk össze Összesen hány teszteset került futtatásra?
 * Mennyi volt PASS? SKIP? FAILED?
 * Jelenítsük meg az adatokat százalékos formában is
 */


public class Task75_String_tesztEset {
    public static void main(String[] args) {
        List<String> testRuns = Arrays.asList("00171", "0018X", "00191", "00201", "00210", "00221", "0022X", "00231");
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
        // double passRatio = (double) passCount / testRuns.size();
        System.out.println("Total test case number to run: " + testRuns.size());
        System.out.println("Count off passed tests: " + passCount + " ratio: " + passCount * 100 / testRuns.size() + "%");
        System.out.println("Count off failed tests: " + failedCount + " ratio: " + failedCount * 100 / testRuns.size() + "%");
        System.out.println("Count off skipped tests: " + skipCount + " ratio: " + skipCount * 100 / testRuns.size() + "%");
    }
}
