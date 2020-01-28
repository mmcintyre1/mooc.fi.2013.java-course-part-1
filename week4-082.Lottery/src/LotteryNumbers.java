
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private int maxDraws = 7;
    private final Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // removes old numbers and sets a new array
        this.numbers = new ArrayList<Integer>();
        int tmpNumber;
        int i = 0;

        while (i < this.maxDraws) {
            tmpNumber = this.random.nextInt(39) + 1;
            if (!this.containsNumber(tmpNumber)) {
                this.numbers.add(tmpNumber);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
