package Task6_Hotel;

import java.util.*;
/**
 * Hotel nyilvántartás. A nyilvántartás képes a vendég adatokat beolvasni és letárolni, majd megjeleníteni őket. Kötelezően tárolja milyen névre szólt a foglalás, az érkezés és a távozás időpontját
 * valamint, hogy hány főre foglaltak szállást. Opcionálisan pedig lehessen letárolni a foglaláshoz tartozó telefonszámot. Legyen limitálva, hogy hány foglalást tud kezelni a program.
 * Hozz létre egy Booking osztályt, amely tartalmazza a foglalás adatait. Írj metódusokat az osztály változók értékeinek megadására illetve lekérdezésére. Ezen felül hasznos lehet egy toString metódus
 * a letárolt adatainak a megjelenítésére.
 * A Booking osztálynak a következő változókat kell tartalmaznia:
 * String name;
 * int phoneNumber;
 * String checkInDate;
 * String checkOutDate;
 * int numberOfGuests;
 * Írj programot, amely a konzolról beolvasott adatok segítségével létrehoz annyi Booking példányt, amennyi darabszám beállításra került a program argumentumként. Például ha a program argumentum 4,
 * akkor a beolvasott adatokat követően, azok tárolása és kíírása után az alábbi példa kimenetet kell lássuk a konzolon:
 * Name: Kerri Philis
 * Phone number: 84258058
 * Check in date: 2014-05-22
 * Checko out date: 2014-05-23
 * Number of guests: 5
 *
 * Name: Bryan Ambrosine
 * Phone number: 96112202
 * Check in date: 2016-11-15
 * Checko out date: 2016-11-18
 * Number of guests: 2
 *
 * Name: Leland Hollie
 * Phone number: 45431352
 */
public class Reservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Booking> reservations = new ArrayList<>(); /** ezek az adattípusok képesek bármilyen osztályt eltárolni */
        Map<Integer, Booking> reservationMap = new HashMap<>(); /** booking objektum és Integer azonosító a foglaláshoz */
        Set<Booking> reservationSet = new HashSet<>();
        Booking[] reservationArray = new Booking[2];
        int bookingcount = Integer.parseInt(args[0]);
        for (int i = 0; i < bookingcount; i++) {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            System.out.println("Please enter your phone number:");
            int phoneNumber;
            try {
                phoneNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                phoneNumber = 0;
            }
            System.out.println("Please enter your arrival date:");
            String checkInDate = scanner.nextLine();
            System.out.println("Please enter your departure date:");
            String checkOutDate = scanner.nextLine();
            System.out.println("Please enter the number of guests:");
            int numberOfGuests = Integer.parseInt(scanner.nextLine());

            Booking reservation = new Booking(name, checkInDate, checkOutDate, numberOfGuests);
            reservations.add(reservation);
            reservationMap.put(i, reservation);
            reservationSet.add(reservation);
            reservationArray[i] = reservation;
            if (phoneNumber != 0) {
                reservation.setPhoneNumber(phoneNumber);
            }

            System.out.println(reservation);
        }
        System.out.println("----------------LISTA----------------");
        for (int i = 0; i < reservations.size(); i++) {
            System.out.println(reservations.get(i));
        }
        System.out.println("----------------MAP----------------");
        System.out.println(reservationMap.get(0));
        System.out.println(reservationMap.get(1));

        System.out.println("----------------SET----------------");
        for (Booking b : reservationSet)
            System.out.println(b);
        System.out.println("----------------ARRAY----------------");
        System.out.println(reservationArray[0]);
        System.out.println(reservationArray[1]);
        System.out.println("----------------EQUALS?----------------");
        System.out.println(reservationArray[0] == reservationArray[1]); /** két objektum soha nem lesz egyenlő egymással, akkor sem, ha ugyanozk az értékek
         vannak benne */


    }
}
