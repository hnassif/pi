package piwords;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AlphabetGeneratorTest {
    @Test
    public void generateFrequencyAlphabetTest() {
        List<Pair<Character, Integer>> testInput = 
                new ArrayList<Pair<Character,Integer>>();
        testInput.add(new Pair<Character, Integer>('a', 4));
        testInput.add(new Pair<Character, Integer>('b', 4));
        testInput.add(new Pair<Character, Integer>('c', 2));
        
        char[] expectedOutput = {'a', 'a', 'a', 'a',
                                 'b', 'b', 'b', 'b',
                                 'c', 'c'};
        assertArrayEquals(expectedOutput,
                AlphabetGenerator.generateFrequencyAlphabet(testInput));
        
        List<Pair<Character, Integer>> testInput1 = 
                new ArrayList<Pair<Character,Integer>>();
        testInput1.add(new Pair<Character, Integer>('a', 4));
        testInput1.add(new Pair<Character, Integer>('b', 4));
        testInput1.add(new Pair<Character, Integer>('c', 2));
        testInput1.add(new Pair<Character, Integer>('a', 4));
        testInput1.add(new Pair<Character, Integer>('g', 4));
        testInput1.add(new Pair<Character, Integer>('c', 2));
        testInput1.add(new Pair<Character, Integer>('h', 4));
        testInput1.add(new Pair<Character, Integer>('z', 4));
        testInput1.add(new Pair<Character, Integer>('c', 2));
        
        char[] expectedOutput1 = {'a', 'a', 'a', 'a','a', 'a', 'a', 'a',
                                 'b', 'b', 'b', 'b',
                                 'c', 'c','c', 'c','c', 'c','g','g','g','g', 'h','h','h','h','z','z','z','z'};
        assertArrayEquals(expectedOutput1,
                AlphabetGenerator.generateFrequencyAlphabet(testInput1));
    }

    
    @Test
    public void generateFrequencyAlphabetTestEmptyInput() {
        List<Pair<Character, Integer>> testInput = 
                new ArrayList<Pair<Character,Integer>>();

        
        char[] expectedOutput = {};
        assertArrayEquals(expectedOutput,
                AlphabetGenerator.generateFrequencyAlphabet(testInput));

    }
}
