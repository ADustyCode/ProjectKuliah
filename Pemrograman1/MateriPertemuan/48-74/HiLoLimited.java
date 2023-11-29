import java.util.Scanner;

public class HiLoLimited {
    public static int acak() {
        return (int)(Math.random()*(100-1+1)+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = 1, guess, angkanya = acak();
        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
        System.out.print("First guess: ");
        guess = in.nextInt();
        while (limit < 7){
            if (guess == angkanya){
                break;
            }
            else if (guess > angkanya){
                System.out.println("Sorry, that guess is too high.");
            }
            else if (guess < angkanya){
                System.out.println("Sorry, you are too low.");
            }
            limit++;
            System.out.printf("Guess # %d: ", limit);
            guess = in.nextInt();
        }
        if (limit == 7){
            System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
        }
        else{
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
