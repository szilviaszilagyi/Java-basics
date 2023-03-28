import java.util.*;

/** (Órai) Írjunk könyv nyilvántartás programot. A feladat, hogy meg kell számolni pontosan hány különböző könyv van (cím szerint) és hogy
 * hány példány van belőle a könyvesboltban. Szerencsére a kutató és adminisztrációs munka nagyját megcsinálták a diákmunkások, így egy ömlesztett lista
 * a könyvekről már rendelkezésünkre áll:
 "Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring",
 "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King",
 "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm",
 "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia",
 "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.",
 "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm",
 "All about Sam", "Son"
 * Array.asList(“Son”,... -ként nyugodtan állítsuk be a programunknak a List kezdeti értékét és a feladat végeredményét mentsük egy Map-be.
 * Írjuk ki a map tartalmát a képernyőre úgy, hogy az alábbi példának megfeleljen: “The Fellowship of the Ring - 4 darab”
 * Hány darab könyv van összesen és hány különböző könyv van?
 * Tételezzük fel, hogy azokat a könyveket amikből egy darab van, azokat kivesszük ideiglenesen a nyilvántartásból, mert a cégvezető értékesnek
   találja és meg szeretné tartani őket. Keressük meg ezeket a könyveket és töröljük a nyilvántartásból.
 * (next level) Tételezzük fel, hogy a cégvezető nem is annyira rossz arc és azokat a könyveket, amelyekből 4 darab van, 1-et elajándékoz rászorulóknak.
 * Frissítsük ezen könyvek darabszámát 3-ra. */
 public class Task57_map_konyv_nyilvantartas {
    public static void main(String[] args) {
        List<String> bookList = Arrays.asList("Son", "Harry Potter VI.", "Down and Out in Paris and London", "All about Sam", "1984", "Keep the Aspidistra Flying", "The Fellowship of the Ring", "Keep the Aspidistra Flying", "A Summer to Die", "Harry Potter V", "The Return of the King", "Harry Potter VI.", "The Return of the King", "Down and Out in Paris and London", "Harry Potter V", "A Summer to Die", "Harry Potter I.", "Harry Potter III.", "All about Sam", "Animal Farm", "Gathering Blue", "Homage to Catalonia", "Son", "The Two Towers", "Harry Potter III.", "Messenger", "The Return of the King", "Homage to Catalonia", "Harry Potter III.", "Harry Potter I.", "The Two Towers", "Gathering Blue", "Messenger", "The Fellowship of the Ring", "1984", "Harry Potter VI.", "Keep the Aspidistra Flying", "Gathering Blue", "Harry Potter V", "Harry Potter II.", "Homage to Catalonia", "Harry Potter V", "Animal Farm", "All about Sam", "Son");
        Map<String, Integer> bookCountMap = new HashMap<>();

        for(String bookTitle: bookList) {
            if (bookCountMap.containsKey(bookTitle)) {
                int originalCount = bookCountMap.get(bookTitle);
                bookCountMap.put(bookTitle, originalCount + 1);  /** felülírja a könyv darabszámát */
            } else {
                bookCountMap.put(bookTitle, 1);
            }
        }
        /** task d - gyüjtsük ki  4 példányos könyveket és update-eljük 3 db-ra */
        List<String> bookWithCountFor = new ArrayList<>();
        for (Map.Entry mapElement : bookCountMap.entrySet()) {   /** ez a foreach csak összegyűjti egy litába a 4 db-os könyveket */
            if ((int) mapElement.getValue() == 4) {
                bookWithCountFor.add((String) mapElement.getKey());
            }
        }
        for (Map.Entry mapElement : bookCountMap.entrySet()){   /** ez pedig megnézi, hogy  map-ben mik a 4 darabos könyvek és azok value-ját átállítja 3ra */
            for(String title: bookWithCountFor){
                if(bookCountMap.containsKey(title)){
                    mapElement.setValue(3);
                }
            }
        }


        /** task c - vegyük ki az 1 példányos könyveket */
        List<String> bookWithCountOne = new ArrayList<>();
        for (Map.Entry mapElement : bookCountMap.entrySet()){   /** ez a foreach csak összegyűjti egy litába az 1 db-os könyveket */
            if((int)mapElement.getValue() == 1){
               bookWithCountOne.add((String) mapElement.getKey());
            }
        }
        for (String bookTitle: bookWithCountOne){              /** ez pedig kiveszi a map-ből */
            bookCountMap.remove(bookTitle);
        }

        /** task b összegzés */
        int sumOfBooks =0;
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            sumOfBooks += (int) mapElement.getValue();
        }

        /** task a kiíratás */
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }

        System.out.println("Number of different titles: " + bookCountMap.size());
        System.out.println("Total number of books (from list): " + bookList.size());
        System.out.println("Total number of books (from map): " + sumOfBooks);
    }
}
