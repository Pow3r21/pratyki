public class demoapp {
    public static void main(String[] args){

        // typy danych
        System.out.println(10);
        System.out.println(20.2);
        System.out.println("To jest text w javie");
        System.out.println('x');
        System.out.println(true);
        System.out.println(false);


        //zmienne
        // typ nazwa = wartosc;
        int number = 10;
        double doubleNumber = 20.3;
        String name = "Bartek";
        char x = 'x';
        Boolean isTrue = true;
        Boolean isFalse = false;

        System.out.println(number);
        System.out.println(doubleNumber);
        System.out.println(name);
        System.out.println(x);
        System.out.println(isTrue);
        System.out.println(isFalse);
        int age = 30;
        System.out.println("Cześć! Mam na imię " + name + ", mam " + age + " lat.");

        double num1 = 10;
        double num2 = 4;


        System.out.println(10 + 10);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 2);
        System.out.println(num1 / num2);

        System.out.println(10 > 9);
        System.out.println(10 < 9);
        System.out.println(10 == 9);
        System.out.println(10 != 9);

        System.out.println(10 == 10 && 20 < 19);
        System.out.println(10 != 10 || 20 < 19);
    }
}
