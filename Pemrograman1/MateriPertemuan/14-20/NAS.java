/*
 Hello.  What is your name?
Dennis 
 
Hi, Dennis!  How old are you?
37 
 
So you're 37, eh?  That's not old at all!
How much do you make, Dennis?
8.50 
 
8.5!  I hope that's per hour and not per year! LOL!
 */

import java.util.Scanner;

public class NAS {
	
	public static void main (String[] args) {
		String name;
		int age;
		double much;
		Scanner inp = new Scanner(System.in);
		System.out.println("Hello. What is your name? ");
		name = inp.next();
		System.out.println("Hi, " + name + " How old are you?");
		age = inp.nextInt();
		System.out.println("So you're " + age + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name + "?");
		much = inp.nextDouble();
		System.out.println(much + "! I hope that's per hour and not per year! LOL!");
		
		
	}
}

