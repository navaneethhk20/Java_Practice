package EX_practice25022025.Arrays;

import java.util.Arrays;

public class Lab02_MaxInAarrays {
    public static void main(String[] args) {
        int[] a = {4, 66, 78, 3, 2000, 69, 690, 452};

        int max_output= maxis(a);
        System.out.println(max_output);
        int min_output= minis(a);
        System.out.println(min_output);
        Arrays.sort(a);
        System.out.println(a.length);
    }


    static int maxis(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (  a[i]>max) {
                max = a[i];
            }
        }
        return max;
    }
    static int minis(int[] a) {
        int minmum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (  a[i]<minmum) {
                minmum = a[i];
            }
        }
        return minmum;
    }



}