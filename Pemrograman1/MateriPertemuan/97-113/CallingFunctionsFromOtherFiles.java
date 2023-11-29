import java.util.Scanner;

public class CallingFunctionsFromOtherFiles {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + WeekdayLib.weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + WeekdayLib.weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + WeekdayLib.weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + WeekdayLib.weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + WeekdayLib.weekday(1,15,2003));
		System.out.println("10 13 2000 => " + WeekdayLib.weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for WeekdayLib.weekday() here
		System.out.println("You were born on " + WeekdayLib.weekday(mm, dd, yyyy));
	}
}
