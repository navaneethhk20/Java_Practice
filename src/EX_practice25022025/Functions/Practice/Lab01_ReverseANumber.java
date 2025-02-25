package EX_practice25022025.Functions.Practice;

import java.util.Scanner;

public class Lab01_ReverseANumber {
    public static void main(String[] args) {
//Reverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev = 0;

        int rem;

        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        System.out.println(rev);
    }
}
