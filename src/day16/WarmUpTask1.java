package day16;

public class WarmUpTask1 {
    public static void main(String[] args) {
        String input = "AABBCCBC";
        String result = "";

        for (int i = 0; i < input.length(); i++) {

            String ch = "" + input.charAt(i);

            if (!result.contains(ch)) {

                result += ch;


            }
        }

        System.out.println(result);


    }
}



/*
Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet
                   before you are adding
 */