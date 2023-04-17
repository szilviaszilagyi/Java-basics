package src;

import src.bookingmanagment.BookingService;

import java.util.List;
import java.util.Scanner;

public class HotelBookingApp {
    public static void main(String[] args) {
        BookingService bookingForm = new BookingService();
        List<String> reservation = bookingForm.saveBookingForm();
        bookingForm.newBooking(reservation);
    }
}
