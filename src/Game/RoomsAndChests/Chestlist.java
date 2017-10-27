package Game.RoomsAndChests;

public class Chestlist {
    Room currentRoom;
        public void chest() {

        switch (currentRoom.Chestchoice()) {
            case No_operation:
                break;
            case Draw:
                System.out.println("The game ends with a draw!");
                break;
            case Lost:
                System.out.println("you get poisoned, \"you have died\"");

                break;
            case Win:
                Souts.winnerMSG();
                break;
        }

    }
}
