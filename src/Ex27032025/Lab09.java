package Ex27032025;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        // Multiplication Table of a Given Number (take the input from user).
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
