import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**  Írjatok egy programot, amely egy Listában eltárolja majd “visszaolvassa” a felhasználónak azt az 5 kedvenc filmjét, amit bekértünk tőle a
 * konzol segítségével. (Külön ciklus készüljön a beolvasásra és mentésre és külön egy az eredmény kiírására) */
public class Task38_list_film {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favFilms = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Please tell me your 5 favorite films: ");
            String userFavFilm = scanner.nextLine();
            favFilms.add(userFavFilm);
        }
        for (String movie:favFilms) {
            System.out.println(movie);
        }
        System.out.println("List saved: " + favFilms);
    }
}

