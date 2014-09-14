package homework2;

import java.util.Scanner;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		
		/* In this task, the user can type pretty much
		 * whatever number he/she wants, so the most
		 * reasonable type to use here is double.
		 * (Well, decimal is also a thing, but...)
		 */
		
		//the three numbers
		Double a, b, c;
		a = b = c = 0.0d;
		
		//start the scanner
		Scanner input = new Scanner (System.in);
		
		//get the three numbers
		String aS = input.next();
		String bS = input.next();
		String cS = input.next();
		
		//close the scanner, as we will not be using it anymore
		input.close();
		
		//try to parse the values
		try {
			
			a = Double.parseDouble(aS);
			b = Double.parseDouble(bS);
			c = Double.parseDouble(cS);
			
		} catch (NumberFormatException e) {
			
			System.out.println("One of the numbers you input is not a number.");
			System.out.println(e);
			
		}
		
		Double smallestNumber = Math.min(Math.min(a, b), c);
		
		//check if the smallestNumber is an integer
		if (smallestNumber == Math.floor(smallestNumber) && !Double.isInfinite(smallestNumber)) {

			int smallNum = smallestNumber.intValue();
			System.out.println(smallNum);
		
		} else {
			
			System.out.println(smallestNumber);
			
		}
		
	}
	
}
