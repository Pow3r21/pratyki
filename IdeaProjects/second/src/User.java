import java.util.ArrayList;
import java.util.List;

public class User {

    String firstName;
    String lastName;
    String plec;
    int age;
    Boolean likeIceCream;




    public User(String firstName, String lastName, String plec, int age, Boolean likeIceCream){
        this.firstName = firstName;
        this.lastName = lastName;
        this.plec = plec;
        this.age = age;
        this.likeIceCream = likeIceCream;


    }

    void introduceYourself(){
        System.out.println("Hi! My name is " + firstName + " " + lastName);
    }

    Boolean isAdult(){
        if(age > 18){
            return true;
        }
        else{
            return false;
        }
    }


}
