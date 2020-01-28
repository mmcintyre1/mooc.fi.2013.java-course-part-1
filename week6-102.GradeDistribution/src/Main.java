import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        
        System.out.println("Type exam scores: -1 completes:");
        
        while (true) {
            int grade;
            grade = Integer.parseInt(reader.nextLine());
            
            if ( grade == -1 ) {
                break;
            }
            
            gradeBook.addGrade(grade);
        }
        
        gradeBook.gradeReport();
    }
}
