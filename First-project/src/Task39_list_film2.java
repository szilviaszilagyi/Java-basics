import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/** (Órai)Fejlesszük tovább az előző feladatot úgy, hogy csak akkor mentse el a beolvasott filmet, ha még előzetesen nem adta meg azt.
 * Vagyis kerüljük el azt, hogy ha a lista eleme már létezik, akkor ne adhassuk újra hozzá. */
public class Task39_list_film2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favFilms = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Please tell me your 5 favorite films: ");
            String userFavFilm = scanner.nextLine();
            if(favFilms.contains(userFavFilm)){                         // eredmeny true v false lesz
                System.out.println("Give me another one!");
                i--;
            }else{
                favFilms.add(userFavFilm);
            }
        }
        for (String movie:favFilms) {
            System.out.println(movie);
        }
        System.out.println("List saved: " + favFilms);

    }
}
