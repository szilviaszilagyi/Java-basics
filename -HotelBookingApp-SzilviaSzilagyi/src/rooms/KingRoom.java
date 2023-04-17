package src.rooms;

public class KingRoom extends AbstractRoom {

    private int additionalRoomPrice = 11000;


    public KingRoom(boolean isExtraBedNeeded) {
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
