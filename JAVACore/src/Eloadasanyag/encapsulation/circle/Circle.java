package Eloadasanyag.encapsulation.circle;
/** ENKAPSZULÁCIÓ - EGYSÉGBEZÁRÁS*/
public class Circle {
    private double radius; /** ha a final-t is odaírnánk, akkor az egy biztonsági megjelenése, hogy a kör sugara soha sem módosítható */

    public Circle(double radius) {
        this.radius = radius;

    }
    public double getRadius() {
        return radius;
    }
    /** Kör kerülete */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    /** Kör területe */
    public double getArea() {
        return Math.PI * radius * radius;
    }
    /** ez a metódus egy új kört hoz létre, egy új objektumot */
    public Circle scale(double scaleFactor) {
        return new Circle(radius * scaleFactor);
    }
}
