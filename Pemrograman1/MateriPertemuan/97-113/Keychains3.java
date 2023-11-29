import java.util.Scanner;

public class Keychains3 {
    static int total_keychains = 0;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double  tax = 0.0825;
        int ch, ship = 5, pership = 1, pk = 10;
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
                view_order(total_keychains, pk, tax, ship, pership);
            }
            else if (ch == 4){
                System.out.println("CHECKOUT");
                System.out.print("What is your name? ");
                String name = in.next();
                view_order(total_keychains, pk, tax, ship, pership);
                System.out.println("Thanks for your order, " + name + "!");
                break;
            }
            else System.out.println("Input invalid.");
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
    public static void view_order( int num_keychains, int price_per_keychain, double tax, int base_shipping, int per_keychain_shipping ){
        System.out.print("You have " + num_keychains + " keychains");
        System.out.println("Keychains cost $10 each.");
        System.out.println("Shipping charges: " + base_shipping);
        int keycharge = (total_keychains * price_per_keychain);
        System.out.println("Subtotal: " + keycharge);
        System.out.println("Tax: " + tax);
        double total = keycharge+(tax*keycharge)+per_keychain_shipping+base_shipping;
        System.out.println("Total cost is $" + total);
    }

}
/*
What is your name? Biff
You have 2 keychains.
Keychains cost $10 each.
Total cost is $20.
Thanks for your order, Biff!
 */
