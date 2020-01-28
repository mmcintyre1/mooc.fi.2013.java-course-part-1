
public class StringUtils {

    public static boolean included(String word, String searched) {

        if (word != null && searched != null) {
            if (word.toUpperCase().trim().contains(searched.toUpperCase().trim())) {
                return true;
            }
        }
        return false;
    }
}
