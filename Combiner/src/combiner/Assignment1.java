package combiner;

import java.util.Scanner;

public class Assignment1 {
	

	
		public static void main(String []args) {
			
			Scanner scan = new Scanner (System.in);
			
while(true) {
	
	System.out.println("Pick an option");
	System.out.println("1. Add two Integers");
	System.out.println("2. Concatenate Strings");
	System.out.println("3. Exit");
	
	
	int choice = scan.nextInt();
	scan.nextLine();
	



if (choice == 1) {
	System.out.println("Enter the first number: ");
	int num1 = scan.nextInt();
	System.out.println("Enter the second number: ");
	int num2 = scan.nextInt();
	
	int sum = num1 + num2;
	
	System.out.println("The sum is: " + sum);
}

else if(choice == 2) {
	
	System.out.println("Enter a string: ");
	String str1 = scan.nextLine();
	System.out.println("Enter your next String: ");
	String str2 = scan.nextLine();
	
	String result = str1.concat(str2);
	
	System.out.println("The concatenation is: " + result);
	
}

else if (choice == 3) {
	System.out.println("Exiting the Program...");}
else {
	System.out.println("Invalid option. Try again.");
}
	
	break;
}			
			
			
			
			} 
		}
		

				





