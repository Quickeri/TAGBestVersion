package Game;

import Game.Items.Item;
import Game.Items.ItemList;
import Game.RoomsAndChests.Souts;
import Game.RoomsAndChests.RoomList;
import Game.RoomsAndChests.Room;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import textio.SysTextIO;
import textio.TextIO;

public class Game {

    private List l = Arrays.asList(new String[]{"Help", "North", "South", "East", "West", "Route", "pickup", "showitem", "quit"});
    private Scanner sc = new Scanner(System.in);
    private TextIO io = new TextIO(new SysTextIO());
    private Player player;

    private ArrayList<Room> rooms;
    private ArrayList<Room> visitedRooms;
    private boolean gameRunning = true;
    private Monster monster;
    private PlayerHistory ph;
    private String playerName;
    Random randomNumber = new Random();
    private ItemList itemList = new ItemList();

    /**
     * The game method constructs the dungoen, rooms, player, and the monster.
     */
    public Game() {
        RoomList rl = new RoomList();
        this.rooms = rl.createRooms();
        this.ph = new PlayerHistory(player);

        this.player = new Player(playerName, rooms.get(0), 100, 100, ph, 20);
        this.monster = new Monster("Boo", rooms.get(randomNumber.nextInt(19) + 2), 100, 10,rl);
        Item mItem = itemList.getMonsterheart();
        monster.addItem(mItem);
    }

    /**
     * The play method plays the rounds and checks for win and lose condition.
     */
    public void play() {
        String replay;
        System.out.println("------------------------- \n Welcome to our TAG v1.0 \n-------------------------");
        System.out.println("input your name for this run:");
        playerName = sc.nextLine();
        System.out.println("your name is: " + playerName);
        System.out.println("and now the game begins!");
        System.out.println("If you need a \"hand \" while playing - just ask for help!\n ");
        System.out.println("You are in room " + player.currentRoom.getRoomName());
        System.out.println(player.currentRoom.getDescription());
        
        while (gameRunning && player.getCurrentRoom() != rooms.get(21)) {

            if (player.playerHistory.visitedRooms.isEmpty()) {
                player.playerHistory.addToVisitedRooms(player.currentRoom);
            }

            io.put(player.currentRoom.getroomInventory().printInventory());

            int select = io.select("which way do you wanna go?", l, "");

            switch (select) {

                case 1:
                    player.moveNorth();
                    monster.move();
                    break;
                case 2:
                    player.moveSouth();
                    monster.move();
                    break;
                case 3:
                    player.moveEast();
                    monster.move();
                    break;
                case 4:
                    player.moveWest();
                    monster.move();
                    break;
                case 5:
                    System.out.println(player.playerHistory);
                    break;
                case 6:

                    player.pickupItem();
                    break;
                case 7:
                    io.put(player.inventory.printInventory());

                    break;
                case 8:

                    System.exit(0);
                    break;

                default:

                    System.out.println(
                            "Help I'm retarded!\n"
                            +player.playerHistory + "\n" 
                            + "1 = Help \n"
                            + "2 = North 3 = South 4 = East 5 = West \n"
                            + "6 = Route 7 = Pickupitem 8 = ShowItem \n"
                            + "9 = quit");
                    break;
            }

            if (player.getCurrentRoom() == monster.getCurrentRoom()) {

                Combat combat = new Combat(player, monster);
                combat.fight();
                if (player == combat.getWinner()) {
                    for (int i = 0; i < monster.getInventorySize(); i++) {
                        Item item = monster.inventory.inventory.get(i);
                        player.currentRoom.getroomInventory().addItem(item);
                    }
                    io.put("you killed the monster!!!!!!!!!!!!");
                    io.put(player.currentRoom.getRoomName());
                    io.put("The Monster droped some items");
                    io.put(player.currentRoom.getroomInventory().printInventory());

                }
                if (monster == combat.getWinner()) {

                    Souts.youDiedMSG();
                    System.out.println("do you want to play again? y/n");
                    replay = sc.next();

                    if ("y".equals(replay)) {
                        clearGame();
                        play();
                    } else if ("n".equals(replay)) {
                        System.out.println("Game Over!");
                        System.exit(0);
                    }
                }
            }
            if (player.getCurrentRoom() == rooms.get(21)) {
                Souts.winnerMSG();
                System.out.println("do you want to play again? y/n");
                replay = sc.next();

                if ("y".equals(replay)) {
                    clearGame();
                    play();
                } else if ("n".equals(replay)) {
                    System.out.println("Game Over!");
                    System.exit(0);
                }

            }
        }
    }

    /**
     * The claergame method clears the game data, so the game can start fresh
     * when the player chooses to play again.
     */
    private void clearGame() {
        player.setCurrentRoom(rooms.get(0));
        player.playerHistory.visitedRooms.clear();
    }
}
