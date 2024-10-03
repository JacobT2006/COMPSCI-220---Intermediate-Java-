import java.util.ArrayList;
import java.util.Random;

//This class is used to create object instance and test the program Account.java

public class AccountTest{
	public static void main(String[] args) {
		
//when in the case that no constructor defined in a class, compiler will create a default constructor, 
//that default constructor will be called when creating object instances from that class.
		Account aa = new Account("aa", 300);  // CREATING NEW OBJECT
		System.out.println("Account name: " + (aa.getName().isEmpty()? "N/A": aa.getName()) );  //
		
//when in the case that at least one constructor defined in a class, then compiler will not create a default constructor,
//Those programmer-defined constructor(s) will be called when creating object instances from that class
		
		//(1) add code here to create an account object named "myAccount", 
		//and provide an account name (e.g., ask user to enter a name) and account balance
		Account myaAccount = new Account("Tina", 500);
		//(2) display myAccount's name and balance 
		System.out.println(myaAccount.getBalance());
		System.out.println(myaAccount.getName());
				
		//(3) deposit $500 to myAccount.
		myaAccount.deposit(500);
				
				
		//(4) create an array of three checking accounts
		Account[] checkingAccounts = new Account[3];
		/*for (int i = 0; i < checkingAccounts.length; i++){
			checkingAccounts[i] = new Account();
			System.out.print(checkingAccounts[i]);
		}*/

		checkingAccounts[0] = new Account("sss", 100);
		checkingAccounts[1] = new Account("aaa", 300);
		checkingAccounts[2] = new Account("bbb", 200);

		printAccounts(checkingAccounts, "Checking Account");

		Account[] checkAccountsV2 = new Account[] {new Account(), new Account("Bob", 1000), new Account("Sam", 400)};
		printAccounts(checkAccountsV2, "Checking Account");
			
		//(5) call printAccounts() method to print out all checking accounts info.
				
				
		//(6) create an ArrayList of 10 saving accounts
		ArrayList<Account> savingsAccounts = new ArrayList<>();
		for(int i=0; i<10; i++){
			savingsAccounts.add(new Account());
		}
				
		//(7) call printAccounts() method to print out all saving accounts info.
		Account[] savingListArray = new Account[savingsAccounts.size()];
		savingListArray = savingsAccounts.toArray(savingListArray);
		printAccounts(savingListArray, "Saving Account");
		
		
	}
	public static void printAccounts(Account[] checkAccountsV2, String type){ //or private
		System.out.println("Print" + type + ":");
		for(Account c: checkAccountsV2){
			// N/D
		}
	}

}