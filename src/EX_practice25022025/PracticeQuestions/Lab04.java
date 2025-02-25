package EX_practice25022025.PracticeQuestions;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        //Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year%4==0 || year%100!=0 && year%400==0){
            System.out.println(year+" it is aleap year");
        }else {
            System.out.println( year+" is not a leap year");
        }
        sc.close();
    }
}
