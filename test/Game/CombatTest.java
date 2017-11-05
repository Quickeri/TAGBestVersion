package Game;

import org.junit.Test;
import static org.junit.Assert.*;

public class CombatTest {

    @Test
    public void testFight() {
        Player p1 = new Player("testPlayer", null, 100, 100, null, 20);
        Monster m1 = new Monster("testMonster", null, 100, 10, null);
        Combat combat = new Combat(p1, m1);
        combat.fight();
        assertEquals(p1.getName(), combat.getWinner());

    }

    @Test
    public void testFight2() {
        Player p1 = new Player("testPlayer", null, 100, 100, null, 20);
        Monster m1 = new Monster("testMonster", null, 100, 50, null);
        Combat combat = new Combat(p1, m1);
        combat.fight();
        assertEquals(m1.getName(), combat.getWinner());

    }

}
