import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");
        int number;
        double result;
        boolean notNegative = false;
        System.out.print("Enter a number: ");
        number = in.nextInt();
        while (!notNegative){
            if (number < 1){
                System.out.println("You can't take the square root of a negative number, silly.");
                System.out.print("Try again: ");
                number = in.nextInt();
            }
            else{
                notNegative = true;
            }
        }
        result = Math.sqrt(number);
        System.out.printf("The square root of %d is " + result, number);
    }
}
