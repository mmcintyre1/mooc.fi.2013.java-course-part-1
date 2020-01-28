
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int counter = 1;
        
        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());        
        
        while (guess != numberDrawn) {
            System.out.print("The number is ");
            if (guess < numberDrawn) {
                System.out.print("greater");
            } else {
                System.out.print("lesser");
            }
            System.out.println(", guesses made: " + counter);
            counter++;
            
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine()); 
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
