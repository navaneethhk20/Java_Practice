package EX_20250323;

import java.util.Scanner;

public class Lab04 {
    //check if a character is vowel or consonant
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("it is a vowel");
        } else {
            System.out.println("it is a consonant");
        }
    }
}
