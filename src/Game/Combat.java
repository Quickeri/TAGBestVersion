package Game;

public class Combat {

    private final Character c1;
    private final Character c2;

    public Combat(Character c1, Character c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
/**
 *  General fight method - turn based - player starts
 */
    public void fight() {
        System.out.println("3, 2, 1... FIGHT!! ");
        while (c1.health >= 0 && c2.health >= 0){
            c2.health = c2.health - c1.damage;
            c1.health = c1.health - c2.damage;
        }

    }
/**
 * getWinner returns the winner of the fight (as a string) by checking the healt of the characters
 */
    public String getWinner() {
        if(c2.health > 0 && c1.health <= 0 ){
            return c2.getName();
        }
        if(c1.health > 0 && c2.health <= 0 ){
            return c1.getName();
        
        }
        else;
       return null;
    }

}
