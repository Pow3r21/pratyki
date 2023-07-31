import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office computer", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 100);
        Computer macbook = new Laptop("MB PRO", "PRO", 500, 256, 100);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }

    }
}
