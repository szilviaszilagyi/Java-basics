package src.rooms;

public class StandardRoom extends AbstractRoom {


    public StandardRoom(boolean isExtraBedNeeded) {
        super(isExtraBedNeeded);
    }

    @Override
    public int calculateRoomPrice() {
        int roomPrice = 0;
        if (isExtraBedNeeded) {
            roomPrice = extraBedPrice + getSeasonBasedDefaultPrice();
        } else {
            roomPrice = getSeasonBasedDefaultPrice();
        }
        return roomPrice;
    }
}
