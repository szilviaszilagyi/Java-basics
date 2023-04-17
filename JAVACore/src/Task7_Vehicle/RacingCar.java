package Task7_Vehicle;

public class RacingCar extends Vehicle{
    private boolean hasCrossBracing;
    private boolean extinguishingSystem;

    public RacingCar(String manufacturer, String type, String color, int numberOfPassengers, boolean isSelfDriving, boolean hasCrossBracing,
                     boolean extinguishingSystem) {
        super(manufacturer, type, color, numberOfPassengers, isSelfDriving);
        this.hasCrossBracing = hasCrossBracing;
        this.extinguishingSystem = extinguishingSystem;
    }

    public boolean getHasCrossBracing() {
        return hasCrossBracing;
    }

    public boolean getExtinguishingSystem() {
        return extinguishingSystem;
    }

    public void races() {
        System.out.println("The racing car races...");
    }
}
