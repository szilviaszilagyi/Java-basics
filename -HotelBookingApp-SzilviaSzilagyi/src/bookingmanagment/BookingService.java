package src.bookingmanagment;

import src.rooms.KingRoom;
import src.rooms.StandardRoom;
import src.rooms.SuperiorRoom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingService implements BookingInterface {

    public List<String> saveBookingForm() {
        Scanner scanner = new Scanner(System.in);
        List<String> reservation = new ArrayList<>();
        System.out.println("Please enter the number of guests:");
        String person = scanner.nextLine();
        reservation.add(person);

        System.out.println("Please enter how many days are they staying:");
        String days = scanner.nextLine();
        reservation.add(days);

        System.out.println("Would you like breakfast? (Y/N):");
        String breakfast = scanner.nextLine();
        reservation.add(breakfast);

        System.out.println("Please enter the name of reservation:");
        String nameOfBooking = scanner.nextLine();
        reservation.add(nameOfBooking);

        System.out.println("Please enter what kind of room do you want? (standard, superior, king)");
        String roomType = scanner.nextLine();
        reservation.add(roomType);

        System.out.println("Do you need an extra bed? (Y/N):");
        String extraBed = scanner.nextLine();
        reservation.add(extraBed);

        String content = "Number of guest: " + person + System.lineSeparator() + "Staying days: " + days + System.lineSeparator() +
                "Breakfast choice: " + breakfast + System.lineSeparator() + "Name of booking: " + nameOfBooking + System.lineSeparator()
                + "Room: " + roomType + System.lineSeparator() + "Extra bed choice: " + extraBed;
        LocalDate now = LocalDate.now();
        String today = String.valueOf(now);
        try {
            Files.writeString(Path.of("src/resources/foglalási_adatok-" + today + ".txt"), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return reservation;
    }

    @Override
    public void newBooking(List<String> list) {
        int person = 0;
        try {
            person = Integer.parseInt(list.get(0));
        } catch (NumberFormatException ex) {
            System.out.println("Wrong data. Please enter a number the first question.");
        }

        int days = 0;
        try {
            days = Integer.parseInt(list.get(1));
        } catch (NumberFormatException ex) {
            System.out.println("Wrong data. Please enter a number the second question.");
        }


        String breakfast = list.get(2);
        boolean needBreakfast;
        int breakfastprice;
        if (breakfast.equalsIgnoreCase("y")) {
            needBreakfast = true;
            breakfastprice = 4500;
        } else {
            needBreakfast = false;
            breakfastprice = 0;
        }

        String bookingName = list.get(3);

        String extraBed = list.get(5);
        boolean needExtraBed;
        if (extraBed.equalsIgnoreCase("y")) {
            needExtraBed = true;
        } else {
            needExtraBed = false;
        }

        int roomPrice = 0;
        String roomType = list.get(4);
        if (roomType.equalsIgnoreCase("king")) {
            KingRoom reservedRoomKing = new KingRoom(needExtraBed);
            roomPrice = reservedRoomKing.calculateRoomPrice();
        } else if (roomType.equalsIgnoreCase("superior")) {
            SuperiorRoom reservedRoomSuperior = new SuperiorRoom(needExtraBed);
            roomPrice = reservedRoomSuperior.calculateRoomPrice();
        } else if (roomType.equalsIgnoreCase("standard")) {
            StandardRoom reservedRoomStandard = new StandardRoom(needExtraBed);
            roomPrice = reservedRoomStandard.calculateRoomPrice();
        }

        Booking firstBooking = new Booking(roomPrice, person, days, bookingName, breakfastprice);
        int reservationAmount = firstBooking.getTotalCost();
        System.out.println("Reservation details: " + System.lineSeparator() + firstBooking + System.lineSeparator() + "Reservation amount: " + reservationAmount);

    }

}

