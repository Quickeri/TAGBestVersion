package tag.Items;

import java.util.ArrayList;
import java.util.Random;

public class ItemList {

    //creates all sorts of items and places them in an arraylist
    public ArrayList<Item> createItems() {
        //Random randomNumber = new Random(); 
        //randomNumber.nextInt(10)
        
        ArrayList<Item> items = new ArrayList<>();
        //creates weapons - name, description, points(for the endgame score), damage and equipable
        items.add(new Weapon("Wooden knife", "", 0, 3, true));
        items.add(new Weapon("Small Bastard sword", "", 0, 6, true));
        items.add(new Weapon("", "", 0, 8, true));
        items.add(new Weapon("", "", 0, 20, true));
        items.add(new Weapon("King Kongors boogersmasher!","", 0, 1000, true)); //oneshot wonder!
        //creates armour - name, description, points(for the endgame score), armourrating and equipable
        //Armourrating adds to maximum hitpoints
        items.add(new Armour("", "", 0, 30, true));
        items.add(new Armour("", "", 0, 60, true));
        items.add(new Armour("", "", 0, 90, true));
        items.add(new Armour("", "", 0, 120, true));
        //creates general items - name, description, points(for the endgame score)
        items.add(new GeneralItems("Healing Potion", "Heals 30HP", 0, 30, true));
        items.add(new GeneralItems("Greater Healing Potion", "Heals 60HP", 0, 60, true));
        items.add(new GeneralItems("Coins", "Ohhh Shiny!", 0, 1, false));
        items.add(new GeneralItems("", "", 0, 0, false)); 

        return items;
    }
}


