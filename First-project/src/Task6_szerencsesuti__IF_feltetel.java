import java.util.Random;

/** Készítsetek szerencsesüti programot, amely minden futtatása során kiír egy kis bölcs üzenetet.
 * A program véletlenszerűen írjon ki üzeneteket, amit előre felvettünk benne. Mindig csak egyet. */
public class Task6_szerencsesuti__IF_feltetel {
    public static void main(String[] args) {
        System.out.println("Szia! Kapni fogsz egy jókívánságot!");
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(5);
        if (randomNumber == 0) {
            System.out.println("Minden nap új nap!");
        } else if (randomNumber == 1) {
            System.out.println("Ez a te napod!");
        } else if (randomNumber == 2) {
            System.out.println("A legjobb dolgok ingyen vannak!");
        } else if (randomNumber == 3) {
            System.out.println("Éld meg a pillanatot");
        } else {
            System.out.println("Több ilyen Coelho-s hülyeség nem jut eszembe!");
        }
    }
}
