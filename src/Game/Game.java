package Game;

import Game.Items.Item;
import Game.Items.ItemList;
import Game.RoomsAndsouts.Souts;
import Game.RoomsAndsouts.RoomList;
import Game.RoomsAndsouts.Room;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import textio.SysTextIO;
import textio.TextIO;

public class Game {

    private final List l = Arrays.asList(new String[]{"Help", "Go North", "Go South", "Go East", "Go West", "View visited rooms", "Pickup Items", "Show inventory", "Heal", "Quit"});
    private final Scanner sc = new Scanner(System.in);
    private final TextIO io = new TextIO(new SysTextIO());
    private Player player;

    private final ArrayList<Room> rooms;
    private ArrayList<Room> visitedRooms;
    private final boolean gameRunning = true;
    private Monster monster;
    private Monster monster2;
    private Monster boss;
    private PlayerHistory ph;

    private HighScore hScores = new HighScore();
    Random randomNumber = new Random();
    private ItemList itemList = new ItemList();

    /**
     * The game method constructs the dungeon, rooms, player, and the monster.
     */
    public Game() {
        RoomList rl = new RoomList();
        this.rooms = rl.createRooms();
        this.ph = new PlayerHistory(player);

        this.player = new Player("name", rooms.get(0), 100, 100, ph, 7);
        this.monster = new Monster("The Boogerman", rooms.get(randomNumber.nextInt(19) + 2), 100, 9, rl);
        this.monster2 = new Monster("Salty Jimmy", rooms.get(randomNumber.nextInt(19) + 2), 100, 9, rl);
        this.boss = new Monster("BOSS", rooms.get(21), 150, 12, rl);

        monster.addItem(itemList.getMonsterheart());
        monster2.addItem(itemList.getMonsterheart());
    }

    /**
     * The play is the method plays the runs the game and checks for win and lose condition.
     *
     */
    public void play() {
        String replay;
        System.out.println("------------------------- \n Welcome to the dungoen of team 5\n-------------------------");
        System.out.println("Please enter your name for this run:");
        player.setName(sc.nextLine());
        System.out.println("Your name is: " + player.getName());
        System.out.println("And now the game begins!");
        System.out.println(player.currentRoom.getDescription());

        while (gameRunning && player.getCurrentRoom() != rooms.get(21)) {

            if (player.playerHistory.visitedRooms.isEmpty()) {
                player.playerHistory.addToVisitedRooms(player.currentRoom);
            }
            io.put("In this room you find:\n");
            
            io.put(player.currentRoom.getroomInventory().printInventory());

            int select = io.select("What do you want to do?", l, "");

            if (player.currentRoom.getRoomName().equals("Secret room")
                    && -1 == player.inventory.inventory.indexOf(itemList.getKey())) {
                select = 2;
            }

            switch (select) {

                case 1:
                    player.moveNorth();
                    monster.move();
                    monster2.move();
                    break;
                case 2:
                    player.moveSouth();
                    monster.move();
                    monster2.move();
                    break;
                case 3:
                    player.moveEast();
                    monster.move();
                    monster2.move();
                    break;
                case 4:
                    player.moveWest();
                    monster.move();
                    monster2.move();
                    break;
                case 5:
                    System.out.println(player.playerHistory);
                    break;
                case 6:

                    player.pickupItem();
                    player.setWornWeapon();
                    player.setWornArmour();
                    player.setMaxHealth();
                    player.setDamage();
                    break;
                case 7:

                    io.put(player.inventory.printInventory());
                    if (player.getHealth() <= 50) {

                        System.out.println("Your health is "
                                + player.getHealth() + "/" + player.getMaxHealth()
                                + "Maybe you should heal! (if your health reaches 0 you die!)");
                    } else {
                        System.out.println("Your health is "
                                + player.getHealth() + "/" + player.getMaxHealth());
                    }
                    break;
                case 8:
                    player.heal();
                    break;
                case 9:

                    System.exit(0);
                    break;

                default:
                    System.out.println(
                            "Help is here!\n"
                            + "Each number represents what action you can do.\n"
                            + "So let's say you want to move north, you enter 2 and then you go north!\n"
                            + "1 = Help \n"
                            + "2 = North 3 = South 4 = East 5 = West \n"
                            + "6 = Route 7 = Pickupitem 8 = ShowItem \n"
                            + "9 = Heal 10 = Quit");
                    break;
            }

            Combat combat = new Combat(player, monster);
            Combat combat2 = new Combat(player, monster2);
            if (player.getCurrentRoom() == monster.getCurrentRoom()) {

                combat.fight();
                if (player.getName().equals(combat.getWinner())) {
                    for (int i = 0; i < monster.getInventorySize(); i++) {
                        Item item = monster.inventory.inventory.get(i);
                        player.currentRoom.getroomInventory().addItem(item);
                        monster.setCurrentRoom(rooms.get(randomNumber.nextInt(19)));
                    }
                }
            }
            if (player.getCurrentRoom() == monster2.getCurrentRoom()) {

                combat2.fight();
                if (player.getName().equals(combat2.getWinner())) {
                    for (int i = 0; i < monster2.getInventorySize(); i++) {
                        Item item = monster2.inventory.inventory.get(i);
                        player.currentRoom.getroomInventory().addItem(item);
                        monster2.setCurrentRoom(rooms.get(randomNumber.nextInt(19)));
                    }

                }
            }
            if (monster.getName().equals(combat.getWinner())
                    || monster2.getName().equals(combat2.getWinner())) {

                Souts.youDiedMSG();
                System.out.println("Do you want to play again? y/n");
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
            Combat bCombat = new Combat(player, monster);
            boss.description();
            bCombat.fight();

            if (player.getName().equals(bCombat.getWinner())) {
                HighScore hs = new HighScore();
                Score score = new Score(player.getName(), player.getScore());
                List<Score> scores = hScores.getHighScore();
                scores.add(score);
                hs.setHighScore(scores);
                Souts.winnerMSG();
                System.out.println("Do you want to play again? y/n");
                replay = sc.next();

                if ("y".equals(replay)) {
                    clearGame();
                    play();
                } else if ("n".equals(replay)) {
                    System.out.println("Game Over!");
                    System.exit(0);
                }
            } else {
                Souts.youDiedMSG();
            }
            System.out.println("Do you want to play again? y/n");
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

    /**
     * The cleargame method clears the game data, so the game can start fresh
     * when the player chooses to play again.
     */
    private void clearGame() {
        player.setCurrentRoom(rooms.get(0));
        player.playerHistory.visitedRooms.clear();
    }
}
