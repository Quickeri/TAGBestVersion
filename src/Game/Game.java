package Game;

import tag.RoomAndChest.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import textio.SysTextIO;
import textio.TextIO;

public class Game {

    private Scanner sc = new Scanner(System.in);
    private TextIO io = new TextIO(new SysTextIO());
    private HumanPlayer player;

    private ArrayList<Room> rooms;
    private ArrayList<Room> visitedRooms;
    private boolean gameRunning = true;
    private Monster monster;
    private PlayerHistory ph;
    Random randomNumber = new Random();

    public Game() {
        RoomList rl = new RoomList();
        this.rooms = rl.createRooms();
        this.ph = new PlayerHistory(player);
        this.player = new HumanPlayer("Hansi", rooms.get(0), 100, 100, ph);
        this.monster = new Monster("Boo", rooms.get(randomNumber.nextInt(19)+2));
    }

    public void play() {
        String replay;
        System.out.println("------------------------- \n Welcome to our TAG v1.0 \n-------------------------");
        System.out.println("If you need a \"hand \" while playing - just ask for help! ");
        System.out.println("You are in room " + player.getCurrentRoom());
        while (gameRunning && player.getCurrentRoom() != rooms.get(21)) {
            player.move();
            monster.move();
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

    private void clearGame() {
        player.setCurrentRoom(rooms.get(0));
        player.playerHistory.visitedRooms.clear();
    }
}
