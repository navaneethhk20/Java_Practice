package EX_practice25022025.Functions.Practice;

import java.util.Scanner;

public class Lab02_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.next();

        StringBuilder sb = new StringBuilder(name);
      String rev = String.valueOf(sb.reverse());
        System.out.println(rev);

        if(name.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
