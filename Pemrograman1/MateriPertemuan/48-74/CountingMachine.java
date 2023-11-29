import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count to: ");
        int limit = in.nextInt();
        for (int i = 0; i <= limit; i++){
            System.out.printf("%d ", i);
        }
    }
}
