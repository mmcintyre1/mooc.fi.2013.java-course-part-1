
public class EvenNumbers {

    public static void main(String[] args) {
        int counter = 2;
        
        while (counter < 101) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
