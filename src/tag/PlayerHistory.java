package tag;

import java.util.ArrayList;

public class PlayerHistory {
    ArrayList<room> visitedRooms = new ArrayList<>();
    Player player;
    
    public PlayerHistory(Player player){
        this.player = player;
    }
    
    public void addToVisitedRooms(room currentRoom){
        visitedRooms.add(currentRoom);
    }

    @Override
    public String toString() {
        return "PlayerHistory{" + "visitedRooms=" + visitedRooms + '}';
    }
    
}
