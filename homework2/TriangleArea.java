package homework2;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		
		/* First up - yes, I saw the suggested link.
		 * I didn't use it however, because I thought I should do it
		 * the way I knew how. It's a bit longer though...
		 */
		
		//we'll have six points, all integers
		int a, b, c, d, e, f;
		a = b = c = d = e = f = 0;
		
		//this is to check if the points are on the same line
		boolean onTheLine = false;
		
		//initiate a scanner
		Scanner input = new Scanner(System.in);
		
		//now get the points from the console
		String aS = input.next();
		String bS = input.next();
		String cS = input.next();
		String dS = input.next();
		String eS = input.next();
		String fS = input.next();
		
		//close the scanner, as we will not be needing it anymore
		input.close();
		
		//try to parse all of the values
		try {
			
			a = Integer.parseInt(aS);
			b = Integer.parseInt(bS);
			c = Integer.parseInt(cS);
			d = Integer.parseInt(dS);
			e = Integer.parseInt(eS);
			f = Integer.parseInt(fS);
			
		} catch(NumberFormatException exc) {
			
			System.out.println("One of the fields you input is not an integer");
			System.out.println(exc);
			
		}
		
		//these are needed for the check below
		float abCheck = a / b;
		float cdCheck = c / d;
		float efCheck = e / f;
		
		//first of all, we have to make sure the three points aren't on the same straight line
		//this is so IF a = c = e || b = d = f || a/b = c/d = e/f
		if ((a == c && c == e) || (b == d && d == f) || (abCheck == cdCheck && cdCheck == efCheck)) {
			
			//this is not a part of the specification.
			//System.out.println("The points are on the same line");
			onTheLine = true;
			
		}
		
		//let's say we have three points to the triangle - X, Y and Z
		//we'll need the sections XY, XZ and YZ
		//this is how we'll get them
		if (!onTheLine) {
		
			double XY = Math.sqrt(Math.pow(a - c, 2) + Math.pow(b - d, 2));
			double XZ = Math.sqrt(Math.pow(a - e, 2) + Math.pow(b - f, 2));
			double YZ = Math.sqrt(Math.pow(c - e, 2) + Math.pow(d - f, 2));
		
			//we use Heron's formula
			//p is half the perimeter
			double p = (XY + XZ + YZ) / 2;
			int triangleArea = (int) Math.round(Math.sqrt(p*(p - XY)*(p - XZ)*(p - YZ)));
			
			//print the result
			System.out.println(triangleArea);
			
		} else {
			
			//print 0 if the points are on the same line
			System.out.println(0);
			
		}
		
	}
	
}
