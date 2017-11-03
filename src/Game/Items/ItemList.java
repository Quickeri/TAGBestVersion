package Game.Items;


public class ItemList {
//creates weapons - name, description, points(for the endgame score), damage and equipable
    private final Item woodKnife = new Weapon("Wood knife", "Made of wood and why would you use this?", 2, 43, true);
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

//creates Healing items - name, description, points(for the endgame score), healing
    private final Item healingPotion = new Healing("Healing Potion", "Heals 30HP", 0, 30);
    private final Item greaterHealingPotion = new Healing("Greater Healing Potion", "Heals 60HP", 0, 60);
    
 //creates general items - name, description, points(for the endgame score, Equipable)   
    private final Item key = new GeneralItems("Key", "The secret key", 10, 0, true);
    private final Item coins = new GeneralItems("Coins", "Ohhh Shiny!", 1, 0, false);
    private final Item blank = new GeneralItems("", "", 0, 0, false);


    
// creates general Item for monster.
    public final Item monsterheart = new GeneralItems("Monsterheart","Still pulsating heart", 10000, 0 , false);

    
        public Item getKey() {
            
        return key;
    }
    
    public Item getMonsterheart() {
        return monsterheart;
    }
    
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
