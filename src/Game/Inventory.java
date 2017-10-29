package Game;

import Game.Items.Item;
import java.util.ArrayList;

public class Inventory {
    
    ArrayList<Item> inventory = new ArrayList<>();
    
    public void addItem(Item item){
        inventory.add(item);
    }
    public void removeItem(Item item){
        inventory.remove(item);
    }
    
    public String printInventory(){
        String ress = "";
              for (int i = 0; i < inventory.size(); i++) {
                  
            ress += inventory.get(i).getName() + "\n";
            
        }
  
        return ress;
    }
    
    Item[] getItems(){
        Item[] result = new Item[inventory.size()];
        inventory.toArray(result);
        return result;
    }
}
//public static void moveItem( ArrayList<Item> roomInventory,
//                                    ArrayList<Item> Inventory,
//                                    int start,
//                                    int target,
//                                     )
//
//
//   {
//    for (int i = 0; i < roomInventory.length(); i++)
//     {
//        if (roomInventory.size() > roomInventory.length())
//         {
//            String removed = roomInventory.remove(start);
//            Inventory.add(target, removed);
//            target++;
//        }
//    }
//   }