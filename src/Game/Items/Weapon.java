
package Game.Items;


public class Weapon extends EquipableItem{
    private String name;
    private boolean equipable;
    private int itemPoints, damage;

    public Weapon(String name, String description,int damage, int itemPoints, boolean equipable) {
        super(name, description, itemPoints, equipable);
        this.damage = damage;
    }   

    public int getDamage() {
        return damage;
    }
}
