package Game.Items;

import Game.Items.Item;
import Game.Items.GeneralItems;
import Game.Items.Armour;
import java.util.ArrayList;
import java.util.Random;

public class ItemList {

    //creates all sorts of items and places them in an arraylist
    public ArrayList<Item> createItems() {
        //Random randomNumber = new Random(); 
        //randomNumber.nextInt(10)
        
        ArrayList<Item> items = new ArrayList<>();
        //creates weapons - name, description, points(for the endgame score), damage and equipable
        items.add(new Weapon("Wood knife", "Made of wood and why would you use this?", 2, 0, true));
        items.add(new Weapon("Cooking knife", "Made for chopping salad", 3, 3, true));
        items.add(new Weapon("Small Bastard sword", "A small but easy to handle sword", 6, 6, true));
        items.add(new Weapon("Long sword", "Great impact and good balance", 12, 8, true));
        items.add(new Weapon("Great sword", "The best sword. Well balanced, great edge and weigth", 24, 20, true));
        items.add(new Weapon("King Kongors boogersmasher!", "The mythical King Kongors Boogersmasher! Legends tell that anything the mace hits will die!", 500, 1000, true)); //oneshot wonder!
        //creates armour - name, description, points(for the endgame score), armourrating and equipable
        //Armourrating adds to maximum hitpoints
        items.add(new Armour("Cloth armour", "lightweight armour, good for mobility but bad for medigation", 3, 30, true));
        items.add(new Armour("Leather armour", "better for medigation, with good mobility", 6, 60, true));
        items.add(new Armour("Chainmail", "Very good for medigation, but bad for mobility", 12, 90, true));
        items.add(new Armour("Plate armour", "The best armour for medigation, with bad mobility", 24, 120, true));
        //creates general items - name, description, points(for the endgame score, Equipable)
        items.add(new GeneralItems("Healing Potion", "Heals 30HP", 0, 30, true));
        items.add(new GeneralItems("Greater Healing Potion", "Heals 60HP", 0, 60, true));
        items.add(new GeneralItems("Coins", "Ohhh Shiny!", 0, 1, false));
        items.add(new GeneralItems("", "", 0, 0, false)); 

        return items;
    }
}


