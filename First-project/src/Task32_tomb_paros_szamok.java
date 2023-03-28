/** Készítsetek egy programot, amely elszámol 1-től 100-ig és a páros számokat lementi egy evenNumbers nevű array-be.
 * Írjuk is ki a képernyőre egy sorban az értékeit. */
public class Task32_tomb_paros_szamok {
    public static void main(String[] args) {
        int evenNumbers[] = new int[50];
        int evenNumbersIndex = 0;
        // Értékbeállítás
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                evenNumbers[evenNumbersIndex] = i;
                evenNumbersIndex++;
            }
        }
        // értékek kiíratása
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]);
        }


    }
}
