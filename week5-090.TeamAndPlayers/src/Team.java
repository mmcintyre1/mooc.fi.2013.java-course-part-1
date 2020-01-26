
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.maxSize = 16;
        this.players = new ArrayList<Player>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        if (this.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public int goals() {
        int totalGoals = 0;
        
        for (Player player : this.players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
