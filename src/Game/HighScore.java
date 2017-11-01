/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class HighScore {

    


public ArrayList<String> getHighScore() throws IOException
    {
        BufferedReader inputStream = null;
        ArrayList<String> highScore = new ArrayList<>();
        try
        {
            String line;
            //File file = new File("highScore.txt");
         //   System.err.println(file.getAbsolutePath());
            inputStream = new BufferedReader(new FileReader(new File("highScore.txt")));

            while ((line = inputStream.readLine()) != null)
            {
                highScore.add(line);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            inputStream.close();
        }

        return highScore;   
                }
//setHighScore(this.player.getName() + " " + player.getInventory)
public void setHighScore(String Score) throws IOException
    {
        ArrayList<String> highScore = getHighScore();
        highScore.add(Score);
        
        BufferedWriter outputStream = null;
        String str="";
        try
        {
            String line;
            //File file = new File("highScore.txt");
//            System.err.println(file.getAbsolutePath());
            outputStream = new BufferedWriter(new FileWriter(new File("highScore.txt")));

            for(String s : highScore) {
                outputStream.write(s);
            }
           

        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            outputStream.close();
        }

        
    }

//    public static void main(String[] args) throws IOException {
//        HighScore hs = new HighScore();
//        hs.setHighScore("asds " + 5000);
//        System.out.println(hs.getHighScore());
//    }
}