import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Starting number: ");
		int start = in.nextInt();
		int count = 0;
		int max = 0;
		max = start;
		System.out.print(start + "	");
		while (start != 1){
			if (start%2==0){
				start = start/2;
			}
			else{
				start = 3 * start + 1;
			}
			System.out.print(start + "	");
			count++;
			if (start> max){
				max=start;
			}
		}
		System.out.println("The largest value was " + max);
		System.out.printf("Terminated after %d steps", count);
	}
}
