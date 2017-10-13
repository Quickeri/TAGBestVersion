package tag;

import java.util.ArrayList;
import java.util.Scanner;

public class room {

    private String description;
    private room north, south, east, west;

    private ArrayList<Chest> Chestlist = new ArrayList<>();

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

    public room(String description) {
        this.description = description;
    }
    
    public void setNorth(room north) {
        this.north = north;
    }
    public void setSouth(room south) {
        this.south = south;
    }
    public void setWest(room west) {
        this.west = west;
    }
    public void setEast(room east) {
        this.east = east;
    }
    public String getDescription() {
        return description;
    }
    public room getNorth() {
        return north;
    }
    public room getSouth() {
        return south;
    }
    public room getWest() {
        return west;
    }
    public room getEast() {
        return east;
    }

    @Override
    public String toString() {
        return description;
    }
    Scanner sc = new Scanner(System.in);

    void toString(String string) {
        description = string;
    }

    enum action_type {
        No_operation, Win, Loose, Draw, item
    };

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
                    return action_type.Loose;
                } else if (Chestlist.get(Chest_number).item.equals("item")) {
                    return action_type.item;
                }

            } // if chest chosen
        }
        // non-mpty chestlist

        return action_type.No_operation;// Chestchoise
    } // public class room
}
