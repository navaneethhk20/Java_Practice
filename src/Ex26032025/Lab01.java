package Ex26032025;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args){
        //ATM withdraw
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        int amt = sc.nextInt();
        if((amt<=balance) && (amt>100) &&(amt%100== 0)) {
            System.out.println("amount is getting deducted " + amt);
            System.out.println("balance after deduction " + (balance - amt));
        }else {
            System.out.println("withdraw failed");
        }
        sc.close();
    }
}
