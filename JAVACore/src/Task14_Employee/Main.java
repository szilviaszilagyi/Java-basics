package Task14_Employee;

/**
 * (Órai) Készítsünk egy absztrakt osztályt, amely munkavállaló, Employee néven fut. Legyen benne egy absztrakt metódus, amely kiszámolja a fizetését
 * comutePay néven, egy metódus a neve és pozíciója elkérésére getName és getPosition néven. Konstruktorában kapja meg és csak létrehozáskor lehessen
 * eállítani a szükséges attribútumait.
 * Készítsünk egy Main osztályt, ahol megpróbáljuk példányosítani az Employee osztályt. Nézzük meg milyen hibaüzenetet ír ki a program.
 * Készítsünk egy SoftwareTester osztály, melyben származtassunk le az Employee osztályból. Az absztrakt osztályban kötelező tulajdonságok mellett a
 * kontruktor kapja meg azt a darabszámot, amely megmondja hány bugot talált az aktuális évben, bugCount néven. Példányosítsuk a Main osztályunkból.
 * Készítsünk egy HrAssistant melyben származtassunk le az Employee osztályból. Az absztrakt osztályban kötelező tulajdonságok mellett a kontruktor kapja
 * meg azt a logikai változót, amely azt jelzi hogy van még türelme az emberekhez, noMorePeople néven.Példányosítsuk a Main osztályunkból.
 */
public class Main {
    public static void main(String[] args) {
        SoftwerTester softwerTester = new SoftwerTester("Lali", "junior tester", 37);
        System.out.println(softwerTester);
        HrAssistant hrAssistant = new HrAssistant("Angela", "hr assistant", false);
        System.out.println(hrAssistant);


    }
}
