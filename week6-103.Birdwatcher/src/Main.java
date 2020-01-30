
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BirdBook birdBook = new BirdBook();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("? ");
            String command = reader.nextLine();
            System.out.println(command.toLowerCase());
            
            if (command.toLowerCase().equals("quit")) {
                break;
            }
            
            if (command.toLowerCase().equals("add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();             
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                birdBook.add(name, latinName);
            } else if (command.toLowerCase().equals("observation")) {
                System.out.print("What was observed:?");
                String name = reader.nextLine();
                birdBook.seen(name);
            } else if (command.toLowerCase().equals("statistics")) {
                birdBook.printAll();
            } else if (command.toLowerCase().equals("show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                birdBook.show(name);
            } else {
                System.out.println("Unrecognized command.");
            }
        }
    }
}
