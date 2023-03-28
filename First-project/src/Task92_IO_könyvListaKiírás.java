import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Módosítsátok az 57-es feladat megoldását úgy, hogy a könyvek egy books.txt-ből jöjjenek az előre definiált arraylist helyett,
 * valamint a megoldás is egy booksCount.txt-be kerüljön.
 */
public class Task92_IO_könyvListaKiírás {
    public static void main(String[] args) {
        List<String> bookList = getBookListFromFile();
        Map<String, Integer> bookCountMap = getBookListToMap(bookList);


        for (String bookTitle : bookList) {
            if (bookCountMap.containsKey(bookTitle)) {
                int originalCount = bookCountMap.get(bookTitle);
                bookCountMap.put(bookTitle, originalCount + 1);
            } else {
                bookCountMap.put(bookTitle, 1);
            }
        }
        List<String> bookWithCountFor = new ArrayList<>();
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            if ((int) mapElement.getValue() == 4) {
                bookWithCountFor.add((String) mapElement.getKey());
            }
        }
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            for (String title : bookWithCountFor) {
                if (bookCountMap.containsKey(title)) {
                    mapElement.setValue(3);
                }
            }
        }

        List<String> bookWithCountOne = new ArrayList<>();
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            if ((int) mapElement.getValue() == 1) {
                bookWithCountOne.add((String) mapElement.getKey());
            }
        }
        for (String bookTitle : bookWithCountOne) {
            bookCountMap.remove(bookTitle);
        }

        /** task b összegzés */
        int sumOfBooks = 0;
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            sumOfBooks += (int) mapElement.getValue();
        }

        /** task a kiíratás */
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }

       String content = "Number of different titles: "  + bookCountMap.size() + " Total number of books (from list): " + bookList.size() +" Total number of books (from map): " + sumOfBooks;
        writeBookSum(content);
    }

    public static List<String> getBookListFromFile() {
        List<String> bookList = new ArrayList<>();
        try {
            bookList = Files.readAllLines(Paths.get("src/resources/bookList.txt"));
            System.out.println(bookList);
        } catch (IOException e) {
            System.out.println("Can't found bookList.txt." + e.getMessage());;
        }
        return bookList;
    }
    public static Map<String, Integer>  getBookListToMap(List<String> list){
        Map<String, Integer> bookCountMap = new HashMap<>();
        for (String bookTitle : list) {
            if (bookCountMap.containsKey(bookTitle)) {
                int originalCount = bookCountMap.get(bookTitle);
                bookCountMap.put(bookTitle, originalCount + 1);
            } else {
                bookCountMap.put(bookTitle, 1);
            }
        }
        return bookCountMap;
    }
    public static void writeBookSum(String content){
        try {
            Files.writeString(Path.of("src/resources/booksCount.txt"), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }



}
