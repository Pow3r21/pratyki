public class Java1 {

    public static void main(String[] args) {
        int a = 6;
        int b = 992;
        int c = 122;
        int d = 422;

        int suma1 = a + b;
        int suma2 = c + d;


        if(suma1 % 2 != 0){
            System.out.println("suma1 jest nie parzysta");
        } else if (suma2 % 2 != 0){
            System.out.println("suma2 jest nie parzysta");
        } else{
            System.out.println("Obie sumy są parzyste");
        }


    }

}
