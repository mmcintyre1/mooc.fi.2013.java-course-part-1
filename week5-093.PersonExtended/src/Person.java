
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name) {
        this.name = name;
        this.birthday = this.getCurrentDate();
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public MyDate getCurrentDate() {
        int currentDay = Calendar.getInstance().get(Calendar.DATE);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currentDate = new MyDate(currentDay, currentMonth, currentYear);

        return currentDate;
    }

    public int age() {
        MyDate currentDate = this.getCurrentDate();

        return this.birthday.differenceInYears(currentDate);

    }

    public boolean olderThan(Person compared) {
        return this.birthday.earlier(compared.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
