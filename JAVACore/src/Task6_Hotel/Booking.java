/**
 * Hotel nyilvántartás. A nyilvántartás képes a vendég adatokat beolvasni és letárolni, majd megjeleníteni őket. Kötelezően tárolja milyen
 * névre szólt a foglalás, az érkezés és a távozás időpontját valamint, hogy hány főre foglaltak szállást. Opcionálisan pedig lehessen letárolni a
 * foglaláshoz tartozó telefonszámot. Legyen limitálva, hogy hány foglalást tud kezelni a program.
 * Hozz létre egy Booking osztályt, amely tartalmazza a foglalás adatait. Írj metódusokat az osztály változók értékeinek megadására illetve lekérdezésére.
 * Ezen felül hasznos lehet egy toString metódus a letárolt adatainak a megjelenítésére.
 * Írj programot, amely a konzolról beolvasott adatok segítségével létrehoz annyi Booking példányt, amennyi darabszám beállításra került a program
 * argumentumként. Például ha a program argumentum 4, akkor a beolvasott adatokat követően, azok tárolása és kíírása után az alábbi példa kimenetet kell
 * lássuk a konzolon:
 * Name: Kerri Philis
 * Phone number: 84258058
 * Check in date: 2014-05-22
 * Checko out date: 2014-05-23
 * Number of guests: 5
 * <p>
 * Name: Bryan Ambrosine
 * Phone number: 96112202
 * Check in date: 2016-11-15
 * Checko out date: 2016-11-18
 * Number of guests: 2
 * <p>
 * Name: Leland Hollie
 * Phone number: 45431352
 * Check in date: 2013-02-09
 * Checko out date: 2013-02-11
 * Number of guests: 3
 * <p>
 * Name: Ryley Trev
 * Phone number: 29118351
 * Check in date: 2017-12-01
 * Checko out date: 2017-12-06
 * Number of guests: 4
 */


package Task6_Hotel;

public class Booking {
    private String name;
    private int phoneNumber;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;

    public Booking(String name, String checkInDate, String checkOutDate, int numberOfGuests) {
        this.name = name;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                "\nPhoneNumber: " + phoneNumber +
                "\nCheckInDate: " + checkInDate +
                "\nCheckOutDate: " + checkOutDate +
                "\nNumberOfGuests: " +  numberOfGuests + "\n";
    }
}
