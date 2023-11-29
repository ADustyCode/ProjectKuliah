import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        System.out.print("Side 1: ");
        int side1 = in.nextInt();
        System.out.print("Side 2: ");
        int side2 = in.nextInt();
        while (side2<side1){
            System.out.printf("%d is smaller than %d. Try again\n", side2, side1);
            System.out.print("Side 2: ");
            side2 = in.nextInt();
        }
        System.out.print("Side 3: ");
        int side3 = in.nextInt();
        while (side3<side2){
            System.out.printf("%d is smaller than %d. Try again\n", side3, side2);
            System.out.print("Side 3: ");
            side3 = in.nextInt();
        }
        System.out.printf("Your three sides are %d %d %d\n", side1, side2, side3);
        int total = side1*side1+side2*side2;
        double s3 = Math.sqrt(total);
        if (s3 == side3){
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        }
        else{
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }
}
