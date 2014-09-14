package homework2;
import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		
		//these will be the two numbers we'll have for the rectangle
		int firstNum = 0;
		int secondNum = 0;
		
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//check if any of the input numbers are different than an integer
		String firstNumString = input.next();
		String secondNumString = input.next();
		try {
			firstNum = Integer.parseInt(firstNumString);
			secondNum = Integer.parseInt(secondNumString);
		} catch (NumberFormatException e) {
			System.out.println(firstNumString + " or " + secondNumString + " is not an integer.");
			System.out.println(e);
		}
				
		//close the Scanner, as we're not going to be using it anymore
		input.close();
		
		//sum the numbers and find the rectangle area
		int rectangleArea = firstNum * secondNum;
		
		//print it
		System.out.println(rectangleArea);

	}

}
