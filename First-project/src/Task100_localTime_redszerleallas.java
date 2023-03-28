
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Készítsetek összesítő alkalmazást, ami megszámolja hogy az adott nap hányszor volt valamilyen rendszerleállás az egyik microservice
 * kapcsán. Az adott napi leállásokat sikerült a monitoring alkalmazásból kinyerni és egy listába elmenteni a napra vonatkozóan:
 * List<String> logs = Arrays.asList(
 * "07:17", "07:04", "07:48", "07:36", "07:52",
 * "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
 * "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
 * "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
 * "07:54", "07:04", "17:13", "17:07", "18:55", "07:14", "07:48",
 * "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41"
 * );
 * Az összleállás mellett, fontos hogy mennyi leállás volt délelőtt (12:00) és mennyi délután
 **/
public class Task100_localTime_redszerleallas {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "07:17", "07:04", "07:48", "07:36", "07:52",
                "07:12", "07:43", "07:45", "08:11", "07:53", "08:32", "07:44",
                "07:51", "08:49", "08:41", "07:56", "07:12", "07:15", "07:47",
                "07:56", "08:52", "07:24", "07:22", "07:05", "08:32", "07:32",
                "07:54", "07:04", "17:13", "17:07", "18:55", "07:14", "07:48",
                "08:19", "08:53", "08:50", "08:32", "07:47", "07:48", "08:41"
        );

        List<LocalTime> systemCrashLogs = new ArrayList<>();
        for (String log : logs) {
            systemCrashLogs.add(LocalTime.parse(log));
        }
        System.out.println(systemCrashLogs.size());
        int morning = 0;
        int afternoon = 0;
        for (LocalTime crashTime : systemCrashLogs) {
            if (crashTime.getHour() >= 7 && crashTime.getHour() <= 11) {
                morning++;
            } else if (crashTime.getHour() > 11) {
                afternoon++;
            }
        }
        System.out.println("System carsh in the morning: " + morning);
        System.out.println("System carsh in the afternoon: " + afternoon);

        /**
         * Alternative solution:
         *
         * LocalTime noon = LocalTime.parse("12:00");
         for (LocalTime crashTime : systemCrashLogs) {
         if (crashTime.isBefore(noon)) {
         morning++;
         } else  {
         afternoon++;
         }
         }
         System.out.println("System carsh in the morning: " + morning);
         System.out.println("System carsh in the afternoon: " + afternoon);*/
    }
}