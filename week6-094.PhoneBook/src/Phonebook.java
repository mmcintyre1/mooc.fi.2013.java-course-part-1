
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> records;

    public Phonebook() {
        this.records = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.records.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : records) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        String matchText = "number not known";

        for (Person person : records) {
            if (person.getName().contains(name)) {
                matchText = person.getNumber();
            }
        }
        
        return matchText;

    }
}
