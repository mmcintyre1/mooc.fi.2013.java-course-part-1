
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print('\u000C');
        System.out.flush();
    }

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        while (true) {
            clearScreen();
            System.out.print(hours + ":" + minutes + ":" + seconds);   // the current time printed
            Thread.sleep(1000);

            seconds.next();
            if (seconds.getValue() == 59) {
                if (minutes.getValue() == 59) {
                    hours.next();
                }
                minutes.next();
            }
        }
    }
}
