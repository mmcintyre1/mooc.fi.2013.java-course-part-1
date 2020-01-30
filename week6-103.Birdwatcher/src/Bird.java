
public class Bird {

    private final String name;
    private final String latinName;
    private int seenCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.seenCount = 0;
    }

    public Bird(String name) {
        this(name, null);
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getSeenCount() {
        return this.seenCount;
    }
    
    public void wasSeen(int seenAdds) {
        while (seenAdds > 0) {
            this.wasSeen();
            seenAdds--;
        }
    }

    public void wasSeen() {
        this.seenCount++;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %d observations", 
                    this.name, this.latinName, this.seenCount);
    }  

}
