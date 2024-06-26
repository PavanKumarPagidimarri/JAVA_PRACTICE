package oops.constructors.practice;

public class ConstructorsMain {

    public static void main(String[] args) {
        Constructors defcon = new Constructors();
        int sum =defcon.sum();
        System.out.println("Sum calculated by default constructor : "+sum);

        Constructors parameter_con = new Constructors(12, 13);
        int sum_by_parameters = parameter_con.sum();
        System.out.println("Sum calculated by parameter constructor : "+sum_by_parameters);
    }
}
