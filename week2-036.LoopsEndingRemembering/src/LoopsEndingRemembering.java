
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int num;
        int sum = 0;
        int counter = 0;
        int evenCounter = 0;

        while (true) {
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            } else {
                if (num % 2 == 0){
                    evenCounter++;
                }
                sum += num;
                counter++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + ((double)sum / counter));
        System.out.println("Even numbers: " + evenCounter);
        System.out.println("Odd numbers: " + (counter - evenCounter));
    }
}
