import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        String gender, fname, lname, marry = "", name;
        System.out.print("What is your gender (M or F): ");
        gender = in.nextLine();
        System.out.print("First name: ");
        fname = in.nextLine();
        System.out.print("Last name: ");
        lname = in.nextLine();
        System.out.print("Age: ");
        age = in.nextInt();
        System.out.println();
        name = fname + " " + lname;
        if (age >= 20 && gender.equalsIgnoreCase("F")){
            System.out.printf("Are you married, %s (y or n)? ", fname);
            marry = in.next();
            if (marry.equalsIgnoreCase("y")){System.out.println("Then I shall call you Mrs. " + lname);}
            else {System.out.println("Then I shall call you Ms. " + lname);}
        }
        if (age >= 20 && gender.equalsIgnoreCase("M")){System.out.println("Then I shall call you Mr." + lname);}
        if (age < 20){System.out.println("Then i shall call you " + name);}

    }
}
