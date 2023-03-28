package Enum.Task107_Enum_orderStatus;
/** Készítsetek egy OrderStatus nevű enumot, mely ACCEPTED, PAYED, TRANSIT, DELIVERED értékeket tartalmaz. A program indítása után kiírja, hogy
 * “Your order is currently … “ A … helyén pedig legyen a fenti enumok értéke, például “Your order is currently ACCEPTED and waiting for the payment.
 * ” Az pedig, hogy a fenti értékek közül melyiket írja ki a program véletlenszerűen dőljön el. Egy random generált 1-4 közötti szám döntse el a
 * státuszt. Pl.: 1 esetén ACCEPTED */
public enum OrderStatus {
    ACCEPTED, PAYED, TRANSIT, DELIVERED

}
