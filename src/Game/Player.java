package Game;

import tag.RoomAndChest.*;
import java.util.Arrays;
import java.util.List;
import textio.SysTextIO;
import textio.TextIO;

public class Player {

    private List l = Arrays.asList(new String[]{"Help", "North", "South", "East", "West", "Route", "Quit"});
    private TextIO io = new TextIO(new SysTextIO());
    public Room currentRoom;
    private String name;
    private int playerHP;
    private int maxPlayerHP = 100;
    PlayerHistory playerHistory;
    private Chestlist chestlist = new Chestlist();

    public Player(String name, Room currentRoom, int playerHP, int maxPlayerHP, PlayerHistory playerHistory) {
        this.playerHistory = playerHistory;
        this.name = name;
        this.currentRoom = currentRoom;
        this.maxPlayerHP = maxPlayerHP;
        this.playerHP = playerHP;
    }

    public int getPlayerHP() {
        return playerHP;
    }
    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }
    public int getMaxPlayerHP() {
        return maxPlayerHP;
    }
    public void setMaxPlayerHP(int maxPlayerHP) {
        this.maxPlayerHP = maxPlayerHP;
    }
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public String getName() {
        return name;
    }
    
//    public void chest() {
//
//        switch (currentRoom.Chestchoice()) {
//            case No_operation:
//                break;
//            case Draw:
//                System.out.println("The game ends with a draw!");
//                break;
//            case Loose:
//                System.out.println("you get poisoned, \"you died\"");
//                break;
//            case Win:
//                System.out.println("you win");;
//                break;
//        }
//    }
    //Move method for the player
    public void move() {
        int select = io.select("which way do you wanna go?", l, "");
//
        if (playerHistory.visitedRooms.isEmpty()) {
            playerHistory.addToVisitedRooms(currentRoom);
        }
//else{
//        if (currentRoom.getRoomName() != (playerHistory.visitedRooms.get(playerHistory.visitedRooms.size() - 1))) {
//            playerHistory.addToVisitedRooms(currentRoom);
//        }
        switch (select) {

            case 1:
                if (currentRoom.getNorth() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println("You are in room " + getCurrentRoom());
                } else {
                    currentRoom = currentRoom.getNorth();
                    System.out.println("you go north \n You are now in room " + getCurrentRoom());
                    playerHistory.addToVisitedRooms(currentRoom);
                }
                break;
            case 2:
                if (currentRoom.getSouth() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println("You are in room " + getCurrentRoom());
                } else {
                    currentRoom = currentRoom.getSouth();
                    System.out.println("You go south \n You are now in room " + getCurrentRoom());
                    playerHistory.addToVisitedRooms(currentRoom);
                }
                break;
            case 3:
                if (currentRoom.getEast() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println("You are in room " + getCurrentRoom());
                } else {
                    currentRoom = currentRoom.getEast();
                    System.out.println("You go east \n You are now in room " + getCurrentRoom());
                    playerHistory.addToVisitedRooms(currentRoom);
                }
                break;
            case 4:
                if (currentRoom.getWest() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println("You are in room " + getCurrentRoom());
                } else {
                    currentRoom = currentRoom.getWest();
                    System.out.println("You go west \nYou are now in room " + getCurrentRoom());
                    playerHistory.addToVisitedRooms(currentRoom);
                }
                break;
            case 5:
                System.out.println(playerHistory);
                break;
            case 6:
                System.exit(0);
                break;
            default:

                System.out.println("Help I'm retarded!\n"
                        + "1 = Help \n"
                        + "2 = North 3 = South 4 = East 5 = West \n"
                        + "6 = Route 7 = quit");
                break;
        }
    }
}
