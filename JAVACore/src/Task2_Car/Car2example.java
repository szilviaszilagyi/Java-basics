package Task2_Car;

/** Készítsétek el az alábbi példánk POJO-ját és 3 példányát a képen látható tulajdonságokkal és hozzájuk tartozó getter/setter metódusokkal. (a többi metódusra most nincs szükségün */

public class Car2example {
    public static void main(String[] args) {
        Car2 toyotaYaris = new Car2("Toyota", "Yaris", 2020,5,"kolbászzsírmetál");
        System.out.println(toyotaYaris);
        Car2 alfaRomeoGt = new Car2("Alfa Romeo", "GT", 2006,3,"black");
        System.out.println(alfaRomeoGt);
        Car2 scania = new Car2("Scania", "R500 Super", 2021,2,"red");
        System.out.println(scania);
    }


}

