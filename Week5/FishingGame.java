
import java.util.ArrayList;
import java.util.Scanner;

public class FishingGame {
	
	//define scores and items array as constant arrays
	//assume there are 6 items and 6 scores in the game 
	//e.g., if users caught "huge fish", then they receive 100 points  
	final static int[] SCORES = {100, 50, 10, 0, -10, -100};
	final static String[] ITEMS = {"huge fish", "big fish", "little fish", "huge trash", "zombie", "huge bomb"};
	

	public static void main(String[] args) {
		//(1) create a Die object to simulate a die
		
		
		//(2) create count array
		
		
		//(3) create a score_list to store each score that player earned
		
		
		//(4) create a item_list to store each fishing item that player caught
		
		
		//(5) create a variable to store total score
		
		
		//(6) Get user input from keyboard
		
				
		System.out.print("Do you want to start fishing game (Y for Yes, N for No): ");
		
		
		//(7) create a variable to store number of times that user played game
	
		//modify the while loop
		while (true) {
			//(8)roll the die to play the game
			
			System.out.println("face number: ");
			
			//call getCaught() method to get the random item that user caught
			String item_caught = "";
			
			//(9)add caught item to the item_list
			//add score to the score_list
			
			
			//(10)update totalScore and number of times playing the game
			
			
			System.out.print("\nDo you want to continue fishing(Y for Yes, N for No): ");
		
		}
		
		/*if () {
			//(11)call getResult method to display summary statistics 
			
			System.out.println("\nAll fishing items that you got so far\n");
			System.out.println("\nAll scores that you received so far\n" );
		}
		 else
			System.out.println("You did not play the game.");
		*/
		
	
	}
	
	//complete the missing parts in the getCaught method
	public static String getCaught(int faceNumber, int[] count) {
		
		//(12) count the finishing item based on the faceNumber
		
		System.out.println("You caught a " + ".");
		System.out.println(" points.");
		
		//(13) return the finish item
		return "";
		
	}
	
	//complete the missing parts in getResult method
	public static void getResult(int totalScore, int[] count, int numGames) {
		
		System.out.println("\nYou played the game "  + " time(s).");
		System.out.println("Your total score: "  + ".");
		for (int i = 0; i < 6; i++) {
			System.out.println("You caught "  + " "  + ".");
		}
		
	}

}
