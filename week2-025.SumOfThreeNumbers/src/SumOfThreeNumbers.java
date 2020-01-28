
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read = 0;

        while (read < 3) {
            System.out.print("Type a number: ");
            read++;
            sum = sum + Integer.parseInt(reader.nextLine());
        }
        
        System.out.println("Sum: " + sum);
    }
}
