package day19_loopWithoutCurlyBraces;

public class Reverse2 {
    public static void main(String[] args) {
        int num = 12345;
        int reverse =0;
        int temp;

        while (num>0){
            temp = num%10;
            reverse = reverse* 10 + temp;
            num = num/10;

        }



        System.out.println(reverse);
    }
}
