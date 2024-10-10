/**
   This program tests the BankAccount class.
*/
import java.text.DecimalFormat;

public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      //format to money
      DecimalFormat money = new DecimalFormat("$0.00");

      //test case 1
      System.out.println("Test Case 1");
      BankAccount harrysAccount = new BankAccount(1000);
      harrysAccount.deposit(500); // Balance is now $1500
      harrysAccount.withdraw(2000); // Balance is now $1490
      harrysAccount.addInterest(1); // Balance is now $1490 + 14.90
      //print output for test case 1
      System.out.printf("%.2f%n", harrysAccount.getBalance());
      System.out.println("Expected: 1504.90");
      System.out.println("number of transactions so far: " + harrysAccount.transactions());
      System.out.println("Expected: 2");
      System.out.println("Transaction fees occured so far: " + money.format(harrysAccount.fee()));
      System.out.println("Expected: $0.00");

      //test case 2
      System.out.println("Test Case 2");
      BankAccount jerrysAccount = new BankAccount(1000);
      jerrysAccount.deposit(150);   // Balance is now $1150
      jerrysAccount.deposit(20);    // Balance is now $1170
      jerrysAccount.deposit(200);   // Balance is now $1370
      jerrysAccount.withdraw(50);   // Balance is now $1320
      jerrysAccount.deposit(150);   // Balance is now $1470
      jerrysAccount.withdraw(500);  // Balance is now $970
      //print output for test case 2
      System.out.printf("%.2f%n", jerrysAccount.getBalance());
      System.out.println("Expected: 969.00");
      System.out.println("number of transactions so far: " + jerrysAccount.transactions());
      System.out.println("Expected: 6");
      System.out.println("Transaction fees occured so far: " + money.format(jerrysAccount.fee()));
      System.out.println("Expected: $1.00");


   }
}


