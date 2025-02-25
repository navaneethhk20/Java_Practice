package EX_practice25022025.Operator;

import java.util.Scanner;

public class Lab02_GradeCalculator {
    //Grade calculation using ternary operator
    public static void main(String[] args) {
        /*
        A=90-100
        B=80-89
        C=70-79
        D=60-69
        E=50-59
        F=0-49
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        char grade;
        char A= 'A';
        char B= 'B';
        char C= 'C';
        char D= 'D';
        char E= 'E';
        char F= 'F';

            grade = marks>90 && marks<=100?A:(marks>80&&marks<=89)?B:(marks>70&&marks<=79)?C:(marks>60&&marks<=69)?D:(marks>50&&marks<=59)?E:F;
            System.out.println(grade);

            sc.close();
        }
    }

