import java.util.Scanner;

public class Keychains2 {
    static int total_keychains = 0;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int ch;
        System.out.println("Ye Olde Keychain Shoppe\n");
        while (true){
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout\n");
            System.out.print("Please enter your choice: ");
            ch = in.nextInt();
            if (ch == 1){
                add_keychains();
            }
            else if (ch == 2){
                remove_keychains();
            }
            else if (ch == 3){
                view_order();
            }
            else if (ch == 4){
                checkout();
                break;
            }
        }
    }
    public static void add_keychains(){
        System.out.print("You have " + total_keychains + ". How many to add? ");
        int kc = in.nextInt();
        total_keychains += kc;
        System.out.println("You now have " + total_keychains + " keychains");
    }
    public static void remove_keychains(){
        System.out.print("You have " + total_keychains + ". How many to remove? ");
        int kc = in.nextInt();
        total_keychains -= kc;
        if (total_keychains < 0) total_keychains = 0;
        System.out.println("You now have " + total_keychains + " keychains");
    }
    public static void view_order(){
        System.out.print("You have " + total_keychains + " keychains");
        System.out.println("Keychains cost $10 each.");
        System.out.println("Total cost is $" + (total_keychains * 10));
    }
    public static void checkout(){
        System.out.println("CHECKOUT");
        System.out.print("What is your name? ");
        String name = in.next();
        System.out.println("You have " + total_keychains + " keychains.");
        System.out.println("Keychains cost $10 each.");
        System.out.println("Total cost is $" + (total_keychains * 10));
        System.out.println("Thanks for your order, " + name + "!");
    }
}
/*
What is your name? Biff
You have 2 keychains.
Keychains cost $10 each.
Total cost is $20.
Thanks for your order, Biff!
 */
