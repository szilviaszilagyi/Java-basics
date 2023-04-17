package Eloadasanyag.inheritence.animal;
/** ÖRÖKLŐDÉS */

/** Minden osztály közös őse az Object osztály */
public class Dog extends Animal {  /** extends kulcsszóval hívjuk meg az ősosztályt */
    private String toy;

    public Dog(String name, int age, double mass, String toy) {
        super(name, age, mass);
        this.toy = toy;
    }

    public String getToy() {
        return toy;
    }

    public void play() {
        System.out.println(getName() + " plays with a " + toy); /** azért tudjuk meghívni a getName függvényt, mert az animal osztályban benne van.*/
    }
}
