package piwords;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordFinderTest {
    @Test
    public void basicFindWordsTest() {
        String haystack = "abcde";
        String[] needles = {"ab", "abc", "de", "fg"};

        Map<String, Integer> expectedOutput = new HashMap<String, Integer>();
        expectedOutput.put("ab", 0);
        expectedOutput.put("abc", 0);
        expectedOutput.put("de", 3);

        assertEquals(expectedOutput, WordFinder.findWords(haystack, needles));
        
        String haystack1 = "hhhnnn";
        String[] needles1 = {"hh", "hhh", "nn", "fg", "hn", "nnnn"};

        Map<String, Integer> expectedOutput1 = new HashMap<String, Integer>();
        expectedOutput1.put("hh", 0);
        expectedOutput1.put("hhh", 0);
        expectedOutput1.put("nn", 3);
        expectedOutput1.put("hn", 2);

        assertEquals(expectedOutput1, WordFinder.findWords(haystack1, needles1));
        
    }

    
}
