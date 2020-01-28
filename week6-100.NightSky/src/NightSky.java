
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);

    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }   

    public void printLine() {
        Random rand = new Random();

        String starLine = "";

        for (int i = 0; i < this.width; i++) {

            if (rand.nextDouble() < this.density) {
                starLine += "*";
                this.starsInLastPrint++;
            } else {
                starLine += " ";
            }
        }
        
        System.out.println(starLine);
    }
    
    public void print() {
        // reset the instance variable so its not an aggregate
        this.starsInLastPrint = 0; 
        
        for ( int i = 0; i < this.height; i++ ) {
            this.printLine();
        }
    }
}
