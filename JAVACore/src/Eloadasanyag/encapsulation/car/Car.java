package Eloadasanyag.encapsulation.car;

public class Car {

    /**fields/osztályváltozó */
    private String model;
    private String colour;

    /**constructor */
    public Car(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    /**getters, setters  --> elkérő és beállító metódusok, ha nem akarunk a példányon utólag módosítani, akkor nem kell setter metódus */
    /** getter metódus elkér az osztálytól, és azt adja vissza */
    public String getModel() {

        return model;
    }
    /** setter metódus  - az osztályváltozó neve a set metódus neve is, tulajdonságokat állít be */
    public void setModel(String model) {
        this.model = model; /** this kulcsszó azt mondja meg, hogy az a metódus/változó az adott osztályra, illetve az adott objektumra vonatkozik, a .
         után kiírja az elérhető metódusokat */
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    @Override  /** ez felülírja az obejkum viselkedését */
    public String toString() {
        return "Class_and_methods.Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }


}
