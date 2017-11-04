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

    public void addItem(Item item) {
        inventory.addItem(item);
    }

    /**
     * Monsters move method.
     *
     * The monster moves 1 of 4 ways north south east and west. If the monter
     * selects a way were there isnt a door it stays in this current room.
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

    public void setHealth(int health) {
        this.health = health;
    }
    public void setInventory(Item item) {
        inventory.addItem(item);
    }
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Method for getting the monsters name.
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Method for getting the monsters current room.
     *
     * @return
     */
    @Override
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Method for setting the monsters current room
     *
     * @param currentRoom
     */
    @Override
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    int getInventorySize() {
        return inventory.inventory.size();
    }

    @Override
    public void setDamage() {
        damage = 10;
    }

    void description() {

        System.out.println("Infront of you is the last boss it is your 7. grade teacher. you are fucked");
    }
}
