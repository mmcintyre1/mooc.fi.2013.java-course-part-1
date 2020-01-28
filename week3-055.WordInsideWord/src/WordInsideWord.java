
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        
        System.out.print("Type the second word: ");
        String embeddedWord = reader.nextLine();
        
        System.out.print("The word '" + embeddedWord + "' is ");
        if (!(firstWord.contains(embeddedWord))) {
            System.out.print("not ");
        }
        System.out.print("found in the word '" + firstWord + "'");
    }
}
