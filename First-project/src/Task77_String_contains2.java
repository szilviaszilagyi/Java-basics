import java.util.Scanner;

public class Task77_String_contains2 {

    public static void main(String[] args) {
        System.out.println(isTextExist());
    }

    public static boolean isTextExist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the string: ");
        String string = scanner.nextLine();
        System.out.println("Add the string: ");
        String text = scanner.nextLine();
        return string.contains(text); // return lehet kiértékelendó kifejezés is, nem csak változó v konkrét érkét
    }
}


