package piwords;

import static org.junit.Assert.*;

import org.junit.Test;

public class PiGeneratorTest {
    @Test
    public void basicPowerModTest() {
        // 5^7 mod 23 = 17
        assertEquals(17, PiGenerator.powerMod(5, 7, 23));
        assertEquals(17, PiGenerator.powerMod(5678, 789, 51));
        assertEquals(2944, PiGenerator.powerMod(107374, 163485, 12345));
        assertEquals(6682, PiGenerator.powerMod(107374, 16368, 12342));
        assertEquals(20441, PiGenerator.powerMod(164074, 1907990002, 20755));
        assertEquals(17854, PiGenerator.powerMod(1640747468, 1907990002, 20755));

       
        
    }

    @Test
    public void zeroInputTest() {
        // 5^7 mod 23 = 17
        assertEquals(0, PiGenerator.powerMod(0, 7, 23));
        assertEquals(1, PiGenerator.powerMod(5, 0, 23));
        assertEquals(1, PiGenerator.powerMod(1, 0, 23));
        assertEquals(0, PiGenerator.powerMod(0, 1, 23));
        assertEquals(0, PiGenerator.powerMod(0, 1, 1));
        assertEquals(0, PiGenerator.powerMod(12, 0, 1));
    }
    
    @Test
    public void computePiInHexTest() {
        // 5^7 mod 23 = 17
    	int[] input1 = {2,4,3};
        assertArrayEquals(input1, PiGenerator.computePiInHex(3));
        int [] input3 = {2,4,3,15,6,10,8,8};
        assertArrayEquals(input3, PiGenerator.computePiInHex(8));
        int[] input2= {2,4,3,15,6,10,8,8,8,5,10,3,0,8};
        assertArrayEquals(input2, PiGenerator.computePiInHex(14));

     
        
    }
    
    
    
    


}
