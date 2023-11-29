/*
 * 
 * 
size \ type	             animal	     vegetable	  mineral
smaller than a breadbox	 squirrel	 carrot	      paper clip
bigger than a breadbox	 moose	     watermelon   Camaro

 */

import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String answ1, answ2, guess = "";
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and i'll try to guess it.");
        System.out.println();
        System.out.println("Question 1) is it animal, vegetable, or mineral?");
        System.out.print("> ");
        answ1 = in.nextLine();
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.print("> ");
        answ2 = in.nextLine();
        if (answ2.equalsIgnoreCase("yes")){
            if (answ1.equalsIgnoreCase("animal")){
                guess = "moose";
            }
            else if (answ1.equalsIgnoreCase("vegetable")){
                guess = "watermelon";
            }
            else if (answ1.equalsIgnoreCase("mineral")){
                guess = "Camaro";
            }
        }
        else if (answ2.equalsIgnoreCase("no")){
            if (answ1.equalsIgnoreCase("animal")){
                guess = "squirrel";
            }
            else if (answ1.equalsIgnoreCase("vegetable")){
                guess = "carrot";
            }
            else if (answ1.equalsIgnoreCase("mineral")){
                guess = "paper clip";
            }
        }
        if (!guess.isEmpty()){
            System.out.printf("My guess is that you are thinking of a %s.\n", guess);

        }
        System.out.println("I would ask you if I'm right, but I don't actually care.");
    }
}
