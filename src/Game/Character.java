package Game;

import Game.Items.Item;
import Game.RoomsAndChests.Room;


public abstract class Character {

    String name;
    int health;
    int damage;
    Item currentItem;

    
    Room currentRoom;
    
    Inventory inventory = new Inventory();

/**
 * move method for our characters (monster and player)
 * can move the characters in all 4 directions (by setting currentRoom to the room in the appropiate direction of currentRoom)
 */
    public void move(int select) {

        switch (select) {
            case 1:
                if (currentRoom.getNorth() == null) {
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
    public abstract void setDamage(int d);

    @Override
    public String toString() {
        return "currentRoom=" + currentRoom + '}';
    }
}
