/*
Hey, what's your name? (Sorry, I keep forgetting.) Billy_Corgan
Ok, Billy_Corgan, how old are you? 17

You can drive but you can't vote, Billy_Corgan.
* 
* 
* 
less than 16	"You can't drive."
16 to 17	"You can drive but not vote."
18 to 24	"You can vote but not rent a car."
25 or older	"You can do pretty much anything."

 */

import java.util.Scanner;

public class HOAYS {
	
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
		else if (age <= 17){
			System.out.println("You can drive but not vote, " + name + ".");
		}
		else if (age <= 24){
			System.out.println("You can vote but not rent a car, " + name + ".");
		}
		else {
			System.out.println("You can do pretty much anything, " + name + ".");
		}
		
	}
}

