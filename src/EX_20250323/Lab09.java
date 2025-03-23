package EX_20250323;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        //Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year%4==0 || year%400==0 && year%100==0){
            System.out.println("entered year is leap "+year);
        }else {
            System.out.println("not a leap year "+year);
        }
        sc.close();
    }
}
