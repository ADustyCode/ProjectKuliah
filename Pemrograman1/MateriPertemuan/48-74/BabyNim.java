import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choose;
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        int rm;

        while (pileA > 0 || pileB > 0 || pileC > 0){
            System.out.printf("A: %d    B: %d   C: %d\n", pileA, pileB, pileC);
            System.out.print("Choose a pile: ");
            choose = in.next().toUpperCase();
            System.out.printf("How many to remove from pile %s: ", choose);
            rm = in.nextInt();
            if (choose.equals("A")){
                pileA -= rm;
            }
            else if (choose.equals("B")){
                pileB -= rm;
            }
            else if (choose.equals("C")){
                pileC -= rm;
            }
            if (pileA <= 0 && pileB <= 0 && pileC <= 0)
                System.out.printf("A: %d    B: %d   C: %d\n", pileA, pileB, pileC);
        }
        System.out.println("All piles are empty. Good job!");
    }
}
