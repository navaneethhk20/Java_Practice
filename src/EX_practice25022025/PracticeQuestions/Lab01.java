package EX_practice25022025.PracticeQuestions;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //Write a program to check if a number is positive,negative or 0

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numner");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Number is 0");
        }else if(num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
}
