package piwords;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitsToStringConverterTest {
    @Test
    public void basicNumberSerializerTest() {
        // Input is a 4 digit number, 0123 represented in base 4
        int[] input = {0, 1, 2, 3};

        // Want to map 0 -> "d", 1 -> "c", 2 -> "b", 3 -> "a"
        char[] alphabet = {'d', 'c', 'b', 'a'};

        String expectedOutput = "dcba";
        assertEquals(expectedOutput,
                     DigitsToStringConverter.convertDigitsToString(
                             input, 4, alphabet));
        
        

        int[] input1 = {0,0,5,2,9,9,2};

        char[] alphabet1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        String expectedOutput1 = "aafcjjc";
        assertEquals(expectedOutput1,
                     DigitsToStringConverter.convertDigitsToString(
                             input1, 10, alphabet1));
    }

    // TODO: Write more tests (Problem 3.a)
    
    @Test(expected= IllegalArgumentException.class)
    public void basicNumberSerializerExceptionTest() {
        int[] input = {0,0,5,2,10,9,2};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        assertEquals(IllegalArgumentException.class,
                     DigitsToStringConverter.convertDigitsToString(
                             input, 10, alphabet));
        
        int[] input1 = {0,0,5,2,9,9,-2};
        char[] alphabet1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        assertEquals(IllegalArgumentException.class,
                     DigitsToStringConverter.convertDigitsToString(
                             input1, 10, alphabet1));
    }
}
