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

public class HighScore {

    /*
    * This reads the HighScore.txt file and makes a list of the scores.
     */
    public List<Score> getHighScore() {
        BufferedReader inputStream;
        List<Score> highScore = new ArrayList<>();
        System.out.println();
        try {
            String line;
            //File file = new File("highScore.txt");
            //   System.err.println(file.getAbsolutePath());
            inputStream = new BufferedReader(new FileReader("highScore.txt"));

            while ((line = inputStream.readLine()) != null) {
                String[] split = line.split(",");
                if (split.length != 2) {
                    throw new IllegalStateException();
                }
                String name = split[0];
                try {
                    int score = Integer.parseInt(split[1].trim());
                    highScore.add(new Score(name, score));
                } catch (NumberFormatException e) {
                    throw new IllegalStateException(e);

                }

            }

        } catch (IOException | IllegalStateException e) {
            e.printStackTrace();
            System.out.println("HighScore file is corrupt");
        }
        return highScore;
    }

    /*
    * adds the current players name and score and adds it to the HighScore.txt file.
     */
    public void setHighScore(List<Score> scores) {

        scores.sort((a, b) -> Integer.compare(b.getScore(), a.getScore()));

        try (FileWriter writer = new FileWriter("highScore.txt");
                BufferedWriter bWriter = new BufferedWriter(writer)) {
            System.out.println("HighScore = " + scores);

            String body = "";
            for (Score s : scores) {
                bWriter.append(s.toString());
                bWriter.newLine();
            }

            bWriter.write(body);
            bWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    
}
