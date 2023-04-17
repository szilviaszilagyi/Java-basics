package Task7_Vehicle;
/**(Órai)Készítsétek el az alábbi, együtt elkészített diagramon látható osztályhierarchiát. A metódusokat is tartalmazzák az osztályok, de elég akár
 * egy System.out.println() utasítást megvalósítaniuk, amely kiírja a konzolra hogy éppen mi az adott tevékenység. Pl.: dudálás() metódus kiírja, hogy
 * “A versenyautó dudál”.*/
public class Vehicle {
    String manufacturer;
    String type;
    String color;
    int numberOfPassengers;
    boolean isSelfDriving;

    public Vehicle(String manufacturer, String type, String color, int numberOfPassengers, boolean isSelfDriving) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.isSelfDriving = isSelfDriving;
    }

    public void accelerate() {
        System.out.println("The vehicle accelerates...");
    }

    public void stop() {
        System.out.println("The vehicle stops...");
    }

    public void honk() {
        System.out.println("The vehicle honks...");
    }

    public void usesTurnSignal() {
        System.out.println("The vehicle uses the turn signal");
    }
}
