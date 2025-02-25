package EX_practice25022025.Loops;

import java.util.Scanner;

public class Lab10_TriangleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side3");
        int side3 = sc.nextInt();
        if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("Enter the correct number");
        }
        else if((side1 == side2) && (side1 == side3) && (side2 == side3)){
            System.out.println("Equilateral");
        } else if ((side1 == side2) || (side1== side3) || (side2== side3)) {
            System.out.println("Issoscelus");
        }else {
            System.out.println("scalene");
        }

    }
}
