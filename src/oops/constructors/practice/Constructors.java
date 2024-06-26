package oops.constructors.practice;

public class Constructors {

    int x, y;  //Instance variables

    // Default constructor means no parameters
    Constructors() {
        x = 100;
        y = 200;
    }

    Constructors(int a, int b) {
        x = a;
        y = b;
    }

    //method to calculate sum of two values
    int sum() {
        return x+y;
    }

}
