package Enum.Task109_honapok;

import java.util.Locale;
import java.util.Scanner;

public class MonthMethods {

    public static Month getUserChoose(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Milyen hónap van?");
        String userInput = scanner.nextLine();
        Month userChoose = null;
        if (userInput.equalsIgnoreCase(String.valueOf(Month.JANUÁR))) {
            userChoose = Month.JANUÁR;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.FEBRUÁR))) {
            userChoose = Month.FEBRUÁR;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.MÁRCIUS))) {
            userChoose = Month.MÁRCIUS;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.ÁPRILIS))) {
            userChoose = Month.ÁPRILIS;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.MÁJUS))) {
            userChoose = Month.MÁJUS;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.JÚNIUS))) {
            userChoose = Month.JÚNIUS;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.JÚLIUS))) {
            userChoose = Month.JÚLIUS;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.AUGUSZTUS))) {
            userChoose = Month.AUGUSZTUS;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.SZEPTEMBER))) {
            userChoose = Month.SZEPTEMBER;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.OKTÓBER))) {
            userChoose = Month.OKTÓBER;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.NOVEMBER))) {
            userChoose = Month.NOVEMBER;
        } else if (userInput.equalsIgnoreCase(String.valueOf(Month.DECEMBER))) {
            userChoose = Month.DECEMBER;
        }
        return userChoose;
    }

    public static void printSeason(Month userChoose){
        String season = null;
        try {
            switch (userChoose) {
                case DECEMBER, JANUÁR, FEBRUÁR -> season = "TÉL";
                case JÚNIUS, JÚLIUS, AUGUSZTUS -> season = "NYÁR" ;
                case MÁRCIUS, ÁPRILIS, MÁJUS -> season = "TAVASZ";
                case SZEPTEMBER, OKTÓBER, NOVEMBER -> season = "ŐSZ";
            }
            System.out.println(userChoose + " egy " + season +"I hónap.");
        } catch (NullPointerException e) {
            System.out.println("Kérlek, jó hónapot adj meg!");
        }
    }

    public static void printSeason(String userInput){
        try {
            Month userChoose = Month.valueOf(userInput.toUpperCase(Locale.ROOT));
            MonthMethods.printSeason(userChoose);
        }catch (IllegalArgumentException ex){
            System.out.println("Kérlek, jó hónapot adj meg! AZ alábbiak közül választhatsz:");
            for (Month month : Month.values()) {
                System.out.print(month + ", ");
            }
        }

    }
}
