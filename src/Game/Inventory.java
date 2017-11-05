package Game;

import Game.Items.Item;
import java.util.ArrayList;

public class Inventory {

    ArrayList<Item> inventory = new ArrayList<>();

    /*
    Constucts inventory.
     */
    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    /*
    Returns inventory.
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /*
    Adds items to inventory.
     */
    public void addItem(Item item) {
        inventory.add(item);
    }

    /*
    Removes items from inventory.
     */
    public void removeItem(Item item) {
        inventory.remove(item);
    }

    /**
     * Adds the players items to a value item by item and returns the entire
     * inventory as a string
     *
     * @return
     */
    public String printInventory() {
        String ress = "";
        for (int i = 0; i < inventory.size(); i++) {
            ress += inventory.get(i).getName() + "\n";
        }
        return ress;
    }

    /*
    Used to get item for score calculation.
     */
    Item[] getItems() {
        Item[] result = new Item[inventory.size()];
        inventory.toArray(result);
        return result;
    }
}
