package EX_practice25022025.Functions.Practice;

import java.util.Scanner;

public class Lab03_Facorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int fact=1;

        for(int i=1; i<=num; i++){
            fact =i*fact;
        }
        System.out.println(fact);
    }
}
