package src.bookingmanagment;

public class Booking {
    private int roomPrice;
    private int person;
    private int days;
    private String bookingName;
    private int breakfastPrice;

    public Booking(int roomPrice, int person, int days, String bookingName, int breakfastPrice) {
        this.roomPrice = roomPrice;
        this.person = person;
        this.days = days;
        this.bookingName = bookingName;
        this.breakfastPrice = breakfastPrice;
    }

    public int getTotalCost() {
        int totalCost = (roomPrice * days) + (person * breakfastPrice * days);
        return totalCost;
    }

    @Override
    public String toString() {
        return
                "roomPrice=" + roomPrice + "\n" +
                        "person=" + person + "\n" +
                        "days=" + days + "\n" +
                        "bookingName='" + bookingName + "\n" +
                        "breakfastPrice=" + breakfastPrice +
                        '}';
    }
}
