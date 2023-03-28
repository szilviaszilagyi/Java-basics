import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Készítsetek programot, ami összeszámolja a dolgozói szavazatokat amely a karácsonyi party helyszínével kapcsolatos. Szerencsére egy gyakornok
 * összegyűjtötte a szavazatokat egy Listába, íme:
 * "Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt",
 * "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia",
 * "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán",
 * "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel",
 * "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt",
 * "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha",
 * "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour",
 * "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt",
 * "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour"
 * Array.asList(“Essencia”,... -ként nyugodtan állítsuk be a programunknak a List kezdeti értékét és a feladat végeredményét mentsük egy Map-be.
 * Írjuk ki a képernyőre a szavazás eredményét az alábbi példának megfelelően: “Borkonyha - 11 szavazat”
 * Hány Michelin csillagos étterem van? Hány szavazat érkezett?
 * Tételezzük fel, hogy az Essencia jelezte, hogy nem tudják fogadni a céget. Távolítsuk el őket az eredmény Map-ből
 * Tételezzük fel, hogy a főnök kicsit megcinkeli a szavazást a Stand javára és befolyásolja a szavazás végeredményét. Fiktív szavazatokat állít ki és
 * utólag könyvelik le őket. Adjunk hozzá a Stand szavazataihoz 11-et.
 * Extra (google-ből): Ki nyerte a szavazást?
 */

public class Task58_map_etterem {
    public static void main(String[] args) {
        List<String> restaurantList = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour");
        Map<String, Integer> restaurantVoteMap = new HashMap<>();


        for (String restaurantName : restaurantList) {
            if (restaurantVoteMap.containsKey(restaurantName)) {
                 int originalVote = restaurantVoteMap.get(restaurantName);
                restaurantVoteMap.put(restaurantName, originalVote + 1);
            } else {
                restaurantVoteMap.put(restaurantName, 1);
            }
        }

        /** task c- essencia eltávolítása */
        restaurantVoteMap.remove("Essencia");

        /** task a - kiíratás */
        for (Map.Entry mapElement : restaurantVoteMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");
        }
        System.out.println();

        /** task d - adjunk 11 extra szavazatot a Stand-hoz */
        int newStandVotes = restaurantVoteMap.get("Stand") + 11;
        restaurantVoteMap.put("Stand", newStandVotes);

        System.out.println(restaurantVoteMap);

        System.out.println();

        /** task b - szavazat összeszámlásás */
        int sumOfVotes = 0;
        for (Map.Entry mapElement : restaurantVoteMap.entrySet()) {
            sumOfVotes += (int) mapElement.getValue();
        }
        System.out.println();
        System.out.println("Number of Michelin stars restaurant: " + restaurantVoteMap.size());
        System.out.println("Total number of votes (from list): " + restaurantList.size());
        System.out.println("Total number of votes (from map): " + sumOfVotes);
    }
}
