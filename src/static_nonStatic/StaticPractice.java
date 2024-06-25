package static_nonStatic;

public class StaticPractice {

    static int a = 2;  //static variable or class variable
    int b = 3; //Non static variable or instance variable

    //Non-static method
    public void nonstaticsmethod(){
      //  static int y =2;   // we can not do it
        int x = 4;
        System.out.println(b);  // Non-static variable
        System.out.println(a);   //static variable
        System.out.println(x);
        staticmethod();  //static method
        nonstaticmethod2(); // Non-static method
    }

    //static method
    public static void  staticmethod(){
        System.out.println("Static method");
    }

    //Non static methoed 2
    public void nonstaticmethod2(){
        System.out.println("Non static 2");
    }


    public static void main(String[] args) {
        staticmethod();
        System.out.println(a);

//        System.out.println(b);  // can not print
//        nonstaticmethod();    //can not access without object creation

        StaticPractice obj = new StaticPractice();
        System.out.println(obj.b);
        obj.nonstaticsmethod();


    }
}
