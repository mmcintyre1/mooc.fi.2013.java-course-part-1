
import java.util.ArrayList;

public class BirdBook {

    private ArrayList<Bird> birds;

    public BirdBook() {
        this.birds = new ArrayList<>();
    }

    private Bird findBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                return bird;
            }
        }
        return null;
    }

    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public void seen(String name) {
        Bird bird = this.findBird(name);
        
        if (bird == null) {
            System.out.println(String.format("%s is not a bird.", name));
        } else {
            bird.wasSeen();
        }
    }
    
    public void show(String name) {
        Bird bird = this.findBird(name);
        
        if (bird == null) {
            System.out.println(String.format("%s is not a bird.", name));
        } else {
            System.out.println(bird);;
        }
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);;
        }
    }
}
