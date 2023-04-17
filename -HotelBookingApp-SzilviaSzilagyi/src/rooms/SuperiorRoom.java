package src.rooms;

public class SuperiorRoom extends AbstractRoom {

    private int additionalRoomPrice = 3500;

    public SuperiorRoom(boolean isExtraBedNeeded) {
        super(isExtraBedNeeded);

    }

    @Override
    public int calculateRoomPrice() {
        int roomPrice = 0;
        if (isExtraBedNeeded) {
            roomPrice = extraBedPrice + additionalRoomPrice + getSeasonBasedDefaultPrice();
        } else {
            roomPrice = additionalRoomPrice + getSeasonBasedDefaultPrice();
        }
        return roomPrice;
    }

}

