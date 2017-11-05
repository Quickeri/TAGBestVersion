package Game.Items;

public class Armour extends EquipableItem {

    private String name;
    private boolean equipable;
    private int itemPoints, itemArmour;

    /**
     * Constructor for Armour with parameters listed below
     *
     * @param name
     * @param description
     * @param itemPoints - for endgame highscores
     * @param itemArmour - adds to the players maxHealth
     * @param equipable
     */
    public Armour(String name, String description, int itemPoints, int itemArmour, boolean equipable) {
        super(name, description, itemPoints, equipable);
        this.itemArmour = itemArmour;

    }

    /**
     * returns itemaArmour (bonus maxHealth to the player when equipped)
     *
     * @return
     */
    public int getItemArmour() {
        return itemArmour;
    }
}
