package EX_20250323;

import java.util.Scanner;

public class Lab01 {
    //Check if a number is positive or negative
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(("Enter the number"));
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("Number is postive "+ num);
        }else {
            System.out.println("Number is negative "+num);
        }
        sc.close();
    }
}
