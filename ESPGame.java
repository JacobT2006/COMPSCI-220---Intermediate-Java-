import javax.swing.*;
import java.util.Arrays;

public class ESPGame {
    
    public static void main(String[] args){
    
        int games   = 0,
            correct = 0;


        String userInput = "";

        // color array            0    1    2    3    4
        final String[] colors = {"R", "G", "B", "Y", "P"};

        // computer array
        int[] computerArray;

        // user array
        int[] userArray;

        // while -> get user input
        while (!userInput.equalsIgnoreCase("Q")) {
            userInput = JOptionPane.showInputDialog("Enter the First letter of the colors Red, Green, Blue, Yellow, Purple. For example 'r' or 'R' for Red");

            // send computer guess to console
            int max = 4;
            int min = 0;
            int randomNum = min + (int)(Math.random() * ((max - min) + 1));
            
            
            //get computer color using random num

            // store to color count for user and computer


            System.out.println(randomNum); 

            //output game num and correct guesses each time tp console
            games++;
            if (userInput.equalsIgnoreCase(colors[randomNum])){
                correct++;
            }
            System.out.println("Number of Games: " + games + "\nCorrect Guesses: " + correct);
        }

    }
    /*public static boolean isvalid(boolean output) {           // use boolean to do output
        return output;

        System.out.println("Color
                            + "Red
                            + "Green
                            + "Blue
                            + "Yellow
                            + "Purple");
    
    }*/
}