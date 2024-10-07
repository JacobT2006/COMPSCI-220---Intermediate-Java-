
//import java.util.Arrays;

//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html

import java.util.Arrays;

public class StringAndCharacterPractice {

	public static void main(String[] args) {
		// practice-1: Get user input of a paragraph
		// Display each individual word from that paragraph
		// use String split() method to split a String into a String array by specifying
		// a delimiter
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#split(java.lang.String,int)
		String testparagraph = "This is a test paragraph. Display each individual word from this paragraph. Do you agree?";

		if (isvalid(testparagraph)){
			testparagraph = testparagraph.replaceAll("[\\.]", testparagraph);
			String[] token = testparagraph.split("\\s+");
			if (token.length == 0){
				System.out.println("The paragraph is empty!");
			}
			else
			{
				System.out.printf("The paragraph contains: %d words.\n", token.length);
			}

			for (String s : token){// for (I = 0; i < token; length I++)
				s = (s.endsWith(".") || s.endsWith("?")) ? s.substring(0, s.length()-1) : s;
				System.out.println(s);
			}
			System.out.println(Arrays.toString(token));
		}
		else 
			System.out.println("the paragraph is empty!");

		







		// Practice-2: verify in a String there are special characters that we want
		// for example, we want the String contains only letters? digits?
		String[] testStrings = { "aaBBcC", "123abc", "a b c" };
		for (String s : testStrings) {
			if(s.matches("^[a-zA-Z]+$")){
				System.out.println("String: \"" + s + "\" contains only letters.");
			}
			else if (s.matches("^[0-9]+$")){
				System.out.println("String: \"" + s + "\" contains only digits.");
			}
			else if (s.matches("^[a-zA-Z0-9]+$")){
				System.out.println("String: \"" + s + "\" contains contains either or both.");
			}
			else
				System.out.println("String: \"" + s + "\"");
		}










		// Practice-3: how to remove certain characters from a string?
		for (String s : testStrings ){
			System.out.println("String: \"" + s + "\"");
			System.out.println("after remove: String: \"" + s.replaceAll("[A-Z\\s+]", "") + "\"");
		}





	}
	public static boolean isvalid(String s){
		if (s == null || s.isBlank()){
			return false;
		}
		else
			return true;
		
	}

}
