package arrays;

import java.util.Arrays;

public class BasicArrayConcepts {

    /*

     */

    public static void main(String[] args) {
        //1. Declaring an Array  Approach 1

        int amount[] = new int[5];
        //2. Add data
        amount[0] = 10;
        amount[1] = 20;
        amount[2] = 30;
        amount[3] = 40;
        amount[4] = 590;
        //Program -- Sum of amount array
        int sum = 0;
        for (int i : amount) {
            sum = sum + i;
        }
        System.out.println(sum);

//        //1. Declaring an Array  Approach 2
//
//        int a[] = {10, 20, 30, 40,};
//        for (int i = 0; i <= a.length - 1; i++) {
//            System.out.println(a[i]);
//        }

    }
}
