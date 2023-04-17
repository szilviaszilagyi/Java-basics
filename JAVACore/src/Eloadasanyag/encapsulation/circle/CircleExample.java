package Eloadasanyag.encapsulation.circle;

public class CircleExample {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Perimeter: " + c1.getArea());
        c1 = c1.scale(5);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Perimeter: " + c1.getArea());
    }
}
