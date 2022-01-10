package day20_Arrays;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the length of the Rectangle:");
            int lenght = scan.nextInt();

            if (lenght == 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle: ");
            int width = scan.nextInt();

            if (width == 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }



            System.out.println("Area of rectangle is: " + (lenght * width));
            System.out.println("Perimeter of rectangle is: " + (2 *(width+lenght) ));

            System.out.println("Would you like to calculate another Square?");
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
Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
 */