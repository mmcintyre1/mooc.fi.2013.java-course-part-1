
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a temperature: ");
            double temperature = Double.parseDouble(reader.nextLine());

            if (temperature < -30 || temperature > 40) {
                System.out.println("Temperature not within bounds and ignored");
            } else {
                Graph.addNumber(temperature);
            }
        }
    }
}
