package day18_NestedLoop;

public class Practice1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= (5-i) ; j++) {
                System.out.print(".");
                
            }
            /*
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                
            }

             */
            System.out.println();
            
        }




    }
}
/*
Create a nested Create a nested for loops produce the loops produce the
following output.
....1
...22
..333
.4444
55555
 */
