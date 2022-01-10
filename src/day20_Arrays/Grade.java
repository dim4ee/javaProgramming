package day20_Arrays;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score < 0 || score > 100) {
                System.err.println("Invalid Entry");
                System.exit(0);

            } else if (score >= 90 && score <= 100) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");

            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to enter another score?");
            String a = scan.next();

            if (a.equalsIgnoreCase("no") || a.equalsIgnoreCase("yes")) {
                if (a.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using Cydeo Square Calculator APP");
                    break;
                }

            } else {
                System.err.println("Invalid entry, please re-enter:");
                a = scan.next();
            }


        }






    }
}
/*
Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


 */
