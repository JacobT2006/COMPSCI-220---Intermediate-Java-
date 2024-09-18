
import java.util.Scanner;

public class Lab2a {
    
    public static void main(String[] args){

    Scanner userInput = new Scanner(System.in);
    
    //Step 1
    System.out.print("Enter year: ");
    int y = userInput.nextInt();
    
    //Step 2
    int a = y % 19;
    //Step 3a
    int b = y / 100;
    //Step 3b
    int c = y % 100;
    //Step 4a
    int d = b / 4;
    //Step 4b
    int e = b % 4;
    //Step 5
    int g = (8 * b + 13) / 25;
    //Step 6
    int h = (19 * a + b - d - g + 15) % 30;
    //Step 7a
    int j = c / 4;
    //Step 7b
    int k = c % 4;
    //Step 8
    int m = (a + 11 * h) / 319;
    //Step 9
    int r = (2 * e + 2 * j - k - h + m + 32) % 7;
    //Step 10
    int n = (h - m + r + 90) / 25;
    //Step 11
    int p = (h - m + r + n + 19) % 32;

    //Final output
    System.out.println("Month: " + n + "\nDay: " + p + "\nYear: " + y);
    userInput.close();
    }
}