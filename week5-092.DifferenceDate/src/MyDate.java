
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    
    public int getDaysIn365() {
        return (this.month * 30) + this.day;
    }
    
    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int yearDifference = Math.abs(this.year - comparedDate.year);
        int dayDifference;

        if (this.earlier(comparedDate)) {
            dayDifference = this.getDaysIn365() - comparedDate.getDaysIn365();
        } else {
            dayDifference = comparedDate.getDaysIn365() - this.getDaysIn365();
        }

        if (yearDifference > 0 && dayDifference > 0) {
            yearDifference--;
        }
        return yearDifference;
    }

}
