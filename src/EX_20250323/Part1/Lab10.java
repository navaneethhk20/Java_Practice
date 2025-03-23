package EX_20250323.Part1;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        //grade calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();

        if(marks>100 || marks<0){
            System.out.println("Enter the value between 0 and 100");
        } else if (marks>90 && marks<=100) {
            System.out.println("A+");
        } else if (marks>80 && marks<=89) {
            System.out.println("A");
        }else if (marks>70 && marks<+79) {
            System.out.println("B");
        } else if (marks>60 && marks<=69) {
            System.out.println("C");
        }else if (marks>50 && marks<=59) {
            System.out.println("D");
        }else if (marks>40 && marks<=49) {
            System.out.println("E");
        } else {
            System.out.println("Fail");
        }
        scanner.close();
    }
}
