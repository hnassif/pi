package piwords;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseTranslatorTest {
    @Test
    public void basicBaseTranslatorTest() {
        // Expect that .01 in base-2 is .25 in base-10
        // (0 * 1/2^1 + 1 * 1/2^2 = .25)
        int[] input1 = {0, 1};
        int[] expectedOutput1 = {2, 5};
        assertArrayEquals(expectedOutput1,
                          BaseTranslator.convertBase(input1, 2, 10, 2));
        //0.111111110000
        int[] input2 = {9,9,6,2};
        int[] expectedOutput2 = {1,1,1,1,1,1,1,1,0,0,0,0};
        assertArrayEquals(expectedOutput2,BaseTranslator.convertBase(input2, 10, 2, 12));
        //0.65302
        int[] input3 = {6,5,3,0,2,3,8,4,9,8,4,3,1,9};
        int[] expectedOutput3 = {10,7,2,12,9,2,2,14,9,5,10,2,13,3};
        assertArrayEquals(expectedOutput3,BaseTranslator.convertBase(input3, 10, 16, 14));
    }
    
    @Test
    public void basicBaseTranslatorTestBigValues() {
        // Expect that .01 in base-2 is .25 in base-10
        // (0 * 1/2^1 + 1 * 1/2^2 = .25)
        int[] input1 = {8,4,2,0,4,8,0,4,9,3,2};
        int[] expectedOutput1 = {10,12,15,3,6,24,23,14};
        assertArrayEquals(expectedOutput1,
                          BaseTranslator.convertBase(input1, 10, 26, 8));
    }
    

    // TODO: Write more tests (Problem 2.a)
    @Test(expected= IllegalArgumentException.class)
    public void exceptionTest(){
    	int[] input1= {1,3,6};
    	assertEquals(IllegalArgumentException.class,BaseTranslator.convertBase(input1, 2, 16, 5)); 
    	
    	int[] input2= {1,-3,6};
    	assertEquals(IllegalArgumentException.class,BaseTranslator.convertBase(input2, 10, 16, 5));
    	
    	
    }
}
