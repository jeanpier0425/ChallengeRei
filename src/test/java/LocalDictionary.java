import java.io.IOException;
import java.util.ArrayList;

public class LocalDictionary {

    static ArrayList<String> correctWordsHere;

     public static void searchWord(String word) throws IOException
    {
        ArrayList<String> permutations = OnlineDictionary.getPermutations(word);
        correctWordsHere  = new ArrayList<>();

        if (!FindWordInList.searchWord(word)) {
            System.out.println("The word is wrong");
        } else{
            for (String perm : permutations) {
                if (FindWordInList.searchWord(perm)) {
                    correctWordsHere.add(perm);
                }
            }
        }

        correctWordsHere.forEach(System.out::println);
    }
}