
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LicensePlatesSimulator {

	public static void main(String[] args) throws IOException{
		//write a Java application to generate 100 regular automobile license plates
		//by using random generator, and then save them to a text file (.txt) named
		//"license_plates".
	//step-1: create a Random object as a random number generator 
		Random rGenerator = new Random();
		
	//step-2: define a ArrayList of Strings to store licensePlates
	//call getRandomPlates() method to create that ArrayList
		ArrayList<String> plates = getRandomPlates(rGenerator,100);
	
	//output to a text file
		String filename = "license_plates.txt";
		
	//Step-3: Use PrintWriter and FileWriter objects to write random generated license plates to the output file	
		File file = new File(filename);
		PrintWriter outputFile = new PrintWriter(new FileWriter(file, false));
		for (String p: plates){
			outputFile.println(p);
		}
		

		//Step-4: closes the PrintWriter and releases any system resources associated with the file output
	    System.out.println("Data is saved to " + (new File(filename)).getAbsolutePath()	);
		outputFile.close();
		
		


		//part 2 get the rest 50 liscense plates


		outputFile = new PrintWriter(new FileWriter(file, true));
		plates = getRandomPlates(rGenerator,50);
		for (String p: plates){
			outputFile.println(p);
		}

		outputFile.close();
		System.out.println("Data is saved to " + (new File(filename)).getAbsolutePath()	);
	    
		File dataFile = new File("license_plates.txt");
		Scanner keyboard = new Scanner(dataFile);

		System.out.println("Read from file " + dataFile.getAbsolutePath()); 

		int cnt = 0;
		while(keyboard.hasNextLine()){
			String licenseString = keyboard.nextLine();
			System.out.println(++cnt + " " + licenseString);
		}
		
		
	
	}
	/**
	 * getRandomPlates: generate license plate numbers by using random number generator
	 * @param rGenerator
	 * @param numR
	 * @return ArrayList<String>
	 */
	public static ArrayList<String> getRandomPlates(Random rGenerator, int numR){
		ArrayList<String> plates = new ArrayList<String>();
		String 	p1 = "", 
			   	p2 = "";
		
	//Step-5: add a for loop to generate part-1 and part-2 of the license plates
		//call getRandom() method to get part-1 and part-2 string
		for (int i=0; i<numR; i++){
			p1 = getRandom(rGenerator, 65, 90, 3);
			p2 = getRandom(rGenerator, 48, 57, 4);
			plates.add(p1 + "-" + p2);
		}
		
		return plates;
	}

	/**
	 * getRandom: generate a sequence of random integer numbers and convert them to characters 
	 * @param rGenerator
	 * @param min
	 * @param max
	 * @param numR
	 * @return String
	 */
	public static String getRandom(Random rGenerator, int min, int max, int numR) {
		char[] randomPart = new char[numR];
		for (int i=0; i<numR; i++) {
			randomPart[i] = (char)(rGenerator.nextInt(max-min+1)+min);
		}
		
		return new String(randomPart); 
	}
}
