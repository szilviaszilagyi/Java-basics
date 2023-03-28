import java.util.Scanner;

/**
 * Dolgozzátok át a számológép programot úgy, hogy tartalmazzon külön metódust az adatokbekérésre a felhasználótól ( getNumberFromUser() ),
 * valamint egyet az operátor beolvasásra (getOperatorFromUser() ). Ezt követően egy külön metódust amely elvégzi a műveletet és visszaadja az
 * eredményt ( getCalculationResult(operator, number1,number2) ), Végül egy metódust ami kiírja az eredményt a konzolra (showResultToTheUser(result) )
 */
public class Task64_method_szamologep {
    public static void main(String[] args) {
        int number1 = getNumberFromUser();
        int number2 = getNumberFromUser();
        String operator = getOperatorFromUser();
        int result = getCalculationResult(operator, number1, number2);
        showResultToTheUser(result);


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
