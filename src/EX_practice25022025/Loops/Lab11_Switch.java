package EX_practice25022025.Loops;
import java.util.Scanner;
public class Lab11_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        switch (marks/10) {
            case 90:
                System.out.println("A");
                break;
            case 70:
                System.out.println("B");
                break;
            case 80:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            case 30:
                System.out.println("F");
                break;

            default:
                System.out.println("invalid");
                break;

        }
    }
}
