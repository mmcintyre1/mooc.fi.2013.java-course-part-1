import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private final int lengthOfPassword;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        this.lengthOfPassword = length;
        this.random = new Random();
    }

    public String createPassword() {
        String password = "";
        
        for (int i = 0; i < this.lengthOfPassword; i++) {
            password += this.alphabet.charAt(this.random.nextInt(this.alphabet.length()));
        }
            
        return password;
    }
}
