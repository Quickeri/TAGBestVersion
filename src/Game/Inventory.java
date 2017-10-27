package Game;

import Game.Items.Item;
import java.util.ArrayList;

public class Inventory {
    
    ArrayList<Item> inventory = new ArrayList<>();
    
    public Inventory(){

    }
    
    public void addItem(Item item){
        inventory.add(item);
    }
    public void removeItem(Item item){
        inventory.remove(item);
    }
    public void printInventory(){
        
    }
}
