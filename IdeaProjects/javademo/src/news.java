public class news {

    public static void main(String[] args) {
        // typ nazwa = wartosc;
        User user1 = new User();
        user1.firstName = "Bartek";
        user1.lastName = "Testowy";
        user1.email = "bartek@javademo.pl";
        user1.age = 18;
        user1.likeIceCream = true;
        System.out.println("User name: " + user1.firstName + " email:" + user1.email + " age: " + user1.age);
    }

}
