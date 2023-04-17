package HomeWork;

public class Main {
    public static void main(String[] args) {
        Kids janika = new Kids(3, "Janika");
        Teenagers kloe = new Teenagers(16, "Kloé");
        Adults sandor = new Adults(54, "Sándor");
        Toys policeCar = new Toys("police car", "toy", 0.5);
        HomeMadeGift gyerekrajz = new HomeMadeGift("anya meg én a kertben", "home made gift", 0.1);
        ElectricDevices iPhone = new ElectricDevices("iPhone 11", "electric devices", 0.8);



        ChristmasFactory toyGift1 = new ChristmasFactory(policeCar);
        ChristmasFactory homeMadeGift1 = new ChristmasFactory(gyerekrajz);
        ChristmasFactory electriceDeviceGift1 = new ChristmasFactory(iPhone);

        System.out.println("---------------JANIKA------------------");
        toyGift1.deliver(janika);
        homeMadeGift1.deliver(janika);
        electriceDeviceGift1.deliver(janika);

        System.out.println("----------------------KOLE---------------------");
        toyGift1.deliver(kloe);
        homeMadeGift1.deliver(kloe);
        electriceDeviceGift1.deliver(kloe);

        System.out.println("-------------------SÁNDOR-----------------");
        toyGift1.deliver(sandor);
        homeMadeGift1.deliver(sandor);
        electriceDeviceGift1.deliver(sandor);





    }
}
