package src.rooms;

import java.time.LocalDate;
import java.time.Month;

public abstract class AbstractRoom {
    protected boolean isExtraBedNeeded;
    protected int extraBedPrice = 3000;
    private int seasonBasedPrice;


    public AbstractRoom(boolean isExtraBedNeeded) {
        this.isExtraBedNeeded = isExtraBedNeeded;

    }

    public int getSeasonBasedDefaultPrice() {
        LocalDate now = LocalDate.now();
        Month actualMonth = now.getMonth();
        switch (actualMonth) {
            case DECEMBER, JANUARY, FEBRUARY, MARCH, APRIL, MAY -> seasonBasedPrice = 11000;
            case JUNE, JULY, AUGUST -> seasonBasedPrice = 21000;
            case SEPTEMBER, OCTOBER, NOVEMBER -> seasonBasedPrice = 15000;
        }
        return seasonBasedPrice;
    }

    public abstract int calculateRoomPrice();
}
