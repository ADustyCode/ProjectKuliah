import java.util.Scanner;

public class WorstGuessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 4;
        System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
        System.out.print("I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
        int choose = in.nextInt();
        System.out.println();
        if (guess == choose){
            System.out.printf("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS %d!", guess);
        }
        else{
            System.out.printf("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS %d!\n", guess);
        }
    }
}
