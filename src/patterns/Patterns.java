package patterns;

import java.util.Scanner;

public class Patterns {
    Scanner obj  = new Scanner(System.in);
    void right_angle_triangle() {
        System.out.println("Enter n value For Right angle triangle:  ");
        int n = obj.nextInt(); // Number of rows

        System.out.println("This is  method");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    void reverse_right_angle_triangle() {

        System.out.println("Enter n value for reverse right angle triangle ");
        int n = obj.nextInt(); // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }


  }



}
