import java.util.Scanner;

/** (Órai) Készítsünk egy konzolról beolvasó metódust, amely a beírt szöveget Stringként beolvassa és eltávolítja a felesleges szóközöket
 * belőle, majd visszaadja azt. Építsünk bele olyan logikák, hogy ha 0 hosszú a bevitt kifejezés, akkor írjon ki a konzolra hibaüzenetet.*/
public class Task76_String_consoleMethod {
    public static void main(String[] args) {
      String newString = getTrimmedTextFromConsole();
        System.out.println(newString);

    }

    /**
     * Remove spaces from the beginning and the end of the console input
     * @return trimmed console input String
     */
    public static String getTrimmedTextFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write me something! :)");
        String userInput = scanner.nextLine();
        String result = "";
        if(userInput.length() == 0){
            System.out.println("Wrong input data.");
        }else{
            result= userInput.trim();
        }
        return result;
    }
}

