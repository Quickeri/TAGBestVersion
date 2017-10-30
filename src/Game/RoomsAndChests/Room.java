package Game.RoomsAndChests;

import Game.Inventory;
import Game.Items.Item;
import Game.RoomsAndChests.Chest;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private Inventory roomInventory = new Inventory();
    private String description, roomName;
    private Room north, south, east, west;
    Scanner sc = new Scanner(System.in);
    private ArrayList<Chest> Chestlist = new ArrayList<>();
    private ArrayList<Item> inventory = new ArrayList<>();
    
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
    };

    public ArrayList<Chest> getChest() {
        return Chestlist;
    }

    public void addChest(Chest chest) {
        this.Chestlist.add(chest);
    }

    public ArrayList<Chest> getChestlist() {
        return Chestlist;
    }

    public void setChestlist(ArrayList<Chest> Chestlist) {
        this.Chestlist = Chestlist;
    }

    public action_type Chestchoice() {
        if (Chestlist.size() > 0) {
            System.out.println(Chestlist + " = list of chests in this room");
        }
        if (Chestlist.size() > 0) {
            System.out.println("do you want to open a chest?");
            System.out.println("y/n?");
            String y_n = sc.next();
            if (y_n.equals("y")) {
                int Chest_number = 0;
                boolean choice_ok;
                if (Chest_number > 1) {
                    do {
                        System.out.println("which chest? " + Chest_number + " " + Chestlist);
                        Chest_number = sc.nextInt();

                        choice_ok = (0 <= Chest_number)
                                && (Chest_number < Chestlist.size());
                    } while (!choice_ok);
                }
                if (Chestlist.get(Chest_number).item.equals("gold")) {
                    return action_type.Win;

                } else if (Chestlist.get(Chest_number).item.equals("poison")) {
                    return action_type.Lost;
                } else if (Chestlist.get(Chest_number).item.equals("item")) {
                    return action_type.item;
                }

            } // if chest chosen
        }
        // non-mpty chestlist

        return action_type.No_operation;// Chestchoise
    } // public class Room
}
