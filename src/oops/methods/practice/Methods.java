package oops.methods.practice;

public class Methods {
    //1. example for a method with no parameter and no return type
   void nopar_noret(){
       System.out.println("This method is an example for no parameter and no return type method");
   }
     // 2. example for a method with parameter and no return type
     void par_noret(int age){
         System.out.println("This method is an example for parameter and no return type method");
         System.out.println(age);
     }

     //3. example for a method with no parameter and has return type
     int nopar_ret(){
         System.out.println("This method is an example for no parameter and return type method");
         return 1;
     }

    //4. example for a method with  parameter and has return type
    int par_ret(int age){
        System.out.println("This method is an example for  parameter and return type method");
        return age;
    }
}
