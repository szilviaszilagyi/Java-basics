import java.util.Scanner;

public class Task68_method_36feladat {
    public static void main(String[] args) {
        int[] eggPrices = getEggPriceFromUser(numberOfInputs());
        System.out.println("Average: " + getAverage(eggPrices));
    }

    public static int numberOfInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add how many egg price do you want to store: ");
        int eggCount = scanner.nextInt();
        return eggCount;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int[] getEggPriceFromUser(int numberOfInputs) {
        int[] result = new int[numberOfInputs];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.println("Add a price an egg!");
            result[i] = scanner.nextInt();
        }
        return result;
    }
}

