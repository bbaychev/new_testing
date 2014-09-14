package homework2;

import java.util.Scanner;

public class PointInsideFigureCheck {

	public static void main(String[] args) {
		
		/* I think I'll do it the newbie way.
		 */
		
		float firstNum, secondNum;
		firstNum = secondNum = 0f;
		
		//initialise a scanner
		Scanner input = new Scanner(System.in);
		
		//get the numbers
		String firstNumString = input.next();
		String secondNumString = input.next();
		
		//close the scanner, as we will not be using it anymore
		input.close();
		
		//check if they're the correct type
		try {
			
			firstNum = Float.parseFloat(firstNumString);
			secondNum = Float.parseFloat(secondNumString);
			
		} catch (NumberFormatException e) {
			
			System.out.println("One of the numbers you input is not a number");
			System.out.println(e);
			
		}
		
		//so this is the newbie way, because I can't think of any other...
		if(firstNum < 12.5 || (firstNum > 17.5 && firstNum < 20 && secondNum > 8.5) 
				|| (firstNum > 22.5) || secondNum < 6 || secondNum > 13.5)  {
			
			System.out.println("Outside");
			
		} else {
			
			System.out.println("Inside");
			
		}
		
	}

}
