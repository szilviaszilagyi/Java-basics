package Task3_Dounut;

/**
 * Készítsétek el az alábbi példánk POJO-ját és 3 példányát a képen látható tulajdonságokkal és hozzájuk tartozó getter/setter metódusokkal.
 * (a többi metódusra most nincs szükségünk)
 */

public class DounutExample {
    public static void main(String[] args) {
        Dounut classicDounut = new Dounut("round", "10 cm", "chocolate", "flour", "powdered sugar");
        Dounut cubeDounut = new Dounut("cube", "15 cm", "jam", "flour", "powdered sugar");
        Dounut csoroge = new Dounut("oblong", "10 cm", "nature", "flour", "powdered sugar");
        System.out.println(classicDounut);
        System.out.println(cubeDounut);
        System.out.println(csoroge);
    }
}
