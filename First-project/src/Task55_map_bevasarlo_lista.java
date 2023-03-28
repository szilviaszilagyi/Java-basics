import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Írjatok egy bevásárló lista programot, amely nem csinál mást, mint elmenti a felhasználótól beolvasott elemeket majd az elemhez tartozó darabszámot.
 * Elmenti egy Map-be és a végén ki is írja a felhasználó számára az elmentett elemeket.
 * fix 7 elemű legyen a Map, pontosan 7 elemet lehessen hozzáadni.
 * oldjuk meg, hogy ha az elem már szerepel a Map-ben, akkor írja ki a program, hogy “Az elem darabszáma frissítésre került”
 * ne legyen limitálva, hogy mennyi elemet adhat a felhasználó. Miután hozzáadott 3 elemet a felhasználó, kérdezze meg minden elem hozzáadása után,
 * hogy szeretne-e új elemet hozzáadni. “Y” esetén újbóli beolvasás, “N” esetén a Map kiíratása következik.
 * Számoljuk össze a termékek összegét és az össz darabszámot is.
 */
public class Task55_map_bevasarlo_lista {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        boolean flag = true;
        int numberOfProductTotal = 0;

        do {
            //for(int i=0; i < 7; i++) {
            System.out.println("Give me the name of product.");
            String product = scanner.nextLine();
            System.out.println("Give me the number of product.");
            int numberOfProduct = Integer.parseInt(scanner.nextLine());
            if (shoppingList.containsKey(product)) {
                System.out.println("Product number is updated");
                numberOfProductTotal -= shoppingList.get(product);
            }
            numberOfProductTotal += numberOfProduct;
            shoppingList.put(product, numberOfProduct);
            if (shoppingList.size() >= 3) {
                System.out.println("Do you want to buy something else? (Y/N)");
                answer = scanner.nextLine();
                if (!answer.equals("Y")) {
                    flag = false;
                }
            }
            // }


        } while (flag);
        System.out.println(shoppingList);
        System.out.println("You have purchased " + shoppingList.size() + " products.");
        System.out.println("Products in total: " + numberOfProductTotal);

    }
}
