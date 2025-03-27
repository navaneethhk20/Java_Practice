package Ex27032025;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args){
        //Check if a number is divisible by 5 and 11
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int number = sc.nextInt();
         if(number%5==0 && number%11==0){
             System.out.println("number is divisible by both 5 and 11");
         } else {
             System.out.println("number is not divisible by both 5 and 11");
         }
sc.close();
    }
}
