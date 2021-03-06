package Game;

import Game.Items.Item;
import Game.RoomsAndsouts.Room;
import Game.RoomsAndsouts.RoomList;

public class Monster extends Character {

    private final RoomList rl;

    /**
     * Constructs monster.
     *
     * @param name
     * @param currentRoom
     * @param health
     * @param damage
     * @param rl
     */
    public Monster(String name, Room currentRoom, int health, int damage, RoomList rl) {
        this.name = name;
        this.currentRoom = currentRoom;
        this.damage = damage;
        this.health = health;
        this.rl = rl;

    }

    /*
    Adds item to rooms inventory.
     */
    public void addItem(Item item) {
        inventory.addItem(item);
    }

    /**
     * Makes the monster choose what way to go in the dungoen.
     *
     */
    public void move() {
        int select = 0;
        int count = 0;
        while (count < 100) {
            count++;

            select = (int) (Math.random() * 4) + 1;

            if (select == 1) {
                if (currentRoom.getNorth() != null && !currentRoom.getNorth().hashMonster()) {
                    currentRoom.getNorth().setHashMonster(true);
                    break;
                }
            }
            if (select == 2) {
                if (currentRoom.getSouth() != null && !currentRoom.getSouth().hashMonster()) {
                    currentRoom.getSouth().setHashMonster(true);
                    break;
                }
            }
            if (select == 3) {
                if (currentRoom.getEast() != null && !currentRoom.getEast().hashMonster()) {
                    currentRoom.getEast().setHashMonster(true);
                    break;
                }
            }
            if (select == 4) {
                if (currentRoom.getWest() != null && !currentRoom.getWest().hashMonster()) {
                    currentRoom.getWest().setHashMonster(true);
                    break;
                }
            }
        }
        if (count < 100) {
            currentRoom.setHashMonster(false);
            super.move(select);
        }

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Room getCurrentRoom() {
        return currentRoom;
    }

    @Override
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    int getInventorySize() {
        return inventory.inventory.size();
    }

    @Override
    public void setDamage() {
        damage = 6;
    }

    void description() {

        System.out.println("Infront of you is the might King Kongor. dispite you entering his workshop he doesn't notice you\n"
                + "He is in the middle of picking his nose and as he pulls a might booger\n"
                + "out of his nose and eats it, you can't help but say \"EW!\".\n"
                + "oh no! He has noticed you and is angry that you are criticising his boogerpicking and now he is VERY angry!");
    }
}
