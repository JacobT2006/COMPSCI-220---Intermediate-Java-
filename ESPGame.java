import javax.swing.*;
import java.util.Arrays;

public class ESPGame {
    // computer array
    public static int[] computerArray = {0, 0, 0, 0 ,0};
    // user array
    public static int[] userArray = {0, 0, 0, 0 ,0};

    public static int games   = 0,
                      correct = 0;

    public static void main(String[] args){


        String  userInput      = "",
                computerAnswer = "";

        // color array            0    1    2    3    4
        final String[] colors = {"R", "G", "B", "Y", "P"};

        // while -> get user input
        while (!userInput.equalsIgnoreCase("Q")) {
            userInput = JOptionPane.showInputDialog("Enter the first letter of the colors Red, Green, Blue, Yellow, Purple.\nFor example 'r' or 'R' for Red. To exit 'q' or 'Q'.");

            if (userInput.equalsIgnoreCase("Q")){
                break;
            }

            // send computer guess to console
            int max = 4;
            int min = 0;
            int randomNum = min + (int)(Math.random() * ((max - min) + 1));
            
            //get computer color using random num
            if (randomNum == 0){
                computerArray[0]++;
                computerAnswer = "Red";
            }else if (randomNum == 1){
                computerArray[1]++;
                computerAnswer = "Green";
            }else if (randomNum == 2){
                computerArray[2]++;
                computerAnswer = "Blue";
            }else if (randomNum == 3){
                computerArray[3]++;
                computerAnswer = "Yellow";
            }else if (randomNum == 4){
                computerArray[4]++;
                computerAnswer = "Purple";
            }else{
                continue;
            }

            // Print Computer answer
            
            System.out.println("Computer Answer: " + computerAnswer);

            // store to color count for user
            if (userInput.equalsIgnoreCase("r")){
                userArray[0]++;
            }else if (userInput.equalsIgnoreCase("g")){
                userArray[1]++;
            }else if (userInput.equalsIgnoreCase("b")){        
                userArray[2]++;
            }else if (userInput.equalsIgnoreCase("y")){          
                userArray[3]++;
            }else if (userInput.equalsIgnoreCase("p")){
                userArray[4]++;
            }else {
                continue;
            }

            //output game num and correct guesses each time tp console
            games++;
            if (userInput.equalsIgnoreCase(colors[randomNum])){
                correct++;
            }
        }
        
        printColorChart();

    }
    // method to display program end
    public static void printColorChart() {     
        StringBuilder finalOutput = new StringBuilder();

        System.out.println("\nNumber of Games: " + games + "\nCorrect Guesses: " + correct);

        finalOutput.append(String.format("%-7s %-5s %-5s%n", "Color", "Computer", "User"));

        finalOutput.append(String.format("%-11s %-4d %-5d%n", "Red", computerArray[0], userArray[0]));
        finalOutput.append(String.format("%-11s %-4d %-5d%n", "Green", computerArray[1], userArray[1]));
        finalOutput.append(String.format("%-11s %-4d %-5d%n", "Blue", computerArray[2], userArray[2]));
        finalOutput.append(String.format("%-11s %-4d %-5d%n", "Yellow", computerArray[3], userArray[3]));
        finalOutput.append(String.format("%-11s %-4d %-5d%n", "Purple", computerArray[4], userArray[4]));
        System.out.println("\n" + finalOutput.toString());
    
    }
}