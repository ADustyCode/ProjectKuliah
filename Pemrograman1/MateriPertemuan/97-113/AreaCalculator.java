import java.util.Scanner;
/*Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

1) Triangle
2) Rectangle
3) Square
4) Circle
5) Quit
Which shape: 1 */

public class AreaCalculator {
    public static void main(String[] args) {
        double res = 0;
        int a = 0, b = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.\n");
        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=--=-=-=-=-=-\n");
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.print("Which shape: ");
            int ch = in.nextInt();
            if (ch == 1){
                System.out.print("Base: ");
                a = in.nextInt();
                System.out.print("Height: ");
                b = in.nextInt();
                res = area_triangle(a, b);
            }
            else if (ch == 2){
                System.out.print("Length: ");
                a = in.nextInt();
                System.out.print("Width: ");
                b = in.nextInt();
                res = area_rectangle(a, b);
            }
            else if (ch == 3){
                System.out.print("Side Length: ");
                a = in.nextInt();
                res = area_square(a);
            }
            else if (ch == 4){
                System.out.print("Radius: ");
                a = in.nextInt();
                res = area_circle(a);
            }
            else{
                System.out.println("Goodbye.");
                break;
            }
            System.out.println("The area is " + res);
        }
        
    }

    public static double area_circle( int radius ){
        return (3.14 * (radius * radius));
    }
    public static int area_rectangle( int length, int width ){
        return (length * width);
    }
    public static int area_square( int side ){
        return (side * side);
    }
    public static double area_triangle( int base, int height ){
        return (0.5 * (base * height));
    }
}
