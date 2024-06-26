package oops.constructors.practice;

public class ConstructorOverloading {
    double width, height, depth;

    //default constructor
    ConstructorOverloading(){
        width=height=depth= 0;
    }

    ConstructorOverloading(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
        }


    double volume(){
        return  (width*height*depth);
    }

}
