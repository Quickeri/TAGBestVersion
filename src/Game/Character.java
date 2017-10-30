package Game;

import Game.Items.Item;
import Game.RoomsAndChests.Room;
import java.util.ArrayList;


public abstract class Character {

    private String name;
    Item currentItem;
    Room currentRoom;
    Inventory inventory = new Inventory();
    
    public void move(int select) {
       
       
        switch (select) {
            case 1:
                if (currentRoom.getNorth()== null) { 
                    
                   // System.out.println("sourth is null");
                } else { 
                    currentRoom = currentRoom.getNorth();
                }
                break;

            case 2:
                if (currentRoom.getSouth() == null) {
                } else {
                    currentRoom = currentRoom.getSouth();
                }
                break;
            case 3:
                if (currentRoom.getEast() == null) {
                } else {
                    currentRoom = currentRoom.getEast();
                }
                break;
            case 4:
                if (currentRoom.getWest() == null) {
                } else {
                    currentRoom = currentRoom.getWest();
                }
                break;
        }
    }

    
    
    
    public abstract String getName();

    public abstract Room getCurrentRoom();

    public abstract void setCurrentRoom(Room currentRoom);

}
