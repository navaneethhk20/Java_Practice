package EX_20250323.Part2;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //check if an character is alphabet
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to check");
        char ch = sc.next().charAt(0);
        if(Character.isAlphabetic(ch)){
            System.out.println("character is an alphabet");
        }else {
            System.out.println("not an alphabet");
        }
        sc.close();
    }
}
