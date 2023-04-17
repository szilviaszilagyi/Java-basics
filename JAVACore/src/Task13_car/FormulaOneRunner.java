package Task13_car;

/**
 * Készítsetek egy interfészt Car néven, melyben szerepel egy acceleration metódus, a gyorsulás reprezentálására, mely vár egy double típusú értéket,
 * hogy mennyi idő alatt tud 0-ról 100-ra felgyorsulni, valamint egy getCarManufacturer metódus a kocsi gyártójának elkérésére. Készüljön el egy másik
 * interfész is, Racer néven. Legyen neki egy getRacerName és egy getNationality metódusa a neve és nemzetisége elkérésére.
 * Készítsetek egy osztályt MercedesPilotOne néven, amely implementálja mindkét interfészt. Töltsétek meg tartalommal és hiányzó elemekkel az osztályt és
 * példányosítsátok azt a FormulaOneRunner osztályban.
 * Készítsetek egy osztályt FerrariPilotOne néven,  amely implementálja mindkét interfészt. Töltsétek meg tartalommal és hiányzó elemekkel az osztályt és
 * példányosítsátok azt a FormulaOneRunner osztályban.
 */

public class FormulaOneRunner {
    public static void main(String[] args) {
        MercedesPilotOne mercedesPilotOne = new MercedesPilotOne("Hamilton", "Mercedes AMG", "british");
        mercedesPilotOne.acceleration(2.6);
        System.out.println(mercedesPilotOne.getCarManufacturer());
        System.out.println(mercedesPilotOne.getNationality());
        System.out.println(mercedesPilotOne.getRacerName());
        System.out.println(mercedesPilotOne);
        FerrariPilotOne ferrariPilotOne = new FerrariPilotOne("Vettel", "Scuderia Ferrari", "german");
        ferrariPilotOne.acceleration(2.3);
        System.out.println(ferrariPilotOne.getCarManufacturer());
        System.out.println(ferrariPilotOne.getNationality());
        System.out.println(ferrariPilotOne.getRacerName());
        System.out.println(ferrariPilotOne);


    }
}
