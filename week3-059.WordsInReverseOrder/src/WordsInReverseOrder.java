import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            words.add(name);
        }
        Collections.reverse(words);
        System.out.println("You typed the following words: ");
        for(String word: words) {
            System.out.println(word);
        }
    }
}
