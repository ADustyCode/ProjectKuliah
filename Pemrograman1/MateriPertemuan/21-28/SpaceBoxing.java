/*
Please enter your current earth weight: 128

I have information for the following planets:
   1. Venus   2. Mars    3. Jupiter
   4. Saturn  5. Uranus  6. Neptune

Which planet are you visiting? 2

Your weight would be 49.92 pounds on that planet. 
* 
1	Venus	0.78
2	Mars	0.39
3	Jupiter	2.65
4	Saturn	1.17
5	Uranus	1.05
6	Neptune	1.23
So, for example, if Julio weighs 128 lbs. on earth, then he would weigh just under 50 lbs. on Mars, since Mars' gravity is 0.39 times earth's gravity. (128 * 0.39 is 49.92)
 */

import java.util.Scanner;

public class SpaceBoxing {
	
	public static void main (String[] args) {
		int earthWeight, choose;
		double planetWeight, weightResult;
		Scanner inp = new Scanner(System.in);
		System.out.print("Please enter your current earth weight: ");
		earthWeight = inp.nextInt();
		if (earthWeight < 1)
		{
			System.out.println("Invalid weight input");
			return;
		}
		System.out.println("I have information for the following planets:");
		System.out.println("   1. Venus   2. Mars    3. Jupiter");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune\n");
		System.out.print("Which planet are you visiting? ");
		choose = inp.nextInt();
		if (choose == 1)
		{
			planetWeight = 0.78;
		}
		else if (choose == 2)
		{
			planetWeight = 0.39;
		}
		else if (choose == 3)
		{
			planetWeight = 2.65;
		}
		else if (choose == 4)
		{
			planetWeight = 1.17;
		}
		else if (choose == 5)
		{
			planetWeight = 1.05;
		}
		else if (choose == 6)
		{
			planetWeight = 1.23;
		}
		else
		{
			System.out.println("Your choose is not exists.");
			return;
		}
		weightResult = (earthWeight * planetWeight);
		System.out.println("Your weight would be " + weightResult + " pounds on that planet. ");
	}
}

