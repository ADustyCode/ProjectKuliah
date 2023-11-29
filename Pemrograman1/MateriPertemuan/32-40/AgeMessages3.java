/*
 * 
 * maaf pak, ini kestop ditengah video
 */

import java.util.Scanner;

public class AgeMessages3 {
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Your name: ");
        name = in.nextLine();
        System.out.print("Your age: ");
        age = in.nextInt();
        if (age < 16){
            System.out.printf("You can't drive, %s.", name);
        }
        if (age >= 16 && age <= 17){
            System.out.printf("You can drive but not vote, %s.", name);
        }
        if (age >= 18 && age <= 24){
            System.out.printf("You can vote but not rent a car, %s.", name);
        }
        if (age >= 25){
            System.out.printf("You can do pretty much anything., %s.", name);
        }
        
    }
}
