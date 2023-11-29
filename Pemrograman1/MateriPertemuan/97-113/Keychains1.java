import java.util.Scanner;

/*
 * Ye Olde Keychain Shoppe

1. Add Keychains to Order
2. Remove Keychains from Order
3. View Current Order
4. Checkout

Please enter your choice: 1

ADD KEYCHAINS

1. Add Keychains to Order
2. Remove Keychains from Order
3. View Current Order
4. Checkout

Please enter your choice: 3

VIEW ORDER

1. Add Keychains to Order
2. Remove Keychains from Order
3. View Current Order
4. Checkout

Please enter your choice: 4

CHECKOUT
 */
public class Keychains1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        System.out.println("ADD KEYCHAINS");
    }
    public static void remove_keychains(){
        System.out.println("REMOVE KEYCHAINS");
    }
    public static void view_order(){
        System.out.println("VIEW ORDER");
    }
    public static void checkout(){
        System.out.println("CHECKOUT");
    }
}
