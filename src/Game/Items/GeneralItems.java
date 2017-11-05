package Game.Items;

public class GeneralItems extends Item{
    
    /**
     * Constructor for GeneralItems with parameters listed below
     * @param name
     * @param description
     * @param itemPoints - for endgame highscore
     * @param healingAmount - for healingpotions
     * @param canBeUsed 
     */
    public GeneralItems(String name, String description, int itemPoints, int healingAmount, boolean canBeUsed) {
        super(name, description, itemPoints);
    }
}
