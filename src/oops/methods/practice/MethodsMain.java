package oops.methods.practice;

public class MethodsMain {

    public static void main(String[] args) {
      Methods methods_object = new Methods();
      methods_object.nopar_noret();  // No parameter and no return type
      methods_object.par_noret(12);  // parameter and no return type
      methods_object.nopar_ret();   // No parameter and has return type
      methods_object.par_ret(17);  // parameter and return type
    }
}
