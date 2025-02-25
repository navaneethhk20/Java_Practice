package EX_practice25022025.PracticeQuestions;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //check largest of 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+ " is the maximum");
        } else if (num2>num3) {
            System.out.println(num2+" is the maximum");
        }else {
            System.out.println(num3+" is the maximum");
        }

    }
}
