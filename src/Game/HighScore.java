/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HighScore {

    public ArrayList<String> getHighScore() throws IOException {
        BufferedReader inputStream = null;
        ArrayList<String> highScore = new ArrayList<>();
        try {
            String line;
            //File file = new File("highScore.txt");
            //   System.err.println(file.getAbsolutePath());
            inputStream = new BufferedReader(new FileReader("highScore.txt"));

            while ((line = inputStream.readLine()) != null) {
                highScore.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }

        return highScore;
    }
//setHighScore(this.player.getName() + " " + player.getInventory)

    private void setHighScore(String score, List<String> scores) {

        try (FileWriter writer = new FileWriter("highScore.txt"); 
                BufferedWriter bWriter = new BufferedWriter(writer)) {
            scores.add(score);
            
            System.out.println("List = " + scores);

            String body = "";
            for (String s : scores) {
                bWriter.append(s);
                bWriter.newLine();
            }
            
            bWriter.write(body);
            bWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    
    public void addHighscore(String score)
    {
        try { 
            ArrayList<String> scores = getHighScore();
            setHighScore(score, getHighScore() );
        } catch (IOException ex) {
            Logger.getLogger(HighScore.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
//    public static void main(String[] args) throws IOException {
//        HighScore hs = new HighScore();
//        hs.addHighscore("Bob 69");
//        System.out.println( hs.getHighScore());
//               
//       
//    }
}
