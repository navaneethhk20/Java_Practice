package EX_practice25022025.Arrays;

public class Lab04_Sum {
    public static void main(String[] args) {
        int[] array ={1,4,6,9,55};
        int sum =0;
        for(int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        System.out.println(sum);
    }
}
