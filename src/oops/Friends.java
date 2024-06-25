package oops;

public class Friends {

    String friend_Name;
    int mobile_Number;
    char gender;

    void display(String friend_Name, int mobile_Number, char gender){
        this.friend_Name = friend_Name;
        this.mobile_Number = mobile_Number;
        this.gender = gender;
        System.out.println("Name: "+friend_Name+", Mobile: "+mobile_Number+", Gender: "+gender);
    }
}
