package Enum.Task109_honapok;

import java.util.Locale;
import java.util.Scanner;

public class MonthRunner {
    public static void main(String[] args) {
       Month userChoose = MonthMethods.getUserChoose();
       MonthMethods.printSeason(userChoose);


        System.out.println("--------------version2------------------");
       //ver2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Milyen hónap van?");
        String userInput = scanner.nextLine();
       MonthMethods.printSeason(userInput);



    }
}

