package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArrayThrouhScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        for (int i =0;i< a.length;i++){
            System.out.println("Enter a value for position "+i+": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Printing array elements: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Printing array elements in reverse order: ");
        System.out.print("[");
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j]);
            if (j != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


}
