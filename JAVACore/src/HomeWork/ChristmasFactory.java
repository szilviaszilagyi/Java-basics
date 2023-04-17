package HomeWork;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A feladat egy  karácsonyi ajándékgyár implementálása :)
 * <p>
 * 1) A gyár (ChristmasFactory) különböző típusú ajándékokkal dolgozik melyeknek egy közös absztrakt őse (Present) van.
 * 2) A gyár képes kiszállítani (deliver()) ezeket az ajándékokat. Kiszállítás során megszámolja összesen mekkora súlyt szállít éppen.
 * 3) Kiszállításkor különböző emberekhez jut el az ajándék akik egy közös interface-t (Person) implementálnak, mellyel képesek fogadni (receivePresent())
 * ezt.
 * A konkrét típustól függően másképpen reagálnak a kapott ajándékra, pl. kid.receivePresent() {System.out.println("Nagyon örül");}
 * Minden ajándék típusra reagálhatnak ugyanúgy.
 * <p>
 * extra:
 * a) a Person interface implementálói reagáljanak különbözőképpen a különböző típusú ajándékokra
 * b) a gyár kiszállításkor írja ki file-ba (deliver.log) kinek szállít ajándékot és ő hogyan reagált rá
 */

public class ChristmasFactory {

    private Present present;

    public ChristmasFactory(Toys toy) {
        this.present = toy;
    }

    public ChristmasFactory(HomeMadeGift homeMadeGift) {
        this.present = homeMadeGift;
    }

    public ChristmasFactory(ElectricDevices electricDevices) {
        this.present = electricDevices;
    }

    public void deliver(Person person) {
       String content =  person + ": " + person.receivePresent(present) + "\n";
        System.out.println(present.getWeight());
        try {
            Files.writeString(Path.of("src/resources/deliver.log"), content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
