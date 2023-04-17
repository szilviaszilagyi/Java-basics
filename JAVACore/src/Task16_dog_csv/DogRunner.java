package Task16_dog_csv;
/** (Órai) Adott egy csv fájl, ami kutyákat tartalmaz, három fajtából, mint Bulldog, Yorkshire Terrier, és Kaukázusi juhászkutya. A fájl első oszlopa,
 * ahogy lentebb látható tartalmazza, hogy milyen típusú kutyáról van szó, utána pedig a rá vonatkozó adatokat. A feladatunk, hogy írjunk egy programot,
 * ami képes a megadott fájl tartalmát egy List<AbstractDog> listába felolvasni. A programban bizonyosodjunk meg róla, hogy a fájlokban szereplő kutyák
 * a fentebbi három kategória valamelyikébe tartoznak ellenkező esetben dobjunk hibát.*/
public class DogRunner {
    public static void main(String[] args) {
        DogsReader dogsReader = new DogsReader();
        dogsReader.readCsvFile();
        System.out.println(dogsReader.getDogs());

    }
}
