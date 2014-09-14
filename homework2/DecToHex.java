package homework2;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		
		//initialise a variable
		int num = 0;
		
		//initialise a scanner
		Scanner input = new Scanner(System.in);
		
		//get the number
		String numS = input.next();
		
		//close the scanner, as we will not be using it anymore
		input.close();
		
		//make sure it's a positive integer
		try {
			
			num = Integer.parseInt(numS);
			
		} catch (NumberFormatException e) {
			
			System.out.println("The number you've entered is not an integer");
			System.out.println(e);
			
		}
		
		if (num > 0) {
			
			//make sure it prints uppercase letters
			System.out.println(Integer.toHexString(num).toUpperCase());
		
		} else {
			
			System.out.println("The integer you've entered is not positive. Please try again.");
			
		}

	}

}
