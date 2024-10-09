
import java.io.*; //program uses class File and exception
import java.util.Scanner; //program uses class Scanner

import javax.swing.JOptionPane;

public class FileReadDemo_Ex1{
	public static void main(String[] args) throws IOException {

      //Create a Scanner object for input file name
      Scanner keyboard = new Scanner(System.in);

      //Get the file name
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();

      //Open the file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

	  //Read the next line
      while (inputFile.hasNext())
      {
		 //Read the next line
		 String data = inputFile.nextLine();

		 //Display the last name read
		 System.out.println(data);
	  }
	    
     // Close the file
	  inputFile.close();
	  System.out.println("Data read from the file:" + file.getName()); //getAbsolutePath());

   } //end of main
}//end of class


