package Task8_Dounut2;
/** Készítsétek el az alábbi, együtt elkészített diagramon láthatszó osztályhierarchiát. A metódusokat is tartalmazzák az osztályok, de elég akár egy
 * System.out.println() utasítást megvalósítaniuk, amely kiírja a konzolra hogy éppen mi az adott tevékenység. Pl.: ízélmény() metódus kiírja, hogy
 * “Ez a klasszikus fánk nagyon finom.”.*/

public class DonutExample {
    public static void main(String[] args) {
        ClassicDoughnut donutClassic = new ClassicDoughnut("kerek","10cm","n/a","liszt","porcukor");
        donutClassic.megkel();
        donutClassic.hizlal();
        System.out.println(donutClassic);
        //és végül a megmaradt emberekből főztek levest a krokodilok kedden
        ChocolateDonut donutChocolate = new ChocolateDonut("kerek","8cm", "csoki","liszt","csoki",235);
        donutChocolate.csokitoltelekkeszites();
        donutChocolate.megkel();
        donutChocolate.hizlal();
        System.out.println(donutChocolate);

        JamDonut donutJam = new JamDonut("kerek","10cm","lekvár", "liszt","porcukor", "25%");
        donutJam.lekvar();
        donutJam.hizlal();
        System.out.println(donutJam);

    }
}
