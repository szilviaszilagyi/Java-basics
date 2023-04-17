package Eloadasanyag.encapsulation.car;

public class CarExample {
    public static void main(String[] args) {
        Car audi = new Car("Audi Q7", "black");

        System.out.println("Model: " + audi.getModel());
        System.out.println("Colour: " + audi.getColour());
        System.out.println(audi);

        Car bmw = new Car("BMW X6", "blue");

        System.out.println("Model: " + bmw.getModel());
        System.out.println("Colour: " + bmw.getColour());
        System.out.println(bmw);

        Car ferrari = new Car("Ferrari 812 Superfast", "red");

        System.out.println("Model: " + ferrari.getModel());
        System.out.println("Colour: " + ferrari.getColour());
        System.out.println(ferrari);

        ferrari.setColour("yellow");
        System.out.println("Colour: " + ferrari.getColour());

    }
}