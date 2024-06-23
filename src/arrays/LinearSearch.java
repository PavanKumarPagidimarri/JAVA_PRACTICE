package arrays;

import java.util.Scanner;

public class LinearSearch {


    public static void main(String[] args) {
        int age[] = {10,20,17,20,22,10};
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter search element:");
        int search_number = scanobj.nextInt();

        boolean status = false;
        for (int j : age) {
            if (search_number == j) {
                System.out.println(j + " Number Found in the array");
                status = true;
                break;
            }
        }
        if(!status){
            System.out.println("Element not found in the array");
        }
    }
}
