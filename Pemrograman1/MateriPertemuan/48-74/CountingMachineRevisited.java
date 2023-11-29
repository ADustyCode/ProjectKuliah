import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count from: ");
        int start = in.nextInt();
        System.out.print("Count to  : ");
        int end = in.nextInt();
        System.out.print("Count by  : ");
        int by = in.nextInt();
        for (int i = start; i <= end; i+=by){
            System.out.printf("%d ", i);
        }
    }
}
