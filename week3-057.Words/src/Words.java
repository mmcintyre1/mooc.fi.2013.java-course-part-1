import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                words.add(name);
            } // end if/else
        } // end while
        
        System.out.println("You types the following words: ");
        for (String word: words) {
            System.out.println(word);
        }
    } // end main
}
