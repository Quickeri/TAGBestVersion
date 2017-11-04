package Game;

import Game.Items.Armour;
import Game.Items.Healing;
import Game.Items.Item;
import Game.Items.ItemList;
import Game.Items.Weapon;
import Game.RoomsAndChests.Room;
import java.util.ArrayList;
import textio.SysTextIO;
import textio.TextIO;

public class Player extends Character {

    private TextIO io = new TextIO(new SysTextIO());
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

    public Inventory getinventory() {
        return inventory;
    }

    public void setinventory(Inventory PlayerInventory) {
        this.inventory = PlayerInventory;
    }

    /**
     * Method for getting hunman players health points.
     *
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     * Method for setting human players health points.
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

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

    public Weapon getWornWeapon() {
        return wornWeapon;
    }

    public void setWornWeapon() {

        for (int i = 0; i < inventory.inventory.size(); i++) {
            ArrayList<Weapon> weapons = new ArrayList<>();

            if (inventory.inventory.get(i) instanceof Weapon) {
                weapons.add((Weapon) inventory.inventory.get(i));

            }
            weapons.sort((a, b) -> Integer.compare(b.getDamage(), a.getDamage()));

            if (weapons.size() > 0) {

                wornWeapon = weapons.get(0);
                System.out.println("You equep " + getWornWeapon().getName());

            }

        }
    }

    public Armour getWornArmour() {
        return wornArmour;
    }

    public void setWornArmour() {

        for (int i = 0; i < inventory.inventory.size(); i++) {
            ArrayList<Armour> armour = new ArrayList<>();
            if (inventory.inventory.get(i) instanceof Armour) {
                armour.add((Armour) inventory.inventory.get(i));

            }
            armour.sort((a, b) -> Integer.compare(b.getItemArmour(), a.getItemArmour()));
            if (armour.size() > 0) {

                wornArmour = armour.get(0);
                System.out.println("you take on " + getWornArmour().getName());

            }
        }
    }

    public void printPlayerHistory() {
        if (playerHistory.visitedRooms.isEmpty()) {
            playerHistory.addToVisitedRooms(currentRoom);
        }
    }

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

    public int getScore() {
        int score = 0;
        for (Item item : inventory.getItems()) {
            score += item.getItemPoints();
        }
        return score;
    }

    public void pickupItem() {
        ArrayList<Item> roomInv = currentRoom.getroomInventory().getInventory();
        for (int i = 0; i < roomInv.size(); i++) {
            inventory.addItem(roomInv.get(i));
            io.put(roomInv.get(i) + "\n");
        }
        roomInv.clear();
    }

    @Override
    public void setDamage() {
        if (wornWeapon == null) {
            damage = baseDamage;

        } else {
            damage = baseDamage + wornWeapon.getDamage();
            io.put("Your new weapon gives you " + wornWeapon + " attack damage.");
        }
    }

    //baseDamage + wornWeapon.getDamage();
    public int getDamage() {
        return damage;

    }

//    void chooseWeapon() {
//        ArrayList<Item> weapons = new ArrayList<>();
//        for (Item inventory1 : inventory.inventory) {
//            weapons += 
//        }
//        
//        select = io.select("Weapon do you want to use" )
//        
//        switch(select)
//    }
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
