
public class Book {
    private final String title;
    private final String publisher;
    private final int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public int year() {
        return year;
    }

    public String publisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
    
    
    
    
    
    
    
}
