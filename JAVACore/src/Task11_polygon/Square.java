package Task11_polygon;

public class Square implements PolygonInterface {
    private int result;
     private  int side;



    public Square(int side) {
        this.side = side;
        result = getArea(side, 0);

    }

    public int getResult() {
        return result;
    }

    @Override
    public int getArea(int a, int b) {
        int result = a * 2;
        return result;

    }

    @Override
    public String toString() {
        return "Square{" +
                "result=" + result +
                ", side=" + side +
                '}';
    }
}
