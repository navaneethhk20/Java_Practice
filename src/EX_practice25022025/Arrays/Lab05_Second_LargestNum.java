package EX_practice25022025.Arrays;

import java.util.Arrays;

public class Lab05_Second_LargestNum {
    public static void main(String[] args) {
        int [] array = {4,56,96,74,21,32};
        Arrays.sort(array);
        System.out.println(array[4]);
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
