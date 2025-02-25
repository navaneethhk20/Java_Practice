package EX_practice25022025.Functions.Practice;

import java.util.Scanner;

public class Lab04_Fibonacciseries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int f1=0,f2=1;


            System.out.println(f1);
            System.out.println(f2);

        for(int i=0;i<=n;i++){
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
            System.out.println(f2);
        }
    }
}
