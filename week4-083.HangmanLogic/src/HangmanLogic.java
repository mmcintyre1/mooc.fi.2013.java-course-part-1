
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {

        if (word.contains(letter) && !guessedLetters.contains(letter)) {
            guessedLetters += letter;
        } else if (!guessedLetters.contains(letter)) {
            guessedLetters += letter;
            numberOfFaults++;
        }
    }

    public String hiddenWord() {
        String shownWord = "";
        for (int i = 0; i < this.word.length(); i++) {
            char letter = this.word.charAt(i);
            if (this.guessedLetters.indexOf(letter) >= 0) {
                shownWord += letter;
            } else {
                shownWord += "_";
            }
        }
        return shownWord;
    }
}
