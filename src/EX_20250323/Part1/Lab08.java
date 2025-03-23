package EX_20250323.Part1;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int smallest = (num1>num2)?(num1>num3?num3:num1):(num2>num3?num3:num2);
        System.out.println(smallest);
    }
}
