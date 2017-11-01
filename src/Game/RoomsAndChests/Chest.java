package Game.RoomsAndChests;
import Game.Items.*;
public class Chest {

    public String name;
    public Item item;

    

    public Chest(String name, Item item) {
        this.name = name;
        this.item = item;
    }

    public void openChest() {

    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

   
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
@Override
    public String toString() {
        return  name;
    }
}
