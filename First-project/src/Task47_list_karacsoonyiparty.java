import java.util.Arrays;
import java.util.List;

/** (Órai) Írjunk programot, ami összeszámolja a dolgozói szavazatokat amely a karácsonyi party helyszínével kapcsolatos. Szerencsére egy gyakornok
 * összegyűjtötte a szavazatokat egy Listába, íme:"Rumour", "Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel",
 * "Babel", "Babel","Rumour","Babel", "Babel", "Rumour", "Rumour", "Rumour","Babel", "Babel", "Rumour","Rumour", "Rumour", "Babel", "Rumour", "Rumour",
 * "Rumour", "Rumour", "Rumour", "Rumour", "Babel","Rumour","Rumour", "Rumour","Babel", "Babel", "Rumour", "Rumour", "Rumour", "Rumour")
 * Készítsünk egy List-et ezzel a kezdőértékkel és számoljuk meg a szavazatokat, majd írjuk ki a győztes helyet a képernyőre */
public class Task47_list_karacsoonyiparty {
    public static void main(String[] args) {
        List<String> placeOfParty = Arrays.asList("Rumour", "Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Babel", "Babel","Rumour","Babel", "Babel", "Rumour","Rumour", "Rumour","Babel", "Babel", "Rumour","Rumour", "Rumour", "Babel", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Rumour", "Babel", "Rumour","Rumour", "Rumour","Babel", "Babel", "Rumour", "Rumour", "Rumour", "Rumour");
        int rumourVotes = 0;
        int babelVotes = 0;
        for(int i=0;i < placeOfParty.size();i++){
            String currentPlace = placeOfParty.get(i);
            if(currentPlace.equals("Rumour")){
                rumourVotes++;
            }else{
                babelVotes++;
            }
        }
        if(rumourVotes > babelVotes){
            System.out.println("Rumour win!");
        } else if (babelVotes > rumourVotes) {
            System.out.println("Babel win!");
        }else{
            System.out.println("Draw.");
        }
    }
}
