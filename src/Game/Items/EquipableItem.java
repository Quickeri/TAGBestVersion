
package Game.Items;

public class EquipableItem extends Item{
    
    /**
     * Constructor for EquipableItem(s) with parameters listed below
     * @param name
     * @param description
     * @param itemPoints - for endgame highscore
     * @param Equipable 
     */
    public EquipableItem(String name, String description, int itemPoints, boolean Equipable) {
        super(name, description, itemPoints);
    }
}
