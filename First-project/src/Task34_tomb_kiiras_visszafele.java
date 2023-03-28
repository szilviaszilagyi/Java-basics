/**(Órai) Írjunk egy programot, amely egy array-ben elmenti a számokat 1-21-ig majd kiírja őket visszafele egymás után szóközzel elválasztva.*/
public class Task34_tomb_kiiras_visszafele {
    public static void main(String[] args) {
        int array[] = new int[21];
        int numbersIdex = 0;

        for (int i = 1; i <= 21; i++) {
            array[numbersIdex] = i;
            numbersIdex++;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
