import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Készítsetek egy alkalmazást, amely egy bevásárló lista. Az elemeket be tudja olvasni az alábbi formában: tétel-db vagyis, kenyér-2 vagy
 * sör-6. Az így beolvasott elemeket feldarabolja a - jel mentén és elmenti egy shoppingList nevű Map-be. Az első fele, a kötőjel előtti rész
 * legyen a kulcs, a második rész pedig a darabszám.
 */
public class Task73_String_bevasarlolista {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = getShoppingListAsMap();
        System.out.println(shoppingList);

        /**
         Scanner scanner = new Scanner(System.in);
         String product = "";
         Map<String, Integer> shoppingList = new HashMap<>();
         System.out.println("Give me the name and number of product. For example: beer-6. If you write x then execution ends.");
         while (!product.equals("x")) {
         System.out.println("Give me the name and number of product.");
         product = scanner.nextLine();
         if (!product.equals("x")) {
         shoppingList.put(product.split("-")[0], Integer.valueOf(product.split("-")[1]));
         }


         System.out.println(shoppingList); */
    }

    public static Map<String, Integer> getShoppingListAsMap() {
        Scanner scanner = new Scanner(System.in);
        String product = "";
        Map<String, Integer> shoppingList = new HashMap<>();
        while (!product.equalsIgnoreCase("x")) {
            System.out.println("Give me the name and number of product.");
            product = scanner.nextLine();
            if (!product.equalsIgnoreCase("x")) {
                shoppingList.put(product.split("-")[0], Integer.valueOf(product.split("-")[1]));
            }
        }
        return shoppingList;
    }
}



