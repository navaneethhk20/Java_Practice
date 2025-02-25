package EX_practice25022025.Loops;

import java.util.Scanner;

public class Lab07_AllowedToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }else
        {
            System.out.println("Not allowed");
        }
        sc.close();
    }
}
