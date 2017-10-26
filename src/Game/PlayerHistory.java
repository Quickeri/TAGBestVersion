package Game;

import tag.RoomAndChest.Room;
import java.util.ArrayList;

public class PlayerHistory {

    ArrayList<String> visitedRooms = new ArrayList<>();
    HumanPlayer player;

    public PlayerHistory(HumanPlayer player) {
        this.player = player;
    }

    public void addToVisitedRooms(Room currentRoom) {
        visitedRooms.add(currentRoom.getRoomName());
    }

    @Override
    public String toString() {
        return "PlayerHistory{" + "visitedRooms=" + visitedRooms + '}';
    }

}
