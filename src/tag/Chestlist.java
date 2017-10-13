/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

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
                souts.winnerMSG();
                break;
        }

    }
}
