
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String text = reader.nextLine();

        System.out.print("Length of the end part: ");
        int endPart = Integer.parseInt(reader.nextLine());

        System.out.print("Result: " + text.substring(text.length() - endPart));
    }
}
