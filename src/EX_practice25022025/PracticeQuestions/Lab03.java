package EX_practice25022025.PracticeQuestions;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //check if a character is vowel or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch == 'A' || ch=='E'|| ch=='I'|| ch=='O'||ch=='U' ){
            System.out.println("Vowel");
        }else {
            System.out.println("consonant");
        }
    }
}
