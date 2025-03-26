package Ex26032025.Part2;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //check if the number is palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp_num = num;
        int rev=0;

        while (temp_num!=0){
            rev = rev*10+temp_num%10;
            temp_num=temp_num/10;
        }
        System.out.println(rev);

        if (rev == num){
            System.out.println("Palindrome");
        }else {
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
