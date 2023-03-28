import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Írjatok programot, amely a megadott testhőmérsékleti adatokból, amit a felhasználó rögzített, a listában tárolást követően kiszámolja mennyi
 * volt az átlagos testhő hányszor volt lázas a bevitt adatok alapján a delikvens. Az adatokat az utolsó 3 nap, napi 3 (reggeli, napközbeni és esti)
 * adataival kell mindig rögzíteni, tehát mindig fix 9 testhőmérsékleti adatot.
 * extra feladat aki esetleg megvan vele: a felhasználó mondhassa meg, hány adatot rögzítene
 * ha már szerepelt az adat akkor adjon figyelmeztetést, amelyben megkérdezi a program, hogy  Ez az adat szerepel már, biztos hozzá akarod adni megint?
 * igen esetén elmenti a listába, nem esetén új adatot írhat a felhasználó. */
public class Task42_list_lazmeres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days did you recorded your body temperature?");
        int daysInput = scanner.nextInt();
        System.out.println("How many times did you recorded your body temperature in a day?");
        int timesInput = scanner.nextInt();
        int totalInputRecord = daysInput * timesInput;

        List<Double> bodyTemperatureList = new ArrayList<>();
        double total = 0;
        double userInput = 0;
        int fever = 0;

        for (int i = 1; i <= totalInputRecord; i++) {
            System.out.println("Please add your body temperature at last " + daysInput + " days and " + timesInput + " times every day and press ENTER. (You have: " + bodyTemperatureList.size() + " record added already.)");
            userInput = scanner.nextDouble();
            if ((bodyTemperatureList.contains(userInput))) {
                System.out.println("This data is already included, are you sure you want to add it again? (Y/N)");
                Scanner scanner2 = new Scanner(System.in);
                String answer = scanner2.nextLine();
                if (answer.equals("Y")) {
                    bodyTemperatureList.add(userInput);
                } else {
                    i--;
                }
            } else {
                bodyTemperatureList.add(userInput);
            }

        }
        for (double temp : bodyTemperatureList) {
            total += temp;
            if (temp > 38) {
                fever++;
            }
        }

        System.out.println(bodyTemperatureList);
        System.out.println("Average temperature: " + total / bodyTemperatureList.size());
        System.out.println("You had fever " + fever + " times in this " + daysInput + " days.");

    }
}

