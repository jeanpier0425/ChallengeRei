import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;

import java.io.IOException;
import java.util.List;

public class OnlineSearch {

    public static boolean checkWord(String word) throws IOException {

        JLanguageTool langTool = new JLanguageTool(new AmericanEnglish());
        boolean isCorrect = true;

        List<RuleMatch> matches = langTool.check(word);

        for (RuleMatch match : matches) {
            isCorrect = match.isAutoCorrect();
        }
        return isCorrect;
    }
}