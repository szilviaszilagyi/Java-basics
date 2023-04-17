package Task2_Car;

public class Car2 {
    private String model;
    private String type;
    private int releaseDate;
    private int doors;
    private String colour;

    public Car2(String model, String type, int releeaseDate, int doors, String colour) {
        this.model = model;
        this.type = type;
        this.releaseDate = releeaseDate;
        this.doors = doors;
        this.colour = colour;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Task2_Car2{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", vintage=" + releaseDate +
                ", doors=" + doors +
                ", colour='" + colour + '\'' +
                '}';
    }
}
