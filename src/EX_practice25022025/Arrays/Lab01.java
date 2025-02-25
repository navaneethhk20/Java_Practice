package EX_practice25022025.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab01 {
    public static void main(String[] args) {
        String name = "Navaneeth";
        int[] age = {98, 84, 65, 450};
        String[] names = {"nithu", "magge", "hassan"};
        System.out.println(name.length());
        System.out.println(age.length);
        System.out.println(age[2]);
        System.out.println(names.length);
        System.out.println(names[2]);
       Arrays.sort(age);

        System.out.println(age.length);
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);

        }

    }
}
