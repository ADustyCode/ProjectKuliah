/*
Sample Output
Your height in m: 1.75
Your weight in kg: 73

Your BMI is 23.83673 
 */

import java.util.Scanner;

public class BMICalc {
	
	public static void main (String[] args) {
		Scanner inp = new Scanner(System.in);
		double height, weight, bmi;
		System.out.print("Your height in m: ");
		height = inp.nextDouble();
		System.out.print("Your weight in kg: ");
		weight = inp.nextDouble();
		bmi = weight / (height * height);
		System.out.println("Your BMI is " + bmi);
		
	}
}

