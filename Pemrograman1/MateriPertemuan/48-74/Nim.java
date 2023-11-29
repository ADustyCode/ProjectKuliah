import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pileA = 3;
        int pileB = 4;
        int pileC = 5;
        int turn = 0;
        int rm;
        String current = "", player1, player2, choice;

        System.out.print("Player 1, enter your name: ");
        player1 = in.nextLine();
        System.out.print("Player 2, enter your name: ");
        player2 = in.nextLine();
        while (pileA > 0 || pileB > 0 || pileC > 0){
            if (turn % 2 == 0){
                current = player1;
            }
            else if (turn %2 > 0){
                current = player2;
            }
            System.out.printf("A: %d    B: %d   C: %d\n", pileA, pileB, pileC);
            System.out.printf("%s, choose a pile: ", current);
            choice = in.next();
            while (choice.equals("A") && pileA <= 0 || choice.equals("B") && pileB <= 0 || choice.equals("C") && pileC <= 0){
                System.out.printf("Nice try, %s. That pile is empty. Choose again: ", current);
                choice = in.next();
            }
            System.out.printf("How many to remove from pile %s: ", choice);
            rm = in.nextInt();
            if (choice.equals("A")){
                while (rm > pileA){
                    System.out.printf("Pile %s doesn't have that many. Try again: ", choice);
                    rm = in.nextInt();
                }
                pileA -= rm;
            }
            else if (choice.equals("B")){
                while (rm > pileB){
                    System.out.printf("Pile %s doesn't have that many. Try again: ", choice);
                    rm = in.nextInt();
                }
                pileB -= rm;
            }
            else if (choice.equals("C")){
                while (rm > pileC){
                    System.out.printf("Pile %s doesn't have that many. Try again: ", choice);
                    rm = in.nextInt();
                }
                pileC -= rm;
            }
            turn++;
            if (pileA+pileB+pileC==1 && current.equals(player1)){
                System.out.printf("A: %d    B: %d   C: %d\n", pileA, pileB, pileC);
                System.out.printf("%s, you must take the last remaining counter, so you lose. %s wins!", player2, player1);
                break;
            }
            else if (pileA+pileB+pileC==1 && current.equals(player2)){
                System.out.printf("A: %d    B: %d   C: %d\n", pileA, pileB, pileC);
                System.out.printf("%s, you must take the last remaining counter, so you lose. %s wins!", player1, player2);
                break;
            }
            if (pileA <= 0 && pileB <=0 && pileC <=0 ){
                System.out.printf("%s, there are no counters left, so you WIN!", current);
            }
        }

    }
}
