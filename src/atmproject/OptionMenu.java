package atmproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
		Scanner menuInput = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

		public void getLogin() throws IOException{
			int x = 1;
			do {
				try {
					//data.put(033445, 7865); //Account number with pin
					data.put(98931247, 7986);//Account number with pin
					
					System.out.println("Welcome to the ATM Project"  +      " 😊");
					System.out.println("Enter your Account Number"  +      " ✍️");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.println("Enter your Card PIN Number"  +      " ✍️");
					setPinNumber(menuInput.nextInt());
				}
				catch(Exception e) {
					System.out.println("\n" + "Invald Character(s).Only Numbers." + "\n");
					x = 2;
				}	
				
				int cn = getCustomerNumber();
				int pn = getPinNumber();
				
				if (data.containsKey(cn) && data.get(cn) == pn) {
					getAccountType();
				} else
					System.out.println("\n" + "Wrong Customer or Pin Number" + "\n");
				} while (x == 1);
			}
			
			public void getAccountType() {
				System.out.println("Select the Account you want to Access: ");
				System.out.println("Type 1 - Check your Account");
				System.out.println("Type 2 - Saving Account");
				System.out.println("Type 3 - Exit");
				
				int selection = menuInput.nextInt();
				
				switch (selection){
				case 1:
					getChecking();
					break;
					
				case 2:
					getSaving();
					break;
					
				case 3:
					System.out.println("Thank You for Using this ATM, bye.  \n");
					break;
					
				default:
					System.out.println("\n" + "Invalid choice" + "\n");
					getAccountType();
				}
			}
			
			public void getChecking() {
				System.out.println("Current Acccount: ");
				System.out.println("type 1 - View Balance");
				System.out.println("type 2 - Withdraw Funds");
				System.out.println("type 3 - Deposit Funds");
				System.out.println("type 4 - Exit");
				System.out.println("Choice: ");
				
				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("Your Account Balance: " + moneyFormat.format(getCheckingBalance()));
					getAccountType();
					break;
					
				case 2:
					getCheckingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getCheckingtDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank You for using this ATM, bye.");
					break;
					
				default:
					System.out.println("\n" + "Inavlid Choice." + "\n");
					getChecking();
				 }
			}
			
			public void getSaving() {
				System.out.println("Current Acccount: ");
				System.out.println("type 1 - View Balance");
				System.out.println("type 2 - Withdraw Funds");
				System.out.println("type 3 - Deposit Funds");
				System.out.println("type 4 - Exit");
				System.out.println("Choice: ");
				
				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
					getAccountType();
					break;
					
				case 2:
					getSavingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getSavingDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thanl You for using this ATM, bye.");
					break;
					
				default:
					System.out.println("\n" + "Inavlid Choice." + "\n");
					getSaving();
				 }
			}
		}
	