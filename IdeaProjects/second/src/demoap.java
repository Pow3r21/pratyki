import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class demoap {
    public static void main(String[] args){
        // typ nazwa = wartosc;

        List<String> jobs = List.of("Programista", "Informatyk", "Sprzedawca");

        Random random = new Random();
        String job = jobs.get(random.nextInt(jobs.size()));
        String job2 = jobs.get(random.nextInt(jobs.size()));

        User user1 = new User("Bartek","Testowy","facet", 20,true);
        Boolean adult = user1.isAdult();
        System.out.println("firstName: " + user1.firstName + " lastName: " + user1.lastName + " gender: " + user1.plec + " age: " + user1.age + " job: " + job);
        System.out.println("Czy Bartek jest osobą dorosłą " + adult);



        User user2 = new User("Jadwiga","Kowalska","Kobieta", 17,false);
        System.out.println("firstName: " + user2.firstName + " lastName: " + user2.lastName + " gender: " + user2.plec + " age: " + user2.age + " job: " + job2);
        System.out.println("Czy jadwiga jest osobą dorosłą " + user2.isAdult());




    }





}
