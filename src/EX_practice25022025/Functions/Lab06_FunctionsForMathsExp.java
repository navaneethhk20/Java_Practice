package EX_practice25022025.Functions;

import java.util.Scanner;

public class Lab06_FunctionsForMathsExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b= sc.nextInt();

        int res_sum = sum(a, b);
        int res_sub = sub(a, b);
        int res_mul = mul(a, b);
        int res_div = div(a, b);
        int res_mod = mod(a, b);

        System.out.println(res_div);
        System.out.println(res_mod);
        System.out.println(res_mul);
        System.out.println(res_sub);
        System.out.println(res_sum);

    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }

    }
