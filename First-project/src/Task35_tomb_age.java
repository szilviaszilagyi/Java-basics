import java.util.Scanner;

/** Készítsetek egy ageInput nevű arrayst, amiben a következő számok találhatóak: 5, -3, 0, 21, 55, 18, 32, 255, 42. Írjatok egy for ciklust, amely
 * bejárja ezt a tömböt és valid age esetén kiírja azt a képernyőre, de csak az életszerű, valós age-eket. */
public class Task35_tomb_age {
    public static void main(String[] args) {
        int ageInput[] = {5, -3, 0, 21, 55, 18, 32, 255, 42};

        for ( int i = 0; i < ageInput.length; i++) {
            if (ageInput[i] < 120 && ageInput[i] >= 0) {
                System.out.println(ageInput[i]);
            }
        }

        /** ha gondolod fejleszd tovább úgy hogy a felhasználó adhassa meg inkább a számokat, mondjuk fixen 5 darabot az kerül
         * lementésre és kiértékelésre */

        int ageInput1[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < ageInput1.length; i++){
           System.out.println("Give me a number: ");
           int numbers = scanner.nextInt();
           ageInput1[i] = numbers;
            System.out.println(ageInput1[i]);
           }

        System.out.println("--------------kiíratás------------------");

        for (int i = 0; i < ageInput1.length; i++) {
            if (ageInput1[i] < 120 && ageInput1[i] >= 0) {
                System.out.println(ageInput1[i]);
            }

        }


    }
}
