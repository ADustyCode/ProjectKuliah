/*
age is less than 16, say "You can't drive."
age is less than 18, say "You can't vote."
age is less than 25, say "You can't rent a car."
age is 25 or over, say "You can do anything that's legal."
Here's a sample run. Notice that a person who is under 16 will display three messages, one for being under 16, one for also being under 18, and one for also being under 25.

Hey, what's your name? Billy_Corgan

Ok, Billy_Corgan, how old are you? 17

You can't vote, Billy_Corgan.
You can't rent a car, Billy_Corgan.
 */

import java.util.Scanner;

public class HOAY {
	
	public static void main (String[] args) {
		String name;
		int age;
		Scanner inp = new Scanner(System.in);
		System.out.print("Hey, what's your name? ");
		name = inp.next();
		System.out.print("Ok, " + name + ", how old are you? ");
		age = inp.nextInt();
		if (age < 16){
			System.out.println("You can't drive, " + name + ".");
		}
		if (age < 18){
			System.out.println("You can't vote, " + name + ".");
		}
		if (age < 25){
			System.out.println("You can't rent a car, " + name + ".");
		}
		if (age >= 25){
			System.out.println("You can do anything that's legal, " + name + ".");
		}
		
	}
}

