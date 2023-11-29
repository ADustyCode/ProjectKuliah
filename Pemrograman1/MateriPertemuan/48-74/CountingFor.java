import java.util.Scanner;

public class CountingFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = in.nextLine();

        for ( int n = 2 ; n <= 5*2 ; n+=2 )
        {
            System.out.println( n + ". " + message );
        }
    }
}
