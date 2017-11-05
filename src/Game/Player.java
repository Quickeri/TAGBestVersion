package Game;

import Game.Items.Armour;
import Game.Items.Healing;
import Game.Items.Item;
import Game.Items.Weapon;
import Game.RoomsAndsouts.Room;
import java.util.ArrayList;
import textio.SysTextIO;
import textio.TextIO;

public class Player extends Character {

    private final TextIO io = new TextIO(new SysTextIO());
    private int maxHealth = 100;
    PlayerHistory playerHistory;
    private Weapon wornWeapon = null;
    private Armour wornArmour = null;

    private int baseDamage = 7;
    private int baseHealth = 100;
    // private Chestlist chestlist = new Chestlist();

    /**
     * Constructs the human player.
     *
     * @param name
     * @param currentRoom
     * @param playerHP
     * @param maxHealth
     * @param playerHistory
     * @param damage
     */
    public Player(String name, Room currentRoom, int playerHP, int maxHealth, PlayerHistory playerHistory, int damage) {
        this.name = name;
        this.currentRoom = currentRoom;
        this.health = playerHP;
        this.maxHealth = maxHealth;
        this.playerHistory = playerHistory;
        this.damage = damage;
    }

    /**
     * Method for getting human players health points.
     *
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets players max health
     */
    public void setMaxHealth() {
        if (wornArmour == null) {
            maxHealth = 100;
        } else {

            maxHealth = baseHealth + wornArmour.getItemArmour();
            health = health + wornArmour.getItemArmour();
            io.put("your Health is " + health + "/" + maxHealth);
        }
    }

    /**
     * Method for getting human players max health points.
     *
     * @return
     */
    public int getMaxHealth() {
        return maxHealth;
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
        char arr[] = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ',') {
                arr[i] = '.';
            }
        }
        String fName = new String(arr);
        this.name = fName;
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
     * Return wornWeapon.
     *
     * @return
     */
    public Weapon getWornWeapon() {
        return wornWeapon;
    }

    /**
     *
     * Sets wornWornWeaon if there is a weapon in players inventory Takes the
     * best weapon from inventory and uses that.
     */
    public void setWornWeapon() {

        for (int i = 0; i < inventory.inventory.size(); i++) {
            ArrayList<Weapon> weapons = new ArrayList<>();

            if (inventory.inventory.get(i) instanceof Weapon) {
                weapons.add((Weapon) inventory.inventory.get(i));

            }
            weapons.sort((a, b) -> Integer.compare(b.getDamage(), a.getDamage()));

            if (weapons.size() > 0) {

                wornWeapon = weapons.get(0);
                System.out.println("You equip " + getWornWeapon().getName());

            }

        }
    }

    /**
     * Returns wornArmour.
     *
     * @return
     */
    public Armour getWornArmour() {
        return wornArmour;
    }

    /**
     * Sets wornArmpour to the armour with the best armour rating.
     */
    public void setWornArmour() {

        for (int i = 0; i < inventory.inventory.size(); i++) {
            ArrayList<Armour> armour = new ArrayList<>();
            if (inventory.inventory.get(i) instanceof Armour) {
                armour.add((Armour) inventory.inventory.get(i));

            }
            armour.sort((a, b) -> Integer.compare(b.getItemArmour(), a.getItemArmour()));
            if (armour.size() > 0) {

                wornArmour = armour.get(0);
                System.out.println("you equip " + getWornArmour().getName());

            }
        }
    }

    /**
     * Prints the room list over the rooms player has been in.
     */
    public void printPlayerHistory() {
        if (playerHistory.visitedRooms.isEmpty()) {
            playerHistory.addToVisitedRooms(currentRoom);
        }
    }

    /**
     * Makes the player move north if possible.
     */
    public void moveNorth() {
        if (currentRoom.getNorth() == null) {
            System.out.println("---------------------\n You cannot go there!\n-----------------------");
            System.out.println(currentRoom.getDescription());
        } else {
            currentRoom = currentRoom.getNorth();
            currentRoom.setHashMonster(false);
            System.out.println("you go north \n " + currentRoom.getDescription());
            playerHistory.addToVisitedRooms(currentRoom);
            System.out.println("-----------------------------");
            System.out.println("player is in" + currentRoom.getRoomName());
            System.out.println("-----------------------------");
        }
    }

    /**
     * Makes the player move south if possible.
     */
    public void moveSouth() {
        if (currentRoom.getSouth() == null) {
            System.out.println("---------------------\n You cannot go there!\n-----------------------");
            System.out.println(currentRoom.getDescription());
        } else {
            currentRoom = currentRoom.getSouth();
            currentRoom.setHashMonster(false);
            System.out.println("You go south \n" + currentRoom.getDescription());
            System.out.println("-----------------------------");
            System.out.println("player is in" + currentRoom.getRoomName());
            System.out.println("-----------------------------");
        }
    }

    /**
     * Makes the player move north if possible.
     */
    public void moveEast() {
        if (currentRoom.getEast() == null) {
            System.out.println("---------------------\n You cannot go there!\n-----------------------");
            System.out.println(currentRoom.getDescription());
        } else {
            currentRoom = currentRoom.getEast();
            currentRoom.setHashMonster(false);
            System.out.println("You go east \n" + currentRoom.getDescription());
            System.out.println("-----------------------------");
            System.out.println("player is in" + currentRoom.getRoomName());
            System.out.println("-----------------------------");
        }
    }

    /**
     * Makes the player move north if possible.
     */
    public void moveWest() {
        if (currentRoom.getWest() == null) {
            System.out.println("---------------------\n You cannot go there!\n-----------------------");
            System.out.println(currentRoom.getDescription());
        } else {
            currentRoom = currentRoom.getWest();
            currentRoom.setHashMonster(false);
            System.out.println("You go west \n" + currentRoom.getDescription());
            System.out.println("-----------------------------");
            System.out.println("player is in" + currentRoom.getRoomName());
            System.out.println("-----------------------------");
        }
    }

    /**
     * used to calculate score based on items in players inventory.
     *
     * @return
     */
    public int getScore() {
        int score = 0;
        for (Item item : inventory.getItems()) {
            score += item.getItemPoints();
        }
        return score;
    }

    /**
     * Picks up items from the players current room.
     */
    public void pickupItem() {
        ArrayList<Item> roomInv = currentRoom.getroomInventory().getInventory();
        for (int i = 0; i < roomInv.size(); i++) {
            inventory.addItem(roomInv.get(i));
            io.put(roomInv.get(i) + "\n");
        }
        roomInv.clear();
    }

    /**
     * Sets damage based on the weapon equipt.
     */
    @Override
    public void setDamage() {
        if (wornWeapon == null) {
            damage = baseDamage;

        } else {
            damage = baseDamage + wornWeapon.getDamage();
            io.put("Your new weapon gives you " + wornWeapon + " attack damage.");
        }
    }

    /**
     * heals if the player has lost health and has a healing item.
     */
    void heal() {
        boolean yes = false;
        for (int i = 0; i < inventory.inventory.size(); i++) {
            if (inventory.inventory.get(i) instanceof Healing) {
                yes = true;

            }
            if (yes == true) {
                health += 20;
                inventory.inventory.remove(i);
                i = inventory.inventory.size() + 1;
                if (health > maxHealth) {

                    health = maxHealth;

                }
                System.out.println("You feel revived, and you heal to "
                        + getHealth() + "/" + getMaxHealth());

            }

        }

    }
}
