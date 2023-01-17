import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWordInList {

    public static boolean searchWord(String word) {

        try {
            // Create a scanner for the file
            Scanner scanner = new Scanner(new File("src/test/java/words_alpha.txt"));

            // Search for the word
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals(word)) {
                    scanner.close();
                    return true;
                }
            }
            scanner.close();
            // Close the scanner

        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file.");
        }
        return false;
    }
}