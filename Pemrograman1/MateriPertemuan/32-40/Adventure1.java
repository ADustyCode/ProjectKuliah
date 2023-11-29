import java.util.Scanner;

public class Adventure1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String one, two, three;
        System.out.println("WELCCOME TO MITCHELL'S TINY ADVENTURE!\n");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
        System.out.print("> ");
        one = in.nextLine();
        System.out.println();
        if (one.equalsIgnoreCase("kitchen")){
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
            System.out.print("> ");
            two = in.nextLine();
            if (two.equalsIgnoreCase("refrigerator")){
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
                System.out.print("> ");
                three = in.nextLine();
                if (three.equalsIgnoreCase("yes")){
                    System.out.println("There is a milk for you to taste.");
                }
                else if (three.equalsIgnoreCase("no")){
                    System.out.println("You die of starvation... eventually.");
                }
            }
            else if (two.equalsIgnoreCase("cabinet")){
                System.out.println("Check out your clothes and jewels for the evening party!");
                System.out.print("> ");
                three = in.nextLine();
                if (three.equalsIgnoreCase("yes")){
                    System.out.println("You can try out the nice t-shirt.");
                }
                else if (three.equalsIgnoreCase("no")){
                    System.out.println("Your outfit looks so bad.");
                }
            }
        }

        else if (one.equalsIgnoreCase("upstairs")){
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?");
            System.out.print("> ");
            two = in.nextLine();
            if (two.equalsIgnoreCase("bedroom")){
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
                System.out.print("> ");
                three = in.nextLine();
                if (three.equalsIgnoreCase("yes")){
                    System.out.println("Here is a collections of your books to read!");
                }
                else if (three.equalsIgnoreCase("no")){
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,");
                }
            }
            else if (two.equalsIgnoreCase("bathroom")){
                System.out.println("You are in bathroom, which has a shampoo and soap, will you choose soap first?");
                System.out.print("> ");
                three = in.nextLine();
                if (three.equalsIgnoreCase("yes")){
                    System.out.println("Your body will be smooth again");
                }
                else if (three.equalsIgnoreCase("no")){
                    System.out.println("your body will not be slippery");
                }
            }
        }

    }
}
