import java.util.Scanner;

public class Task18_cilkus_swich_case_szamologep {
    public static void main(String[] args) {
        String answer;
        do{
        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Write one operator: [+, -, *, /, pumped]");
        String operator = scanner.nextLine();

        System.out.println("Give me another number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (operator){
            case "*":
                System.out.println("Result: " + number1 * number2);
                break;
            case "+":
                System.out.println("Result: " + (number1 + number2));
                break;
            case "/":
                System.out.println("Result: " + number1 / number2);
                break;
            case "-":
                System.out.println("Result: " + (number1 - number2));
                break;
            case "pumped":
                System.out.println("Result: " + number1 * number1 * number1 * number2 * number2 * number2);
                break;
            default:
                System.out.println("Unsupported operator. Please re-run!");
        }
        System.out.println("Do you want count more? (Y/N)");
        answer = scanner.nextLine();
        if (answer.equals("Y")) {
            System.out.println("Let's do this!");
        } else {
            System.out.println("Thank you for your time!");
        }
        } while (answer.equals("Y"));
    }

}
