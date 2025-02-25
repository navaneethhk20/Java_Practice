package EX_practice25022025.Loops;

import java.util.Scanner;

public class Lab08_MaxOf2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 =sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 =sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is the max number");
        }else
        {
            System.out.println(num2+" is the max number");
        }
        sc.close();
    }
}
