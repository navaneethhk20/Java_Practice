package Ex26032025;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //Check if it is a triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle");
        int side1 =sc.nextInt();
        int side2 =sc.nextInt();
        int side3 =sc.nextInt();

        if((side1+side2>side3) && (side2+side3>side1) && (side3+side2>side1)) {
            System.out.println("it is a triangle");
        }else {
            System.out.println("not a triangle");
        }
    }
}
