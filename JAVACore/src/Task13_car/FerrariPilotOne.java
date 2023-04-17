package Task13_car;

public class FerrariPilotOne implements Car, Racer {
    private String name;
    private String manufacturer;
    private String nationality;
    private double time;

    public FerrariPilotOne(String name, String manufacturer, String nationality) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.nationality = nationality;
    }

    @Override
    public void acceleration(double time) {
        this.time = time;
        System.out.println(time);

    }

    @Override
    public String getCarManufacturer() {
        return manufacturer;
    }

    @Override
    public String getRacerName() {
        return name;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "FerrariPilotOne{" +
                "name='" + name +
                ", manufacturer='" + manufacturer +
                ", nationality='" + nationality +
                ", acceleration='" + time +
                '}';
    }
}
