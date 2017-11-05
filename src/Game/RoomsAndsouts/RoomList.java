package Game.RoomsAndsouts;

import Game.Items.ItemList;
import java.util.ArrayList;
import java.util.Random;

public class RoomList {

    /**
     * createRooms method creates the rooms, and connects the rooms together as
     * a dungeon.
     *
     * @return
     */
    private ArrayList<Room> rooms = new ArrayList<>();
    private Random randomNumber = new Random();
    ItemList itemList = new ItemList();

    public ArrayList<Room> createRooms() {

        rooms.add(new Room("Prison Cell", "Cold and humid air makes you shiver. "
                + "Rats running across the floor and spiders in the ceiling.\n"
                + "You know this place and the things you remember about it are not good things. You wonder why you are here. \n"
                + "To the north, you see the cell door."));         //Room number 0 - starting Room

        rooms.add(new Room("Prison Hallway", "A long hallway filled with cell doors.\n"
                + "Only a few lights are still burning and most of the hallway is dark.\n"
                + "To the west, you can see there are stairs going up, but not where.\n"
                + "To the north, you can see a door, but not where it leads.\n"
                + "To the east, you also see a door, but not where it leads.\n"
                + "To the south, you see the door to the Prison cell where you started."));      //Room number 1

        rooms.add(new Room("Servants Quaters", "You see a big room filled with beds and private belongings.\n"
                + "There are no servants present.\n"
                + "To the north, you see a door, but not where it leads. \n"
                + "To the east, you see a door, but not where it leads. \n"
                + "To the south, you see a door, but not where it leads."));    //Room number 2

        rooms.add(new Room("Guards Room", "You enter and see empty wine bottles laying around "
                + "and a large table in the middle of the room, filled with playing cards.\n"
                + "To the west, you see a door, but not where it leads.\n"
                + "To the north, you also see a door, but not where it leads."));         //Room number 3

        rooms.add(new Room("Hallway", "You enter a long and dark hallway. "
                + "There are cobwebs all over the ceiling and the air is stale and musty.\n"
                + "To the east, you see a door, but not where it leads.\n"
                + "To the west, you a broken door leading into a dark room."));             //Room number 4

        rooms.add(new Room("Gaurd mess hall", "you enter a large room with many tables. "
                + "It is still lit, but there is a stench of rotten food.\n" + "It must have been a long time since anyone has been here.\n"
                + "To the north, you see the door from which the horrid stench is coming from.\n"
                + "To the west, you see worn down stairs leading upwards.\n"
                + "To the east, you see a pitch-black hole in the wall.\n"
                + "To the south, you see a door, but not where it leads."));     //Room number 5

        rooms.add(new Room("Tunnel", "A dark and humid tunnel.\n"
                + "To the west, you can see a opening with a stench of rot.\n"
                + "To the east, you see a dark room smelling of rusty iron."));              //Room number 6

        rooms.add(new Room("Guards kitchen", "Pots filled with rotten food. A stench making you nearly vomit. All the food is rotten.\n"
                + "To the east, you see a some stairs leading down into darkness.\n"
                + "To the south, you see the door you came from."));      //Room number 7

        rooms.add(new Room("Foodstorage", "After going down the stairs you arrive in a very cold room.\n"
                + "Your breath is turning into mist as you begin shaking from the cold.\n"
                + "There are still edible food, but the stench from the kitchen, has taken your appetite.\n"
                + "To the west, you see the stairs you came from."));         //Room number 8

        rooms.add(new Room("Weapon storage", "You enter a room filled with old rusty weapons. "
                + "Nothing seems to have been maintained for a long time.\n"
                + "To the north you see a door covered in ashes.\n"
                + "To the west, you see a door leading to the hallway."));      //Room number 9

        rooms.add(new Room("Blacksmith workshop", "As you enter, you begin to cough. "
                + "The air is filled with dust and ash. There are tools scattered all over the floor.\n"
                + "To the west you see a opening to a tunnel.\n"
                + "To the south, you see a door, but not what is behind it.")); //Room number 10

        rooms.add(new Room("Main hall", "You enter a giant hall. there are stair leading upwards. There is a large gate,\n"
                + "that seems to be the exit from the castle. you can smell the sea from a open window.\n"
                + "To the west, you can see stair, but not where they go.\n"
                + "To the east, you can see stairs leading down to the basement.\n"
                + "To the south you see the giant gate which seems to be the main entrance to the castle."));           //Room number 11

        rooms.add(new Room("Dining room", "A room with a tall ceiling and a long table. "
                + "There is what seems to be a throne at the end of the table. This must be the lord’s dining room.\n"
                + "To the north, you can see a door, but not where it leads.\n"
                + "To the west, you can see a door, but not where it leads.\n"
                + "To the east, you can see a door, but not where it leads."));         //Room number 12

        rooms.add(new Room("Art Gallery", "you enter a long passage filled with portraits and busts. "
                + "You see many of the portraits are of the same person. That must be the lord himself.\n"
                + "To the north, you see a door, but not where it leads.\n"
                + "To the south, you see a door, but not where it leads."));         //Room number 13

        rooms.add(new Room("Masters quaters", "you enter what seems to be the master quarters. "
                + "There is a bed, and a desk filled with books and writing equipment.\n"
                + "To the north, you see glass doors, leading to a balcony.\n"
                + "To the east, you see a door, but not where it leads.\n"
                + "To the south, you see a door, but not where it leads."));    //Room number 14

        rooms.add(new Room("Balcony", "You step out onto the balcony. It is an amazing view over the lake. "
                + "You feel calm again.\n"
                + "To the south, you see the doors where you came from."));             //Room number 15

        rooms.add(new Room("Walkway", "As you enter the walkway, you see a smaller house ahead of you.\n"
                + "The walkway also leads down a slope, where you find a door that seems to go into the hill.\n"
                + "To the west you see a door to the castle.\n"
                + "To the east, you see the door leading into the hill.\n"
                + "To the south, you see the small house."));             //Room number 16

        rooms.add(new Room("Arcvies", "As you enter the archives, you rows and rows of bookcases. "
                + "There is a thick smell of old books.\n"
                + "The sheer thought of how much knowledge there is in this room is staggering.\n"
                + "To the north, you see the door you came from."));             //Room number 17

        rooms.add(new Room("Harbor", "As you step out of the gate, you are meet with a breeze of fresh air. "
                + "It feels as if there was a great burden taken off you shoulders.\n"
                + "To the north, you see the gate you came from."));              //Room number 18

        rooms.add(new Room("Bridge", "As you step through the door, you are met with a cold gust of wind. "
                + "You have just stepped out on a bridge leading to a separate tower and the castle.\n"
                + "To the east, you see the door to the tower.\n"
                + "To the north, you see the door to the castle."));              //Room number 19

        rooms.add(new Room("Stairs", "You enter the stairs of the tower. You get a ominous feeling from above. "
                + "something is going on up there, and you not sure that you like it.\n"
                + "To the north, you head upwards to the top of the tower.\n"
                + "To the south, you leave the tower."));              //Room number 20
        
        rooms.add(new Room("Masters workshop","You have entered the Masters workshop!"));    //Room number 21 
        
        
        rooms.add(new Room("Secret room", "you have entered a secret room there are a sword in the room nothing else"));
        /**
         * Sets the direction and the rooms next to each room
         */
        rooms.get(0).setNorth(rooms.get(1));

        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setEast(rooms.get(3));
        rooms.get(1).setWest(rooms.get(11));
        rooms.get(1).setNorth(rooms.get(2));

        rooms.get(2).setSouth(rooms.get(1));
        rooms.get(2).setEast(rooms.get(4));
        rooms.get(2).setNorth(rooms.get(5));

        rooms.get(3).setWest(rooms.get(1));
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
        rooms.get(12).setNorth(rooms.get(13));
        rooms.get(12).setSouth(rooms.get(22));
        
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
        rooms.get(21).setHashMonster(true);
        
        // secret room number 22 
        rooms.get(22).setNorth(rooms.get(12));
        
        
        /**
         * Adds items to each rooms inventory
         */
        rooms.get(1).getroomInventory().addItem(itemList.getWoodKnife());
        rooms.get(1).getroomInventory().addItem(itemList.getHealingPotion());

        rooms.get(2).getroomInventory().addItem(itemList.getClothArmour());

        rooms.get(3).getroomInventory().addItem(itemList.getSmallBastardSword());

        rooms.get(6).getroomInventory().addItem(itemList.getClothArmour());

        rooms.get(7).getroomInventory().addItem(itemList.getWoodKnife());
        
        rooms.get(8).getroomInventory().addItem(itemList.getCoins());
        
        rooms.get(9).getroomInventory().addItem(itemList.getLeatherArmour());
        rooms.get(9).getroomInventory().addItem(itemList.getLongSword());

        rooms.get(10).getroomInventory().addItem(itemList.getChainmail());

        rooms.get(11).getroomInventory().addItem(itemList.getCoins());

        rooms.get(12).getroomInventory().addItem(itemList.getCoins());

        rooms.get(13).getroomInventory().addItem(itemList.getCoins());

        rooms.get(14).getroomInventory().addItem(itemList.getCoins());
        rooms.get(14).getroomInventory().addItem(itemList.getGreatSword());
        
        rooms.get(15).getroomInventory().addItem(itemList.getKey());
        rooms.get(15).getroomInventory().addItem(itemList.getCoins());
        rooms.get(16).getroomInventory().addItem(itemList.getCoins());

        rooms.get(17).getroomInventory().addItem(itemList.getCoins());

        rooms.get(18).getroomInventory().addItem(itemList.getCoins());

        rooms.get(19).getroomInventory().addItem(itemList.getCoins());

        rooms.get(17).getroomInventory().addItem(itemList.getGreaterHealingPotion());
        rooms.get(17).getroomInventory().addItem(itemList.getCoins());

        rooms.get(20).getroomInventory().addItem(itemList.getHealingPotion());
        
        rooms.get(22).getroomInventory().addItem(itemList.getKingKongor());
        
        return rooms;
    }

    public Room getRandomRoom() {
        return rooms.get(randomNumber.nextInt(19));
    }
}
        
        
