package Game;

import tag.RoomAndChest.Room;
import java.util.ArrayList;

public class PlayerHistory {
    ArrayList<Room> visitedRooms = new ArrayList<>();
    Player player;
    
    public PlayerHistory(Player player){
        this.player = player;
    }
    
    public void addToVisitedRooms(Room currentRoom){
        visitedRooms.add(currentRoom);
    }

    @Override
    public String toString() {
        return "PlayerHistory{" + "visitedRooms=" + visitedRooms + '}';
    }
    
}
