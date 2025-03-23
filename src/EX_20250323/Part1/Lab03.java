package EX_20250323.Part1;

import java.util.Scanner;

public class Lab03 {
    //Find the maximum of 2 numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();
        System.out.println("Enter the num2");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("greater number is num1 "+num1);
        }else {
            System.out.println("greater number is num2 "+num2);
        }
        sc.close();
    }
}
