/*
Are you ready for a quiz?  N
Okay, here it comes!

Q1) What is the capital of Alaska?
	1) Melbourne
	2) Anchorage
	3) Juneau

> 3

That's right!

Q2) Can you store the value "cat" in a variable of type int?
	1) yes
	2) no

> 1

Sorry, "cat" is a string. ints can only store numbers.

Q3) What is the result of 9+6/3?
	1) 5
	2) 11
	3) 15/3

> 2

That's correct!


Overall, you got 2 out of 3 correct.
Thanks for playing!
* equalsIgnoreCase(???)
 */

import java.util.Scanner;

public class ALittleQuiz {
	
	public static void main (String[] args) {
		int answer, correct = 3;
		Scanner inp = new Scanner(System.in);
		System.out.print("Are you ready for a quiz? ");
		if ("y".equalsIgnoreCase(inp.nextLine())){
			// Question 1
			System.out.println("Okay, here it comes!\n");
			System.out.println("Q1) What is the capital of Alaska?");
			System.out.println("    1) Melbourne");
			System.out.println("    2) Anchorage");
			System.out.println("    3) Juneau");
			System.out.print("> ");
			answer = inp.nextInt();
			if (answer == 3){
				System.out.println("That's right!");
			}
			else
			{
				System.out.println("Sorry, the capital of alaska is Juneau.");
				correct--;
			}
			// -----------
			// Question 2
			System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
			System.out.println("    1) yes");
			System.out.println("    2) no");
			System.out.print("> ");
			answer = inp.nextInt();
			if (answer == 2){
				System.out.println("That's right!");
			}
			else
			{
				System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
				correct--;
			}
			// -----------
			// Question 3
			System.out.println("Q3) What is the result of 9+6/3?");
			System.out.println("    1) 5");
			System.out.println("    2) 11");
			System.out.println("    3) 15/3");
			System.out.print("> ");
			answer = inp.nextInt();
			if (answer == 2){
				System.out.println("That's correct!");
			}
			else
			{
				System.out.println("Sorry, result of 9+6/3 is 11");
				correct--;
			}
			// -----------
			System.out.println("\n\nOverall, you got " + correct + " out of 3 correct.");
		}
		System.out.println("Thanks for playing!");
	}
}

