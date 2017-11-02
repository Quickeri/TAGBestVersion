/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Krist
 */
public class Score {
    private String name;
    private int score;

    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    public String toString(){
        return String.format("%s,%d", name, score);
    }
}
