package EX_practice25022025;

import java.util.Scanner;

public class Lab05_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if ( num%2 == 0){
            System.out.println(num + " is a even number");
        }else
        {
            System.out.println(num +" is a odd number");
        }
        sc.close();
    }


}