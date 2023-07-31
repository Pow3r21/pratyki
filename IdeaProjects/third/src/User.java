public class User {

    //public - dostepne wszędzie
    //private - dostepny tylko w klasie
    // protected - dostepne w tej samej klasie i pakiecie
    String firstName;
    String lastName;
    String plec;



    Boolean likeIceCream;


    public User(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.plec = plec;
        this.likeIceCream = likeIceCream;
    }

    void introduceYourself(){
        System.out.println("Hi! My name is " + firstName + " " + lastName);
    }

}
