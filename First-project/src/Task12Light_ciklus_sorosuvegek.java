/** Van 5 db zöld üvegünk, darabja 10 Ft, és van 3 db fekete üvegünk és darabja 30 Ft. ezeknek az összege kell, mennyit kapunk, ha
 * visszaváltjuk az üvegeket */

public class Task12Light_ciklus_sorosuvegek {
    public static void main(String[] args) {
        // WHILE CIKLUSSAL
        int green = 1;
        int black = 1;
        int result;
        int resultGreen = 0;
        int resultBlack = 0;
        while (green <= 5) {
            resultGreen = green * 10;
            green++;
        }
        while (black <= 3) {
            resultBlack = black * 30;
            black++;
        }
        result = resultGreen + resultBlack;
        System.out.println("Total result: " + result + " Ft");

        System.out.println();
        // FOR CIKLUSSAL
        int resultgreen1 = 0;
        int resultblack1 = 0;
        int result1;
        for(int green1 = 0; green1 <= 5; green1++){
            resultgreen1 = green1 * 10;
        }
        for(int black1 = 0; black1 <= 3; black1++){
            resultblack1 = black1 * 30;
        }
        result1 = resultgreen1 + resultblack1;
        System.out.println("Total result: " + result1 + " Ft");

        System.out.println();
        // ÓRAI MEGOLDÁS
        int result2 = 0;
        int zoldUvegOsszeg = 0;
        int feketeUvegOsszeg = 0;

        for (int cycle = 0; cycle <= 4; cycle++) {
            zoldUvegOsszeg = zoldUvegOsszeg + 10;  //zoldUvegOsszeg += 10;
        }

        result2 = zoldUvegOsszeg;
        for (int cycle = 0; cycle <= 2; cycle++) {
            feketeUvegOsszeg = feketeUvegOsszeg + 30;   //feketeUvegOsszeg += 30
        }
        result2 = result2 + feketeUvegOsszeg;
        System.out.println("Result: " + result2 + " Ft");

    }
}


