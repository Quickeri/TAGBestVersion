/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.Items;




public class Healing extends Item{
    
    
    private int heal;
    
    public Healing(String name, String description, int itemPoints, int heal) {
        super(name, description, itemPoints);
        
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
    
}
