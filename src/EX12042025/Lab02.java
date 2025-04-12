package EX12042025;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }else {
            System.out.println("not allowed");
        }
        sc.close();
    }
}
