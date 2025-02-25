package EX_practice25022025.Operator;

import java.util.Scanner;

public class Lab03_MaximumOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();

        int maxnumber = num1>num2?num1:num2;
        System.out.println("Maximum number is "+maxnumber);
        sc.close();
    }
}
