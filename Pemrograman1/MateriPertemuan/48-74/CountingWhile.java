import java.util.Scanner;

public class CountingWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = in.nextLine();

		int n = 0;
		while ( n < 10 )
		{
			n++;
			System.out.println( (n*10) + ". " + message );
		}

	}
}
