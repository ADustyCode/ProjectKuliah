import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lname = "";
        System.out.print("What's your last name? ");
        lname = in.nextLine();
        if (lname.compareTo("Carswell") <= 0){System.out.println("you don't have to wait long");}
        else if (lname.compareTo("Jones") <= 0){System.out.println("that's not bad");}
        else if (lname.compareTo("Smith") <= 0){System.out.println("looks like a bit of a wait");}
        else if (lname.compareTo("Young") <= 0){System.out.println("it's gonna be a while");}
        else if (lname.compareTo("Young") >= 0){System.out.println("not going anywhere for a while?");}
    }
}
