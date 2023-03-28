import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/** az össz darabszámra vonatkozó alternatív megoldás foreach ciklussal */
public class Task55_map_alternativ {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        boolean flag = true;
        int numberOfProductTotal = 0;

        do {
            System.out.println("Give me the name of product.");
            String product = scanner.nextLine();
            System.out.println("Give me the number of product.");
            int numberOfProduct = Integer.parseInt(scanner.nextLine());
            if (shoppingList.containsKey(product)) {
                System.out.println("Product number is updated");
            }
            shoppingList.put(product, numberOfProduct);
            if (shoppingList.size() >= 3) {
                System.out.println("Do you want to buy something else? (Y/N)");
                answer = scanner.nextLine();
                if (!answer.equals("Y")) {
                    flag = false;
                }
            }
            /** egyik verzió */
            for (Map.Entry mapElement : shoppingList.entrySet()) {
                System.out.println(mapElement.getKey() + " " + mapElement.getValue());
                numberOfProductTotal += (int)mapElement.getValue();    /** azért van előtte az (int), mert megmondjuk neki, hogy bármi is a value,
                                                                            mi integert várunk vissza, típuskényszerítés, castolás */
            }
            /** másik verzió */
            numberOfProductTotal = 0;
            for (String productName : shoppingList.keySet()) {   /** .keyset() ez az összes kulcsot adja vissza, db szám nélkül */
                numberOfProductTotal += shoppingList.get(productName);        /** itt pedig a .get-tel elkérem az adott kulcshoz tartozó darabszámot */
            }


        } while (flag);
        System.out.println(shoppingList);
        System.out.println("You have purchased " + shoppingList.size() + " products.");
        System.out.println("Products in total: " + numberOfProductTotal);
    }
}
