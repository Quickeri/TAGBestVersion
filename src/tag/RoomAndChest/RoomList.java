package tag.RoomAndChest;

import tag.RoomAndChest.Room;
import java.util.ArrayList;

public class RoomList {

    public ArrayList<Room> createRooms() {

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room("Prison Cell", ""));         //Room number 0 - starting Room
        rooms.add(new Room("Prison Hallway",""));      //Room number 1
        rooms.add(new Room("Servants Quaters",""));    //Room number 2
        rooms.add(new Room("Guards Room",""));         //Room number 3
        rooms.add(new Room("Hallway",""));             //Room number 4
        rooms.add(new Room("Gaurd mess hall",""));     //Room number 5
        rooms.add(new Room("Tunnel",""));              //Room number 6
        rooms.add(new Room("Guards kitchen",""));      //Room number 7
        rooms.add(new Room("Foodstorage",""));         //Room number 8
        rooms.add(new Room("Weapon storage",""));      //Room number 9
        rooms.add(new Room("Blacksmith workshop","")); //Room number 10
        rooms.add(new Room("Main hall",""));           //Room number 11
        rooms.add(new Room("Dining room",""));         //Room number 12
        rooms.add(new Room("Art Gallery",""));         //Room number 13
        rooms.add(new Room("Masters quaters",""));    //Room number 14
        rooms.add(new Room("Balcony",""));             //Room number 15
        rooms.add(new Room("Walkway",""));             //Room number 16
        rooms.add(new Room("Arcvies",""));             //Room number 17
        rooms.add(new Room("Harbor",""));              //Room number 18
        rooms.add(new Room("Bridge",""));              //Room number 19
        rooms.add(new Room("Stairs",""));              //Room number 20
        rooms.add(new Room("Masters workshop",""));    //Room number 21 - Last Room - winnerchest       

        // Adds connections between the rooms
        rooms.get(0).setNorth(rooms.get(1));
        rooms.get(0).toString("Prison Cell\n" + "Cold and humid air makes you shiver. "
                + "Rats running across the floor and spiders in the ceiling.\n"
                + "You know this place and the things you remember about it are not good things. You wonder why you are here. \n"
                + "To the north, you see the cell door.");

        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setEast(rooms.get(3));
        rooms.get(1).setWest(rooms.get(11));
        rooms.get(1).setNorth(rooms.get(2));
        rooms.get(1).toString("Prison Hallway\n" + "A long hallway filled with cell doors.\n"
                + "Only a few lights are still burning and most of the hallway is dark.\n"
                + "To the west, you can see there are stairs going up, but not where.\n"
                + "To the north, you can see a door, but not where it leads.\n"
                + "To the east, you also see a door, but not where it leads.\n"
                + "To the south, you see the door to the Prison cell where you started.");

        rooms.get(2).setSouth(rooms.get(1));
        rooms.get(2).setEast(rooms.get(4));
        rooms.get(2).setNorth(rooms.get(5));
        rooms.get(2).toString("Servants Quaters\n" + "You see a big room filled with beds and private belongings.\n"
                + "There are no servants present.\n"
                + "To the north, you see a door, but not where it leads. \n"
                + "To the east, you see a door, but not where it leads. \n"
                + "To the south, you see a door, but not where it leads.");

        rooms.get(3).setWest(rooms.get(1));
        rooms.get(3).setNorth(rooms.get(4));
        rooms.get(3).toString("Guards Room\n" + "You enter and see empty wine bottles laying around "
                + "and a large table in the middle of the room, filled with playing cards.\n"
                + "To the west, you see a door, but not where it leads.\n"
                + "To the north, you also see a door, but not where it leads.");

        rooms.get(4).setSouth(rooms.get(3));
        rooms.get(4).setEast(rooms.get(9));
        rooms.get(4).setWest(rooms.get(2));
        rooms.get(4).toString("Hallway\n" + "You enter a long and dark hallway. "
                + "There are cobwebs all over the ceiling and the air is stale and musty.\n"
                + "To the east, you see a door, but not where it leads.\n"
                + "To the west, you a broken door leading into a dark room.");

        rooms.get(5).setSouth(rooms.get(2));
        rooms.get(5).setEast(rooms.get(6));
        rooms.get(5).setWest(rooms.get(16));
        rooms.get(5).setNorth(rooms.get(7));
        rooms.get(5).toString("Guards Mess Hall\n" + "you enter a large room with many tables. "
                + "It is still lit, but there is a stench of rotten food.\n" + "It must have been a long time since anyone has been here.\n"
                + "To the north, you see the door from which the horrid stench is coming from.\n"
                + "To the west, you see worn down stairs leading upwards.\n"
                + "To the east, you see a pitch-black hole in the wall.\n"
                + "To the south, you see a door, but not where it leads.");

        rooms.get(6).setEast(rooms.get(10));
        rooms.get(6).setWest(rooms.get(5));
        rooms.get(6).toString("Tunnel\n" + "A dark and humid tunnel.\n"
                + "To the west, you can see a opening with a stench of rot.\n"
                + "To the east, you see a dark room smelling of rusty iron.");

        rooms.get(7).setSouth(rooms.get(5));
        rooms.get(7).setEast(rooms.get(8));
        rooms.get(7).toString("Guards Kitchen\n" + "Pots filled with rotten food. A stench making you nearly vomit. All the food is rotten.\n"
                + "To the east, you see a some stairs leading down into darkness.\n"
                + "To the south, you see the door you came from.");

        rooms.get(8).setWest(rooms.get(7));
        rooms.get(8).toString("Food Storage\n" + "After going down the stairs you arrive in a very cold room.\n" 
                + "Your breath is turning into mist as you begin shaking from the cold.\n"
                + "There are still edible food, but the stench from the kitchen, has taken your appetite.\n"
                + "To the west, you see the stairs you came from.");

        rooms.get(9).setWest(rooms.get(4));
        rooms.get(9).setNorth(rooms.get(10));
        rooms.get(9).toString("Weapon Storage\n" + "You enter a room filled with old rusty weapons. "
                + "Nothing seems to have been maintained for a long time.\n"
                + "To the north you see a door covered in ashes.\n"
                + "To the west, you see a door leading to the hallway.");

        rooms.get(10).setSouth(rooms.get(9));
        rooms.get(10).setWest(rooms.get(6));
        rooms.get(10).toString("Blacksmith’s Workshop\n" + "As you enter, you begin to cough. "
                + "The air is filled with dust and ash. There are tools scattered all over the floor.\n"
                + "To the west you see a opening to a tunnel.\n"
                + "To the south, you see a door, but not what is behind it.");

        rooms.get(11).setSouth(rooms.get(18));
        rooms.get(11).setEast(rooms.get(1));
        rooms.get(11).setWest(rooms.get(12));
        rooms.get(11).toString("Main Hall\n" + "You enter a giant hall. there are stair leading upwards. There is a large gate,\n"
                + "that seems to be the exit from the castle. you can smell the sea from a open window.\n"
                + "To the west, you can see stair, but not where they go.\n"
                + "To the east, you can see stairs leading down to the basement.\n"
                + "To the south you see the giant gate which seems to be the main entrance to the castle.");

        rooms.get(12).setEast(rooms.get(11));
        rooms.get(12).setWest(rooms.get(19));
        rooms.get(12).setNorth(rooms.get(13));
        rooms.get(12).toString("Dining room\n" + "A room with a tall ceiling and a long table. "
                + "There is what seems to be a throne at the end of the table. This must be the lord’s dining room.\n"
                + "To the north, you can see a door, but not where it leads.\n"
                + "To the west, you can see a door, but not where it leads.\n"
                + "To the east, you can see a door, but not where it leads.");

        rooms.get(13).setSouth(rooms.get(12));
        rooms.get(13).setNorth(rooms.get(14));
        rooms.get(13).toString("Art gallery\n" + "you enter a long passage filled with portraits and busts. "
                + "You see many of the portraits are of the same person. That must be the lord himself.\n"
                + "To the north, you see a door, but not where it leads.\n"
                + "To the south, you see a door, but not where it leads.");

        rooms.get(14).setSouth(rooms.get(13));
        rooms.get(14).setEast(rooms.get(16));
        rooms.get(14).setNorth(rooms.get(15));
        rooms.get(14).toString("Masters quarters\n" + "you enter what seems to be the master quarters. "
                + "There is a bed, and a desk filled with books and writing equipment.\n"
                + "To the north, you see glass doors, leading to a balcony.\n"
                + "To the east, you see a door, but not where it leads.\n"
                + "To the south, you see a door, but not where it leads.");

        rooms.get(15).setSouth(rooms.get(14));
        rooms.get(15).toString("Balcony\n" + "You step out onto the balcony. It is an amazing view over the lake. "
                + "You feel calm again.\n"
                + "To the south, you see the doors where you came from.");

        rooms.get(16).setSouth(rooms.get(17));
        rooms.get(16).setEast(rooms.get(5));
        rooms.get(16).setWest(rooms.get(14));
        rooms.get(16).toString("Walkway\n" + "As you enter the walkway, you see a smaller house ahead of you.\n"
                + "The walkway also leads down a slope, where you find a door that seems to go into the hill.\n"
                + "To the west you see a door to the castle.\n"
                + "To the east, you see the door leading into the hill.\n"
                + "To the south, you see the small house.");

        rooms.get(17).setNorth(rooms.get(16));
        rooms.get(17).toString("Archives\n" + "As you enter the archives, you rows and rows of bookcases. "
                + "There is a thick smell of old books.\n"
                + "The sheer thought of how much knowledge there is in this room is staggering.\n"
                + "To the north, you see the door you came from.");

        rooms.get(18).setNorth(rooms.get(11));
        rooms.get(18).toString("Harbour\n" + "As you step out of the gate, you are meet with a breeze of fresh air. "
                + "It feels as if there was a great burden taken off you shoulders.\n"
                + "To the north, you see the gate you came from.");

        rooms.get(19).setEast(rooms.get(12));
        rooms.get(19).setNorth(rooms.get(20));
        rooms.get(19).toString("Bridge\n" + "As you step through the door, you are met with a cold gust of wind. " 
                + "You have just stepped out on a bridge leading to a separate tower and the castle.\n"
                + "To the east, you see the door to the tower.\n"
                + "To the north, you see the door to the castle.");

        rooms.get(20).setSouth(rooms.get(19));
        rooms.get(20).setNorth(rooms.get(21));
        rooms.get(20).toString("Stairs\n" + "You enter the stairs of the tower. You get a ominous feeling from above. "
                + "something is going on up there, and you not sure that you like it.\n"
                + "To the north, you head upwards to the top of the tower.\n"
                + "To the south, you leave the tower.");

        rooms.get(21).setSouth(rooms.get(20));
        rooms.get(21).toString("Master Workshop\n" + "You have entered the Masters workshop!");

        //rooms.get(21).setChest(new Chest());
        return rooms;
    }

}
