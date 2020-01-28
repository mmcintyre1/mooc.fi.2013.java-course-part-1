import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num: list) {
            sum += num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        return (double)sum / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return -1;
        }
        double avg = average(list);
        double runningTotal = 0;
        
        for (int num: list) {
            runningTotal += Math.pow((num-avg), 2);
        }
        
        return runningTotal / (list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
