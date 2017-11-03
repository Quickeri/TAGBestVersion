package Game.Items;

public class Armour extends EquipableItem{
    private String name;
    private boolean equipable;
    private int itemPoints, itemArmour;

    public Armour(String name, String description, int itemPoints, int itemArmour, boolean equipable) {
        super(name, description, itemPoints, equipable);
        
    }   

    public int getItemArmour() {
        return itemArmour;
    }
}
