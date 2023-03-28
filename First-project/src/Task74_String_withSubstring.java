import java.util.Scanner;

public class Task74_String_withSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int result = 0;
        do {
            System.out.println("Add the id with count: (7 length)");
            input = scanner.nextLine(); // pl.: "1376367"
            if (!input.equalsIgnoreCase("X")) {
                String countAsString = input.substring(6);  // az előzőleg látott charAt csak addig jó, amíg a darabszámom 0-9 közötti,
                // míg ez a megoldás akkor is működik ha az nagyobb
                int countAsInt = Integer.parseInt(countAsString);
                if (countAsInt == 0) {
                    System.out.println("Count is 0!");
                } else {
                    result = result + countAsInt;      //ua.: result += countAsInt
                    System.out.println(countAsInt);
                }
            }
        } while (!input.equalsIgnoreCase("X"));

        System.out.println("Total count: " + result);
    }
}
