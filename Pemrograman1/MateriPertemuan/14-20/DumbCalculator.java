/*
What is your first number? 1.1
What is your second number? 2.2
What is your third number? 5.5

( 1.1 + 2.2 + 5.5 ) / 2 is... 4.4
 */

import java.util.Scanner;

public class DumbCalculator {
	
	public static void main (String[] args) {
		Scanner inp = new Scanner(System.in);
		double first, second, third;
		System.out.print("What is your first number? ");
		first = inp.nextDouble();
		System.out.print("What is your second number? ");
		second = inp.nextDouble();
		System.out.print("What is your third number? ");
		third = inp.nextDouble();
		System.out.printf("( " + first + " + " + second + " + " + third + " ) / 2 is... " + ((first + second + third) / 2));
		
	}
}

