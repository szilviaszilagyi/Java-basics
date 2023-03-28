import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * A task64 megoldása alapján bővítsétek ki a számológép működését, hogy amit a felhasználó számol és annak eredménye kerüljön elmentésre
 * egy naplófájlként. (calculator.log) néven
 */
public class Task94_IO_64feladat {
    public static void main(String[] args) {
        int number1 = getNumberFromUser();
        int number2 = getNumberFromUser();
        String operator = getOperatorFromUser();
        int result = getCalculationResult(operator, number1, number2);
        showResultToTheUser(result);
        String content = String.valueOf(result);
        writeResultToFile(content);


    }

    public static void writeResultToFile(String content) {
        try {
            Files.writeString(Path.of("src/resources/calculator.log"), "Result was: " + content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getNumberFromUser() {
        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static String getOperatorFromUser() {
        System.out.println("Write one operator: [+, -, *, /, pumped]");
        Scanner scanner2 = new Scanner(System.in);
        String operator = scanner2.nextLine();
        return operator;
    }

    public static int getCalculationResult(String operator, int number1, int number2) {
        int result = 0;
        switch (operator) {
            case "*":
                result = number1 * number2;
                break;
            case "+":
                result = number1 + number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "pumped":
                result = number1 * number1 * number1 * number2 * number2 * number2;
                break;
            default:
                System.out.println("Unsupported operator. Please re-run!");
        }
        return result;
    }

    public static void showResultToTheUser(int result) {
        System.out.println("Result: " + result);
    }
}


