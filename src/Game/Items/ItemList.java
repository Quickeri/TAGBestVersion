package Game.Items;


public class ItemList {

    private final Item woodKnife = new Weapon("Wood knife", "Made of wood and why would you use this?", 2, 0, true);
    private final Item cookingKnife = new Weapon("Cooking knife", "Made for chopping salad", 3, 3, true);
    private final Item smallBastardSword = new Weapon("Small Bastard sword", "A small but easy to handle sword", 6, 6, true);
    private final Item longSword = new Weapon("Long sword", "Great impact and good balance", 12, 8, true);
    private final Item greatSword = new Weapon("Great sword", "The best sword. Well balanced, great edge and weigth", 24, 20, true);
    private final Item kingKongor = new Weapon("King Kongors boogersmasher!", "The mythical King Kongors Boogersmasher! Legends tell that anything the mace hits will die!", 500, 1000, true); //oneshot wonder!

//creates armour - name, description, points(for the endgame score), armourrating and equipable
//Armourrating adds to maximum hitpoints
    private final Item clothArmour = new Armour("Cloth armour", "lightweight armour, good for mobility but bad for medigation", 3, 30, true);
    private final Item leatherArmour = new Armour("Leather armour", "better for medigation, with good mobility", 6, 60, true);
    private final Item chainmail = new Armour("Chainmail", "Very good for medigation, but bad for mobility", 12, 90, true);
    private final Item plateArmour = new Armour("Plate armour", "The best armour for medigation, with bad mobility", 24, 120, true);

//creates general items - name, description, points(for the endgame score, Equipable)
    private final Item healingPotion = new GeneralItems("Healing Potion", "Heals 30HP", 0, 30, true);
    private final Item greaterHealingPotion = new GeneralItems("Greater Healing Potion", "Heals 60HP", 0, 60, true);
    private final Item coins = new GeneralItems("Coins", "Ohhh Shiny!", 0, 1, false);
    private final Item blank = new GeneralItems("", "", 0, 0, false);

    //creates all sorts of items and places them in an arraylist
//    public ArrayList<Item> createItems() {
//        
//        ArrayList<Item> items = new ArrayList<>();
//        
//        //creates weapons - name, description, points(for the endgame score), damage and equipable
//        items.add(new Weapon("Wood knife", "Made of wood and why would you use this?", 2, 0, true));
//        items.add(new Weapon("Cooking knife", "Made for chopping salad", 3, 3, true));
//        items.add(new Weapon("Small Bastard sword", "A small but easy to handle sword", 6, 6, true));
//        items.add(new Weapon("Long sword", "Great impact and good balance", 12, 8, true));
//        items.add(new Weapon("Great sword", "The best sword. Well balanced, great edge and weigth", 24, 20, true));
//        items.add(new Weapon("King Kongors boogersmasher!", "The mythical King Kongors Boogersmasher! Legends tell that anything the mace hits will die!", 500, 1000, true)); //oneshot wonder!
//        //creates armour - name, description, points(for the endgame score), armourrating and equipable
//        //Armourrating adds to maximum hitpoints
//        items.add(new Armour("Cloth armour", "lightweight armour, good for mobility but bad for medigation", 3, 30, true));
//        items.add(new Armour("Leather armour", "better for medigation, with good mobility", 6, 60, true));
//        items.add(new Armour("Chainmail", "Very good for medigation, but bad for mobility", 12, 90, true));
//        items.add(new Armour("Plate armour", "The best armour for medigation, with bad mobility", 24, 120, true));
//        //creates general items - name, description, points(for the endgame score, Equipable)
//        items.add(new GeneralItems("Healing Potion", "Heals 30HP", 0, 30, true));
//        items.add(new GeneralItems("Greater Healing Potion", "Heals 60HP", 0, 60, true));
//        items.add(new GeneralItems("Coins", "Ohhh Shiny!", 0, 1, false));
//        items.add(new GeneralItems("", "", 0, 0, false)); 
//
//        return items;
//    }

    public Item getWoodKnife() {
        return woodKnife;
    }

    public Item getCookingKnife() {
        return cookingKnife;
    }

    public Item getSmallBastardSword() {
        return smallBastardSword;
    }

    public Item getLongSword() {
        return longSword;
    }

    public Item getGreatSword() {
        return greatSword;
    }

    public Item getKingKongor() {
        return kingKongor;
    }

    public Item getClothArmour() {
        return clothArmour;
    }

    public Item getLeatherArmour() {
        return leatherArmour;
    }

    public Item getChainmail() {
        return chainmail;
    }

    public Item getPlateArmour() {
        return plateArmour;
    }

    public Item getHealingPotion() {
        return healingPotion;
    }

    public Item getGreaterHealingPotion() {
        return greaterHealingPotion;
    }

    public Item getCoins() {
        return coins;
    }

    public Item getBlank() {
        return blank;
    }
}
