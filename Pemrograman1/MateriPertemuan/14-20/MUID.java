/*
first name
last name
grade (classification)
student id number
login name
GPA (0.0 to 4.0
 
 
Please enter the following information so I can sell it for a profit!

First name: Helena
Last name: Bonham-Carter
Grade (9-12): 12
Student ID: 453916
Login: bonham_453916
GPA (0.0-4.0): 3.73

Your information:
	Login: bonham_453916 
	ID:    453916 
	Name:  Bonham-Carter, Helena 
	GPA:   3.73 
	Grade: 12 


toLowerCase()
 */

import java.util.Scanner;

public class MUID {
	
	public static void main (String[] args) {
		Scanner inp = new Scanner(System.in);
		String fname, lname, login;
		int grade, student_id;
		double gpa;
		System.out.println("Please enter the following information so I can sell it for a profit!\n");
		System.out.print("First name: ");
		fname = inp.next();
		System.out.print("Last name: ");
		lname = inp.next();
		System.out.print("Grade (9-12): ");
		grade = inp.nextInt();
		System.out.print("Student ID: ");
		student_id = inp.nextInt();
		System.out.print("Login: ");
		login = inp.next();
		System.out.print("GPA (0.0-4.0): ");
		gpa = inp.nextDouble();
		System.out.println("Your Information:");
		System.out.println("	Login: " + login);
		System.out.println("	ID   : " + student_id);
		System.out.println("	Name : " + lname + ", " + fname);
		System.out.println("	GPA  : " + gpa);
		System.out.println("	Grade: " + grade);

	}
}

