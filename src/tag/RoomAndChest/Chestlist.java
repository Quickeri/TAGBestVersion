package tag.RoomAndChest;

import Game.Souts;

public class Chestlist {
    Room currentRoom;
        public void chest() {

        switch (currentRoom.Chestchoice()) {
            case No_operation:
                break;
            case Draw:
                System.out.println("The game ends with a draw!");
                break;
            case Loose:
                System.out.println("you get poison, \"you dead\"");

                break;
            case Win:
                Souts.winnerMSG();
                break;
        }

    }
}
