package Game.Items;

public class Healing extends Item {

    private int heal;

    /**
     * constructor for Healing Item(S)
     *
     * @param name
     * @param description
     * @param itemPoints - for endgame highscore
     * @param heal
     */
    public Healing(String name, String description, int itemPoints, int heal) {
        super(name, description, itemPoints);

        this.heal = heal;
    }

    /**
     *Method for "using" healing items
     * @return
     */
    public int getHeal() {
        return heal;
    }

}
