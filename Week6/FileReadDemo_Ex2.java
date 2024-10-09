//This example shows how to use try catch blocks 
//to handle checked exception: FileNotFoundException
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class FileReadDemo_Ex2 {

	public static void main(String[] args) {
		Scanner fileInput = null;
	 
		//open a file
		fileInput = openFile();
	
		//Process the contents of the file
		processData(fileInput); 

		
	}//end of main
	
	//define static method openFile
	private static Scanner openFile(){  //must use throws clause here because FileNotFoundException is a checked exception
		
		Scanner keyboardInput = new Scanner(System.in);
		Scanner inputFile = null;
		while(true) { 
			System.out.println("Enter a file name: ");
			File file = new File(keyboardInput.nextLine());
			try { 
				inputFile = new Scanner(file);
				break; 
			}
			catch(FileNotFoundException ex) {
		    	//display an error message
		    	System.out.println("File not found.");
		    }
		}
		return inputFile;
	}
	
	//define static method processData
	private static void processData(Scanner inputFile){
		if (inputFile != null) {
			while (inputFile.hasNext())
			{
				//get a number from a file
				try {
					int number = inputFile.nextInt();
					//Display the number
					System.out.println(number);
				}
				catch(InputMismatchException ex) {
		        	//display an error message
					String invalidData = inputFile.next(); //ignore invalid data (which are strings not numbers)
		        	System.out.println("Invalid data found: " + invalidData);	
		        }//end of inner catch block
			}
			inputFile.close();
		}
	}
}//end of class
