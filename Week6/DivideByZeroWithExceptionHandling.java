// DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;
//(1)this example illustrates how to catch and handle exceptions in different methods.
//(2)this example illustrates how manually throw an exception based on a customized condition (use throw statement and create new exception object)
//(3)this example illustrates after an exception occurred, instead of terminate the program, use a loop to continue the program 
//by asking for new user inputs. 

public class DivideByZeroWithExceptionHandling
{
   // demonstrates throwing an exception when a divide-by-zero occurs
   public static int quotient(int numerator, int denominator) {//throws ArithmeticException { //use throws cause to declare the type of exceptions that may throw from this method
	 //add throws cause is optional, but a good programming practice for unchecked exception 
	   //add or without adding throws clause, both ways work here!
       if (denominator > 100) //if requires the denominator must be an integer no greater than 100 
	        throw new ArithmeticException("denominator is not allowed to be greater than 100!");
	   return numerator / denominator; // possible division by zero
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean continueLoop = true; // determines if more input is needed
      //int numerator = 0;
      //int denominator = 0;
      do {
         try { // read two numbers and calculate quotient
            System.out.print("Please enter an integer numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Please enter an integer denominator: ");
            int denominator = scanner.nextInt();

            int result = quotient(numerator, denominator);
            System.out.printf("%nResult: %d / %d = %d%n", numerator,
               denominator, result);
            continueLoop = false; // input successful; end looping
         }
         catch (InputMismatchException e) {
            System.err.printf("%nException: %s%n", e);
            //e.printStackTrace();
            scanner.nextLine(); // discard input so user can try again
            System.out.printf(
               "You must enter integers. Please try again.%n%n");
         }
         catch (ArithmeticException e) {
            System.err.printf("%nException: %s%n", e);
            //e.printStackTrace();
            System.out.println("zero is an invalid denominator, Please try again!\n");
            //System.out.printf("%d is an invalid denominator, Please try again!\n", denominator);
         }
      } while (continueLoop);
      
      scanner.close();
   }
}


