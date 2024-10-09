import java.util.ArrayList;
import java.util.Scanner;

public class ReviewSystem2 {
      
	public static void main(String[] args) {
		
		//(1) create a Reviews object instance that can contain a list of Review objects
		Reviews reviewList = new Reviews();
	
		//(2) adding comments and rating to each Review object
		//call addNewReview() method
		addNewReview(reviewList);
		
		//(3) view all reviews
		//call viewAllReviews() method
		viewAllReviews(reviewList);
		
	    //(4) print out the average rating.
		//call getAverageRating() method
		getAverageRating(reviewList);
		
		//(5) output all comments for given rating
	    //call viewComments() method
	    viewComments(reviewList);
	    
	    //(6) create a console menu 
	    Scanner sc = new Scanner(System.in);
		//loop a menu
		while(true) {
			//call displayMenu() method
			displayMenu();
			//(7) get user choice, use switch-case statement to call different methods to complete different tasks
			int userChoice = sc.nextInt();
			switch(userChoice) {
				case 1 -> addNewReview(reviewList);
				case 2 -> viewAllReviews(reviewList);
				case 3 -> getAverageRating(reviewList);
				case 4 -> viewComments(reviewList);
				default -> {
					sc.close();
					System.exit(0);
				}
			}
			
		}
	    //sc.close();  
	}//end of the main method
    
	/**
	 * addNewReview: add new review(s)			
	 * @param reviewList
	 */
	public static void addNewReview(Reviews reviewList) { 
		System.out.println("Type rating + comments. To end: -1");
		Scanner scnr = new Scanner(System.in);
		reviewList.inputReviews(scnr);
	}
	
	/**
	 * viewAllReviews: view all reviews
	 * @param reviewList
	 */
	public static void viewAllReviews(Reviews reviewList) {//add code to complete this method
		reviewList.viewAllReviews();
	}
	
	/**
	 * getAverageRating: get average rating
	 * @param reviewList
	 */
	public static void getAverageRating(Reviews reviewList) {//add code to complete this method
		System.out.printf("Average rating is: %.2f\n", reviewList.getAverageRating());
	}
	
	/**
	 * viewComments: view comments under a rating
	 * @param reviewList
	 */
	public static void viewComments(Reviews reviewList) {//add code to complete this method
		int currRating = -1;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Type Rating to view comments. To end enter -1");
		while((currRating = scnr.nextInt()) != -1){
			reviewList.printCommentsForRating(currRating);
			System.out.println("Type rating to view comments: To end enter 1");
		}
	}
	
	public static void displayMenu() {//add code to complete this method
		//create a menu
		
		//display the menu in console
		
	}
	
}
