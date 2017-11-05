package Game;

import Game.RoomsAndsouts.Room;
import java.util.ArrayList;

public class PlayerHistory {

    ArrayList<String> visitedRooms = new ArrayList<>();
    Player player;

    public PlayerHistory(Player player) {
        this.player = player;
    }
    public void addToVisitedRooms(Room currentRoom) {
        visitedRooms.add(currentRoom.getRoomName());
    }
    @Override
    public String toString() {
        return "You have been in these rooms:" + visitedRooms + ".";
    }
}
