
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int checkNumber = Integer.parseInt(reader.nextLine());
        
        if (checkNumber % 2 == 0) {
            System.out.println("Number "  + checkNumber + " is even.");
        } else {
            System.out.println("Number " + checkNumber + " is odd.");
        }

    }
}
