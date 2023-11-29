/*
Hello.  What is your name? Percy_Bysshe_Shelley

Hi, Percy_Bysshe_Shelley!  How old are you? 34

Did you know that in five years you will be 39 years old?
And five years ago you were 29! Imagine that! 
 */

import java.util.Scanner;

public class AIFY {
	
	public static void main (String[] args) {
		String name;
		int age;
		Scanner inp = new Scanner(System.in);
		System.out.print("Hello. What is your name? ");
		name = inp.next();
		System.out.print("Hi, " + name + "! How old are you? ");
		age = inp.nextInt();
		System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
		System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
		
	}
}

