package EX_20250323;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        //check if a person is elligble to vote
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the persons age");
        int age = sc.nextInt();

        if(age>110 || age <0){
            System.out.println("enter the age between 0 and 100");
        } else if (age>=18) {
            System.out.println("allowed to vote");
        }else {
            System.out.println("not allowed to vote");
        }
        sc.close();
    }
}
