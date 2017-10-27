package Game;

import Game.RoomsAndChests.Room;
import java.util.Arrays;
import java.util.List;
import textio.SysTextIO;
import textio.TextIO;

public class Player extends Character {

    private List l = Arrays.asList(new String[]{"Help", "North", "South", "East", "West", "Route", "Quit"});
    private TextIO io = new TextIO(new SysTextIO());
    private String name;
    private int playerHP;
    private int maxPlayerHP = 100;
    private Inventory PlayerInventory = new Inventory();
    PlayerHistory playerHistory;
    // private Chestlist chestlist = new Chestlist();

    /**
     * Constructs the human player.
     *
     * @param name
     * @param currentRoom
     * @param playerHP
     * @param maxPlayerHP
     * @param playerHistory
     */
    public Player(String name, Room currentRoom, int playerHP, int maxPlayerHP, PlayerHistory playerHistory) {
        this.name = name;
        this.currentRoom = currentRoom;
        this.playerHP = playerHP;
        this.maxPlayerHP = maxPlayerHP;
        this.playerHistory = playerHistory;
    }

    public Inventory getPlayerInventory() {
        return PlayerInventory;
    }

    public void setPlayerInventory(Inventory PlayerInventory) {
        this.PlayerInventory = PlayerInventory;
    }

    /**
     * Method for getting hunman players health points.
     *
     * @return
     */
    public int getPlayerHP() {
        return playerHP;
    }

    /**
     * Method for setting human players health points.
     *
     * @param playerHP
     */
    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    /**
     * Method for getting human players max health points.
     *
     * @return
     */
    public int getMaxPlayerHP() {
        return maxPlayerHP;
    }

    /**
     * Method for setting human players max health points.
     *
     * @param maxPlayerHP
     */
    public void setMaxPlayerHP(int maxPlayerHP) {
        this.maxPlayerHP = maxPlayerHP;
    }

    /**
     * Method for setting
     *
     * @param currentRoom
     */
    @Override
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * Method for setting human players name.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method for getting human players current room.
     *
     * @return
     */
    @Override
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Method for getting human players name.
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Move method for human player. Shows direction options and makes the plaer
     * choose witch way to move. adds visited room to playerHistory. give help
     * and route option.
     */
    public void move() {
        int select = io.select("which way do you wanna go?", l, "");

        if (playerHistory.visitedRooms.isEmpty()) {
            playerHistory.addToVisitedRooms(currentRoom);
        }
//        if (currentRoom
//                != (playerHistory.visitedRooms.get(playerHistory.visitedRooms.size() - 1))) {
//            
//        }

        switch (select) {

            case 1:
                if (currentRoom.getNorth() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println(currentRoom.getDescription());
                } else {
                    
                    super.move(select);
                    System.out.println("you go north \n " + currentRoom.getDescription());
                    playerHistory.addToVisitedRooms(currentRoom);
                }
                break;
            case 2:
                if (currentRoom.getSouth() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println(currentRoom.getDescription());
                } else {
                    super.move(select);
                    System.out.println("You go south \n" + currentRoom.getDescription());
                }
                break;
            case 3:
                if (currentRoom.getEast() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println(currentRoom.getDescription());
                } else {
                   super.move(select);
                    System.out.println("You go east \n" + currentRoom.getDescription());
                }
                break;
            case 4:
                if (currentRoom.getWest() == null) {
                    System.out.println("---------------------\n You cannot go there!\n-----------------------");
                    System.out.println(currentRoom.getDescription());
                } else {
                    super.move(select);
                    System.out.println("You go west \n" + currentRoom.getDescription());
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

