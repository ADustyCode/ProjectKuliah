import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans, ans1, guess = "";
        System.out.println("TWO MORE QUESTIONS, BABY!\n\nThink of something and I'll try to guess it!");
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        ans = in.nextLine();
        System.out.print("Question 2) Is it a living thing? ");
        ans1 = in.nextLine();
        System.out.println();
        if (ans.equalsIgnoreCase("inside") && ans1.equalsIgnoreCase("yes")){guess = "houseplant";}
        else if (ans.equalsIgnoreCase("outside") && ans1.equalsIgnoreCase("yes")){guess = "bison";}
        else if (ans.equalsIgnoreCase("both") && ans1.equalsIgnoreCase("yes")){guess = "dog";}
        else if (ans.equalsIgnoreCase("inside") && ans1.equalsIgnoreCase("no")){guess = "shower curtain";}
        else if (ans.equalsIgnoreCase("outside") && ans1.equalsIgnoreCase("no")){guess = "billboard";}
        else if (ans.equalsIgnoreCase("both") && ans1.equalsIgnoreCase("no")){guess = "cell phone";}
        if (!guess.isEmpty()){System.out.printf("Then what else could you be thinking of besides a %s?!?", guess);}
    }
}
