package Task11_polygon;
/** Készíts egy interfészt, PolygonInterface néven. Tartalmazzon egy metódust getArea néven, melynek a visszatérési értéke int, illetve van két int típusú
 * paramétere, amely a sokszög két oldala.
 Implementáld az interfészt egy téglalap osztály segítségével. Készíts el minden segéd változót, kontruktort, getter settert, toString-et ami esetleg
 szükséges. Készíts egy PolygonRunner osztályt, ahonnan ki tudod próbálni a téglalap osztály példányosítását és terület számítását.
 Készítsd el a téglalap osztályhoz hasonlóan a négyzet osztályt és próbáld ki azt is a PolygonRunner-ből.*/
public class Rectangle implements  PolygonInterface {
    private int aSide;
    private int bSide;
    private int cSide;
    private int dSide;
    private int result;

    public Rectangle(int aSide, int bSide, int cSide, int dSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.dSide = dSide;
    }

    public Rectangle(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        result= getArea(aSide, bSide);
    }

    public int getResult() {
        return result;
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public void setcSide(int cSide) {
        this.cSide = cSide;
    }

    public int getdSide() {
        return dSide;
    }

    public void setdSide(int dSide) {
        this.dSide = dSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                ", cSide=" + cSide +
                ", dSide=" + dSide +
                '}';
    }

    @Override
    public int getArea(int a, int b) {
        int result = a * b;
        return result;
    }
}
