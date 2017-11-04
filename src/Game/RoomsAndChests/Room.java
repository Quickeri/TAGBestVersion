package Game.RoomsAndChests;

import Game.Inventory;
import Game.Items.Item;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private Inventory roomInventory = new Inventory();
    private Souts souts = new Souts();
    private String description, roomName;
    private Room north, south, east, west;
    Scanner sc = new Scanner(System.in);
    private ArrayList<Item> inventory = new ArrayList<>();
    private boolean hashMonster = false;

    public boolean hashMonster() {
        return hashMonster;
    }

    public void setHashMonster(boolean hashMonster) {
        this.hashMonster = hashMonster;
    }
    

    /**
     * Constructs room with name and description.
     *
     * @param roomName
     * @param description
     */
    public Room(String roomName, String description) {
        this.description = description;
        this.roomName = roomName;
    }

    public Inventory getroomInventory() {
        return roomInventory;
    }
   

    public void setroomInventory(Inventory RoomInventory) {
        this.roomInventory = RoomInventory;
    }
    
    
    /**
     * this method is used to connect current room with the room north of it.
     *
     * @param north
     */
    public void setNorth(Room north) {
        this.north = north;
    }

    /**
     * this method is used to connect current room with the room south of it.
     *
     * @param south
     */
    public void setSouth(Room south) {
        this.south = south;
    }

    /**
     * this method is used to connect current room with the room west of it.
     *
     * @param west
     */
    public void setWest(Room west) {
        this.west = west;
    }

    /**
     * this method is used to connect current room with the room east of it.
     *
     * @param east
     */
    public void setEast(Room east) {
        this.east = east;
    }

    /**
     * this method is used to set room name.
     *
     * @param roomName
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * This Method is used to get room name:
     *
     * @return
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * This method is used to get the room north of current room.
     *
     * @return
     */
    public Room getNorth() {
        return north;
    }

    /**
     * This method is used to get the room south of current room.
     *
     * @return
     */
    public Room getSouth() {
        return south;
    }

    /**
     * This method is used to get the room west of current room.
     *
     * @return
     */
    public Room getWest() {
        return west;
    }

    /**
     * This method is used to get the room east of current room.
     *
     * @return
     */
    public Room getEast() {
        return east;
    }


    public String getDescription() {
        return description;
    }

    void toString(String string) {
        description = string;
    }

    enum action_type {
        No_operation, Win, Lost, Draw, item
    }

    
}
