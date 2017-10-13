package tag;

import java.util.ArrayList;

public class RoomList {

    public ArrayList<Room> createRooms() {

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room("Prison Cell")); //0
        rooms.add(new Room("Prison Hallway")); //1
        rooms.add(new Room("Servants Quarters")); //2
        rooms.add(new Room("Guards Room")); //3
        rooms.add(new Room("Hallway"));//4
        rooms.add(new Room("Guard mess hall"));//5
        rooms.add(new Room("Tunnel"));//6
        rooms.add(new Room("Guards kitchen"));//7
        rooms.add(new Room("Food storage"));//8
        rooms.add(new Room("Weapon storage"));//9
        rooms.add(new Room("Blacksmith workshop"));//10
        rooms.add(new Room("Main hall"));//11
        rooms.add(new Room("Dining room"));//12
        rooms.add(new Room("Art Gallery"));//13
        rooms.add(new Room("Masters quarters "));//14
        rooms.add(new Room("Balcony"));//15
        rooms.add(new Room("Walkway"));//16
        rooms.add(new Room("Archives"));//17
        rooms.add(new Room("Harbor"));//18
        rooms.add(new Room("Bridge"));//19
        rooms.add(new Room("Stairs"));//20
        rooms.add(new Room("Masters workshop"));//21        

// connect rooms both ways
        rooms.get(0).setNorth(rooms.get(1));

        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setEast(rooms.get(3));
        rooms.get(1).setWest(rooms.get(11));
        rooms.get(1).setNorth(rooms.get(2));

        rooms.get(2).setSouth(rooms.get(1));
        rooms.get(2).setEast(rooms.get(4));

        rooms.get(2).setNorth(rooms.get(5));

        rooms.get(3).setWest(rooms.get(1));
        rooms.get(3).addChest(new Chest("cabinet", "item"));
        rooms.get(3).setNorth(rooms.get(4));

        rooms.get(4).setSouth(rooms.get(3));
        rooms.get(4).setEast(rooms.get(9));
        rooms.get(4).setWest(rooms.get(2));

        rooms.get(5).setSouth(rooms.get(2));
        rooms.get(5).setEast(rooms.get(6));
        rooms.get(5).setWest(rooms.get(16));
        rooms.get(5).setNorth(rooms.get(7));

        rooms.get(6).setEast(rooms.get(10));
        rooms.get(6).setWest(rooms.get(5));

        rooms.get(7).setSouth(rooms.get(5));
        rooms.get(7).setEast(rooms.get(8));

        rooms.get(8).setWest(rooms.get(7));

        rooms.get(9).setWest(rooms.get(4));
        rooms.get(9).setNorth(rooms.get(10));

        rooms.get(10).setSouth(rooms.get(9));
        rooms.get(10).setWest(rooms.get(6));

        rooms.get(11).setSouth(rooms.get(18));
        rooms.get(11).setEast(rooms.get(1));
        rooms.get(11).setWest(rooms.get(12));

        rooms.get(12).setEast(rooms.get(11));
        rooms.get(12).setWest(rooms.get(19));
        rooms.get(12).addChest(new Chest("Big bot", "poison"));
        rooms.get(12).setNorth(rooms.get(13));

        rooms.get(13).setSouth(rooms.get(12));
        rooms.get(13).setNorth(rooms.get(14));

        rooms.get(14).setSouth(rooms.get(13));
        rooms.get(14).setEast(rooms.get(16));
        rooms.get(14).setNorth(rooms.get(15));

        rooms.get(15).setSouth(rooms.get(14));

        rooms.get(16).setSouth(rooms.get(17));
        rooms.get(16).setEast(rooms.get(5));
        rooms.get(16).setWest(rooms.get(14));

        rooms.get(17).setNorth(rooms.get(16));

        rooms.get(18).setNorth(rooms.get(11));

        rooms.get(19).setEast(rooms.get(12));
        rooms.get(19).setNorth(rooms.get(20));

        rooms.get(20).setSouth(rooms.get(19));
        rooms.get(20).setNorth(rooms.get(21));

        rooms.get(21).setSouth(rooms.get(20));
        rooms.get(21).addChest(new Chest("winner", "gold"));
        return rooms;
    }

   
    
}
