package day18_NestedLoop;

public class MultiTable {
    public static void main(String[] args) {

        for(int a = 1; a <= 10; a++ ){
            System.out.print("");
            for(int b =1 ; b <=10 ; b++){
                System.out.print(" " + (a*b));
            }
            System.out.println();
        }







    }
}

/*
1. Create a class called MultiplicationTable, Write a program that can
display the multiplication table:

			1	2	3	4	5	6	7	8	9	10
			2	4	6	8	10	12	14	16	18	20
			3	6	9	12	15	18	21	24	27	30
			4	8	12	16	20	24	28	32	36	40
			5	10	15	20	25	30	35	40	45	50
			6	12	18	24	30	36	42	48	54	60
			7	14	21	28	35	42	49	56	63	70
			8	16	24	32	40	48	56	64	72	80
			9	18	27	36	45	54	63	72	81	90
			10	20	30	40	50	60	70	80	90	100


			Hint: I believe Enes Uzun can help you out on the calculation part :)

			2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters


5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique


 */
