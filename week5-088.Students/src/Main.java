
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String studentName = reader.nextLine();
            
            if (studentName.isEmpty()) {
                break;
            }
            
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            students.add( new Student(studentName, studentNumber) );
        }
        
        for ( Student student: students ) {
            System.out.println( student );
        }
        
        System.out.println("Give a search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        
        for ( Student student: students ) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
        
    }
}
