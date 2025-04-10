package EX08042025;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Enter the numbers");
        int add = num1+num2;
        int add2 = num2-num1;
        System.out.println(add);
        System.out.println(add2);
    }
}
