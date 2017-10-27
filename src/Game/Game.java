package Game;

import Game.RoomsAndChests.Souts;
import Game.RoomsAndChests.RoomList;
import Game.RoomsAndChests.Room;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import textio.SysTextIO;
import textio.TextIO;

public class Game {

    private Scanner sc = new Scanner(System.in);
    private TextIO io = new TextIO(new SysTextIO());
    private Player player;

    private ArrayList<Room> rooms;
    private ArrayList<Room> visitedRooms;
    private boolean gameRunning = true;
    private Monster monster;
    private PlayerHistory ph;
    Random randomNumber = new Random();

    /**
     * The game method constructs the dungoen, rooms, player, and the monster.
     */
    public Game() {
        RoomList rl = new RoomList();
        this.rooms = rl.createRooms();
        this.ph = new PlayerHistory(player);
        this.player = new Player("Hansi", rooms.get(0), 100, 100, ph);
        
        this.monster = new Monster("Boo", rooms.get(randomNumber.nextInt(19) + 2));
    }

    /**
     * The play method plays the rounds and checks for win and lose condition.
     */
    public void play() {
        String replay;
        System.out.println("------------------------- \n Welcome to our TAG v1.0 \n-------------------------");
        System.out.println("If you need a \"hand \" while playing - just ask for help!\n ");
        System.out.println("You are in room " + player.currentRoom.getRoomName());
        System.out.println(player.currentRoom.getDescription());
        while (gameRunning && player.getCurrentRoom() != rooms.get(21) &&
                 player.getCurrentRoom() != monster.getCurrentRoom()) {
            player.move();
            monster.move();
        }
        if (player.getCurrentRoom() == monster.getCurrentRoom()) {

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

    /**
     * The claergame method clears the game data, so the game can start fresh
     * when the player chooses to play again.
     */
    private void clearGame() {
        player.setCurrentRoom(rooms.get(0));
        player.playerHistory.visitedRooms.clear();
    }
}
