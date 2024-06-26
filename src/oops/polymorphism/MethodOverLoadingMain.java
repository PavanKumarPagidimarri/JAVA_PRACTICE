package oops.polymorphism;

public class MethodOverLoadingMain {

    public static void main(String[] args) {
        MethodOverLoading overloadObject = new MethodOverLoading();
        long sum = overloadObject.sum(1,21335566434232l);
             System.out.println("Sum:"+sum);
        overloadObject.sum();  // default method
        overloadObject.sum(30,50);
        overloadObject.sum(3.5f,5.8f);
        double sumd =  overloadObject.sum(2345321.2,1314355.6);
             System.out.println("Sum:"+sumd);
    }
}
