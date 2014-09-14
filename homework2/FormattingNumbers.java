package homework2;

import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		
		//initialise variables for three numbers
		int a = 0;
		float b = 0.0f;
		float c = 0.0f;
		
		//initialise the scanner
		Scanner input = new Scanner(System.in);
		
		//get the values
		String aS = input.next();
		String bS = input.next();
		String cS = input.next();
		
		//close the scanner, as we will not be using it anymore
		input.close();
		
		//try to parse the elements
		try {
			
			a = Integer.parseInt(aS);
			b = Float.parseFloat(bS);
			c = Float.parseFloat(cS);
			
		} catch (NumberFormatException e) {
			
			System.out.println("One of the values you input is not in the correct format");
			System.out.println(e);
			
		}
		
		System.out.printf("|%-10S|%10s|%10.2f|%-10.3f|", Integer.toHexString(a), 
				String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0'),
				b, c);
		
	}
	
}
