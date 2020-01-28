
import java.util.ArrayList;
import java.util.Arrays;

public class GradeBook {

    private ArrayList<Integer> grades;
    private int[] counts = new int[6];
    private int totalGrades;

    public GradeBook() {
        this.grades = new ArrayList<Integer>();
    }

    public void addGrade(int grade) {
        if (grade <= 60 && grade >= 0) {
            this.grades.add(grade);
            this.count(grade);
            this.totalGrades++;
        }
    }

    public int sum() {
        int sum = 0;

        for (int grade : this.grades) {
            sum += grade;
        }
        return sum;
    }

    public void count(int number) {
        if (number < 30) {
            counts[0]++;
        } else if (number < 35) {
            counts[1]++;
        } else if (number < 40) {
            counts[2]++;
        } else if (number < 45) {
            counts[3]++;
        } else if (number < 50) {
            counts[4]++;
        } else {
            counts[5]++;
        }
    
    }
    
    public String printStars(int howMany) {
        String starLine = "";
        
        for ( int i = 0; i < howMany; i++ ) {
            starLine += "*";
        }
        
        return starLine;
    }
    
    public double acceptancePercent() {
        if (this.totalGrades == 0) {
            return 0.0;
        }
        
        int accepted = 0;
        
        for ( int i = 1; i < 6; i++ ) {
            accepted += this.counts[i];
        }
        
        return accepted * 100 / this.totalGrades;
        
    }

    public void gradeReport() {
        System.out.println("Grade distribution:");

        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + this.printStars(counts[i]));
        }
        System.out.println("Acceptance percentage: " + String.format("%.1f", this.acceptancePercent()));

    }

}
