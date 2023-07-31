import java.util.List;
import java.util.Random;

public class sd {
    public static void main(String[] args) {
        List<String> elements = List.of("Element 1", "Element 2", "Element 3");

        Random random = new Random();
        String randomElement = elements.get(random.nextInt(elements.size()));

        System.out.println("Randomly selected element: " + randomElement);
    }
}
