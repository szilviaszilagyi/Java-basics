/** a 33-as feladat metódusítása */
public class Task66_method_33feladat {
    public static void main(String[] args) {
        String carsArray[] = {"BMW", "Audi", "Opel", "Lexus", "Ferrari", "Lada", "Mercedes"};
        String myFavoriteCar = "Lexus";
        searchForItemInArray(carsArray, myFavoriteCar);


        if (searchForItemInArray(carsArray, myFavoriteCar)) {
            System.out.println("HURRAY");
        }


    }

    public static boolean searchForItemInArray(String[] array, String searchItem) {
        boolean isInArray = false;
        for (int i = 0; i < array.length; i++) {                   // ez ebben a formában egy általános metódus, ami megkeresi, hogy az adott elem,
            if (array[i].equals(searchItem)) {                             //benne van-e a tömbben  mint a list-nél, map-nél, set-nél a .contains,
                System.out.println(array[i] + " is in the array.");      //booleant ad vissza
                isInArray = true;
                break;
            }
        }
        return isInArray;
    }
}
