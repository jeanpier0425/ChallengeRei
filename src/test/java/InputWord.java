import java.io.IOException;
import java.util.Scanner;


public class InputWord {

    static MyTests myTests = new MyTests();

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        System.out.println("Collection of Strings local dictionary: ");
        LocalDictionary.searchWord(input.toLowerCase().trim());
        System.out.println("Collection of Strings: online dictionary");
        OnlineDictionary.searchWord(input.toLowerCase().trim());
        myTests.testCorrectWord();
        myTests.testDuplicates();
        myTests.testIncorrectWord();
        scanner.close();
    }
}