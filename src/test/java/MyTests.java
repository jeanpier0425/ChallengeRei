import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyTests {

    @Test
    public void testDuplicates(){
        assertFalse(Validations.checkDuplicates());
    }

    @Test
    public void testCorrectWord() throws IOException {
       assertTrue(Validations.isCorrect());
    }

    @Test
    public void testIncorrectWord() throws IOException {
        boolean assertFlagIncorrectWord = OnlineDictionary.searchWord("s4l3s-9*");
        assertFalse(assertFlagIncorrectWord);
    }
}