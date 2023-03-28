import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/** Írjatok egy nyaralós checklist programot, amelybe tudjátok rögzíteni, hogy mik azok a tevékenységek, dolgok amiket a nyaralás elindulása előtt
 * el kell intézni vagy el kell tenni, hogy minden meglegyen, rendben legyen.
 * Ha "x"-et ír a tevékenység helyett, akkor fejezze be az elemek hozzáadását.
 * ügyeljetek rá, hogy kétszer ne lehessen ugyanazt az elemet a listához adni. Ha mégis megpróbálja a felhasználó akkor kapjon hibaüzenetet.
 * amennyiben a felhasználó azt az elemet adja meg, ami már létezik a listában, úgy akkor azt törölje onnan.
 * (jelezve, hogy az a feladat/tevékenység teljesült)
 * amennyiben elfogyott minden elem a listáról, akkor írja ki a program, hogy “Minden megvan, indulhat a nyaralás!” */
public class Task44_list_nyaralos_checklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> checklist = new ArrayList<>();
        List<String> checklistArchived = new ArrayList<>();
        System.out.println("Add your items to the checklist: ");
        String userInput = "";
        boolean moreItem = true;

        do {
            System.out.println("Your item: ");
            userInput = scanner.nextLine();
            if (userInput.equals("x")) {
                moreItem = false;
            } else if (checklist.contains(userInput)) {
                System.out.println("This item already added, item removed");
                checklist.remove(userInput);
            } else {
                checklist.add(userInput);
                checklistArchived.add(userInput);
            }
            if(checklist.isEmpty()) {                  // megvizsgálja, hogy üres-e a lista, logikai true v false az eredménye
                System.out.println("You done! Let's go to the vacation");
                moreItem = false;
            }
        } while (moreItem);
        System.out.println("Your list: "+ checklist);
        System.out.println("Your archived list: " + checklistArchived);
    }
}