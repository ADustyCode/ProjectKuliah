import java.util.Scanner;

public class AddingValuesForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int all = 0, input = 1;
        System.out.print("Number: ");
        input = in.nextInt();
        for (int x = 1; x <= input; x++){
            System.out.printf("%d ", x);
            all += x;
        }
        System.out.println("\nThe sum is " + all);
    }
}
