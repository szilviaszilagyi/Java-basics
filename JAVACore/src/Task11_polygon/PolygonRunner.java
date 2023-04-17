package Task11_polygon;

public class PolygonRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 25);
        int area = rectangle.getResult();
        System.out.println(area);
        System.out.println(rectangle);

        Square square = new Square(34);
        int area2 = square.getResult();
        System.out.println(area2);
        System.out.println(square);


    }
}
