
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int counter = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        
        while (counter <= upperLimit) {
            System.out.println(counter);
            counter++;
        }


    }
}
