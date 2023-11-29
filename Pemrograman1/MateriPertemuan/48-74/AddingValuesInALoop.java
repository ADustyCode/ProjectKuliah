import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int all = 0, input = 1;
        System.out.println("I will add up the numbers you give me.");
        while (input != 0){
            System.out.print("Number: ");
            input = in.nextInt();
            all += input;
            if (input == 0) break;
            System.out.println("The total so far is " + all);
        }
        System.out.println("The total is " + all);
    }
}
