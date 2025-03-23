package EX_20250323.Part1;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        //smallest of 2 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("smallest is "+num2);
        }else {
            System.out.println("smallest is +"+num1);
        }
        sc.close();
    }
}
