package EX_20250323;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //Largest of 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
//        if(num1>num2 && num1>num3){
//            System.out.println("num1 is the largest "+num1);
//        } else if (num2>num1 && num2>num3) {
//            System.out.println("num2 is the largest "+num2);
//        }else {
//            System.out.println("num3 is the largest "+num3);
//        }
//        sc.close();

        //using ternary opertator
       int max = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println(max);
    }
}
