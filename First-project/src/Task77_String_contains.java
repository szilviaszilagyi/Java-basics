import java.util.Scanner;

/** (Órai) Készítsünk egy metódust, ami a konzolról beolvas egy szöveget, majd beolvas egy másik szöveget és eldönti, hogy a második szöveg
 * szerepel-e az első szövegben. Amennyiben igen, térjen vissza true-val, egyébként false-al.*/
public class Task77_String_contains {
    public static void main(String[] args) {
        System.out.println(isTextExist());
    }
    public static boolean isTextExist(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the string: ");
        String string = scanner.nextLine();

        System.out.println("Add the string: ");
        String text = scanner.nextLine();

        if(string.contains(text)){
            return true;
        }else{
            return false;
        }

    }
}
