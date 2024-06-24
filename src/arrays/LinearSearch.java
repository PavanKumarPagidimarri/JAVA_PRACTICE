package arrays;

import java.util.Scanner;

public class LinearSearch {


    public static void main(String[] args) {
        int age[] = {10,20,17,20,22,10,10, 10};
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter search element:");
        int search_number = scanobj.nextInt();
        int count = 0;
        boolean status = false;
        for (int j : age) {
            if (search_number == j) {
                status = true;
                count++;
            }
        }
        if (status) {
            System.out.println(search_number + " Number Found in the array");
            System.out.println(search_number + " Appeared " + " " + count + " Times");
        }
        if(!status){
            System.out.println("Element not found in the array");
        }

    }
}
