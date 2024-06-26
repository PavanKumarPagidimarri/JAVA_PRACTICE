package oops.polymorphism;

public class MethodOverLoading {

    int x = 10;
    int y = 30;
    void sum(){
        int z=x+y;
        System.out.println("Default sum: "+ z);
    }

    void sum(int a, int b){
        System.out.println("Default two int sum : "+(a+b));
    }

    long sum(int a, long b){
        System.out.println("Two method int and long: ");
        return a+b;
    }
    void sum(float a, float b){
        System.out.println("sum of two float values: " +(a+b));
    }

    double sum(double a, double b){
        System.out.println("sum of two double values: ");
        return a+b;
    }


}
