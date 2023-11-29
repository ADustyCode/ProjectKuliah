import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int my = 8, guess;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        guess = in.nextInt();
        while (my != guess){
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = in.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
    }
}
