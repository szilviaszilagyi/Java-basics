import java.util.Scanner;
/** (Órai) Írjunk programot, amely előre meghatározott tojásárak között, kiszámolja mennyi a tojás átlagos ára. az árak egy eggPrices array-ben kerülnek
 * előzetesen megadásra az árak a felhasználótól a console-ról kerülnek beolvasásra (5db). kérdezzük meg a felhasználótól hány árat szeretne rögzíteni,
 * majd pontosan annyi értéket kérjünk is el tőle és tároljuk le őket az eggPrices arraybe.*/
public class Task36B_tomb_eggprice_consolerol_bekerve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add how many egg price do you want to store: ");
        int eggCount = scanner.nextInt();

        int[] eggPrices = new int[eggCount];
        double eggPricesSum = 0;

        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("Add a price an egg!");
            eggPrices[i] = scanner.nextInt();
        }

        for (int i = 0; i < eggPrices.length; i++) {
            eggPricesSum += eggPrices[i];  // ua eggPricesSum = eggPricesSum + eggPrices[i]
        }
        double result = eggPricesSum / eggPrices.length;
        System.out.println("Average price of an egg: " + result);


    }
}