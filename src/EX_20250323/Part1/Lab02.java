package EX_20250323.Part1;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[]  args){
        //Check if number is Even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number is even "+num);
        }else {
            System.out.println("Number is odd "+num);
        }
        sc.close();
    }
}
