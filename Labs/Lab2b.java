
import java.util.Scanner;

public class Lab2b {
    public static void main(String[] args){
        
        //Scanner
        Scanner userInput = new Scanner(System.in);

        //User input
        System.out.print("Enter a phone number without parentheses: ");
        String number = userInput.next();

        //Seperate strings
        String one = number.substring(0, 3);
        String two = number.substring(3, 6);
        String three = number.substring(7, 10);

        //Final output
        System.out.println("(" + one + ")" + two + "-" + three);

    }

}