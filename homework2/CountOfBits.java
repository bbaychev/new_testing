package homework2;

import java.util.Scanner;

public class CountOfBits {

	public static void main(String[] args) {
		
		//initialise the n
		int n = 0;
		
		//initialise the scanner
		Scanner input = new Scanner(System.in);
		
		//get the number (in string format)
		String nS = input.next();
		
		//close the scanner, as we will not be needing it anymore
		input.close();
		
		//try to parse the stringed number
		try {
			
			n = Integer.parseInt(nS);
			
		} catch (NumberFormatException e) {
			
			System.out.println("The value you have entered is not an integer.");
			System.out.println(e);
			
		}
		
		//initialise a counter of the 1-s
		int counter = 0;
		
		for (int i = 0; i < 31; i++) {
			
			//add 1 to the counter if you find a 1
			if((n >> i & 1) == 1) {
				
				counter++;
				
			}
			
		}
		
		System.out.println(counter);

	}

}
