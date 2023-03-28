import java.util.Scanner;

public class TaskHomeWork_swich_case_version {
    public static void main(String[] args) {
        int productPrice = 0;
        String answer;
        System.out.println("Dear Customer! Please enter the product.");
        System.out.println("apple, beer, bread, cheese, chocolate, milk, orange juice, yoghurt");
        do {
            System.out.println("Please enter the product.");
            Scanner scanner = new Scanner(System.in);
            String product = scanner.nextLine();
            System.out.println("Please enter the number of the product!");
            int productQuantity = Integer.parseInt(scanner.nextLine());
            switch (product) {
                case "apple":
                    productPrice = productPrice + 350 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                case "beer":
                    productPrice = productPrice + 600 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                case "bread":
                    productPrice = productPrice + 500 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                case "cheese":
                    productPrice = productPrice + 2200 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                case "chocolate":
                    productPrice = productPrice + 450 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                case "milk":
                    productPrice = productPrice + 330 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                case "orange juice":
                    productPrice = productPrice + 890 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                case "yoghurt":
                    productPrice = productPrice + 680 * productQuantity;
                    System.out.println("Total amount = " + productPrice + " Ft.");
                    break;
                default:
                    System.out.println("Unknown product. Please, try again!");
            }
            System.out.println("When you want to finish shopping, please press x, if you want to buy something else, please press y");
            answer = scanner.nextLine();
            if (answer.equals("x")) {
                System.out.println("Total amount = " + productPrice + " Ft. Thank you for choosing us! Have a nice day!");
                break;
            }
        } while (answer.equals("y"));


    }
}
