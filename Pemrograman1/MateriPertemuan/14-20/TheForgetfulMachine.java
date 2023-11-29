
/*

Give me a word!
lorry! 
Give me a second word!
deoxyribonucleic? 
 
Great, now your favorite number?
42 
And your second-favorite number...
1 
 
Whew!  Wasn't that fun?
* */

import java.util.Scanner;

public class TheForgetfulMachine {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a word!");
		keyboard.next();
		System.out.println("Give me a second word!");
		keyboard.next();
		System.out.println("Great, now your favorite number?");
		keyboard.nextInt();
		System.out.println("And your second-favorite number...");
		keyboard.nextInt();
		System.out.println("Whew! Wasn't that fun?");
	}
}

