package oops.constructors.practice;

public class ConstructorOverLoadingMain {
    public static void main(String[] args) {
        ConstructorOverloading default_object = new ConstructorOverloading();
            System.out.println(default_object.volume());
        ConstructorOverloading object_parameters = new ConstructorOverloading(12.3,12.7,13.9);
            System.out.println(object_parameters.volume());


    }

}
