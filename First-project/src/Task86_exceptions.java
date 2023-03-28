import java.util.Scanner;

/** Kérjünk el egy stringet a felhasználótól és írjuk ki a 10. karakterét. Kezeljük le a keletkező exceptiont.*/
public class Task86_exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try{
            System.out.println(input.charAt(10));
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("Túl rövid volt a megadott szó.");
        }
    }
}
