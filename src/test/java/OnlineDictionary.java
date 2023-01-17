import java.io.IOException;
import java.util.ArrayList;


public class OnlineDictionary {

    public static boolean searchWord(String word) throws IOException {

        ArrayList<String> correctWords = new ArrayList<>();
        boolean result = false;
        ArrayList<String> permutations = getPermutations(word);
        for (String perm : permutations) {
            result = OnlineSearch.checkWord(perm);
            if (result) {
                correctWords.add(perm);
            }
        }
        correctWords.forEach(System.out::println);
        return result;
    }

    public static ArrayList<String> getPermutations(String word) {
        ArrayList<String> permutations = new ArrayList<>();
        getPermutations("", word, permutations);
        return permutations;
    }

    private static void getPermutations(String prefix, String word, ArrayList<String> permutations) {
        int n = word.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                getPermutations(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1, n), permutations);
            }
        }
    }
}