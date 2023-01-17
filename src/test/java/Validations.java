import java.util.HashSet;

public class Validations {

    public static boolean isCorrect(){

        return !LocalDictionary.correctWordsHere.isEmpty();
    }

    public static boolean checkDuplicates(){
        boolean assertFlagDuplicates = false;
        HashSet<String> set = new HashSet<String>();

        for (String element : LocalDictionary.correctWordsHere) {
            if (!set.add(element)) {
                System.out.println("Duplicate element found: " + element);
                assertFlagDuplicates = true;
            }
        }
        return assertFlagDuplicates;
    }
}