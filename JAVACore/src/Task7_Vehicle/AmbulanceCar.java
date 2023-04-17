package Task7_Vehicle;

public class AmbulanceCar extends Vehicle {
    private String distinctiveSign;

    public AmbulanceCar(String manufacturer, String type, String color, int numberOfPassengers, boolean isSelfDriving, String distinctiveSign) {
        super(manufacturer, type, color, numberOfPassengers, isSelfDriving);
        this.distinctiveSign = distinctiveSign;
    }

    public String getDistinctiveSign() {
        return distinctiveSign;
    }

    public void sirens() {
        System.out.println("The ambulance sirens...");
    }

    public void entersHospital() {
        System.out.println("The ambulance enters the hospital");
    }
}
