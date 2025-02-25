package EX_practice25022025.Loops;

import java.util.Scanner;

public class Lab09_GradeCalculator {
    public static void main(String[] args) {
/*
A=90-100
B=80-89
C=70-79
D=60-69
E=40-59
F=0-39
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        char A = 'A';
        char B = 'B';
        char C = 'C';
        char D = 'D';
        char E = 'E';
        char F = 'F';

        if (marks>100 || marks <0) {
            System.out.println("Enter the vlaues between 0 & 100");
        } else if (marks > 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks > 80 && marks <= 89) {
            System.out.println("B");
        } else if (marks > 70 && marks <= 79) {
            System.out.println("C");
        } else if (marks > 60 && marks <= 69) {
            System.out.println("D");
        } else if (marks > 40 && marks <= 59) {
            System.out.println("E");
        } else {
            System.out.println("F");

        }
    }
}
