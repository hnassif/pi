package piwords;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {
    
    @Test
    public void testEquals(){
        Pair<Integer, String> pair1 = new Pair<Integer, String>(5, "hello");
        Pair<Integer, String> pair2 = new Pair<Integer, String>(5, "hello");
        Pair<Integer, String> pair3 = new Pair<Integer, String>(4, "hello");
        Pair<String, String> pair4 = new Pair<String, String>("hello", "world");
        
        assertTrue(pair1.equals(pair1));
        assertTrue(pair1.equals(pair2));
        assertTrue(pair2.equals(pair1));
        
        assertFalse(pair1.equals(pair3));
        assertFalse(pair3.equals(pair1));
        assertFalse(pair3.equals(pair2));
        
        assertFalse(pair4.equals(pair1));
        
        Pair<Double, Character> pair11 = new Pair <Double, Character>(5.0, 'a');
        Pair<Double, Character> pair12 = new Pair <Double, Character>(-5.0, 'h');
        Pair<Double, Character> pair13 = new Pair <Double, Character>(15.0, 'k');
        Pair<Double, Character> pair14 = new Pair <Double, Character>(5.0, 'a');
        Pair<String, String> pair41 = new Pair<String, String>("hello", "world");
        
        assertTrue(pair11.equals(pair14));
        assertTrue(pair11.equals(pair11));
       
        
        assertFalse(pair41.equals(pair13));
        assertFalse(pair41.equals(pair11));
        assertFalse(pair41.equals(pair12));
        
        assertTrue(pair41.equals(pair41));
    }
    
    @Test 
    public void testHashCode(){
        Pair<Integer, String> pair1 = new Pair<Integer, String>(40, "foo");
        Pair<Integer, String> pair2 = new Pair<Integer, String>(40, "foo");
        assertTrue(pair1.hashCode() == pair2.hashCode());
    }
    
    @Test
    public void testCompareTo(){
        Pair<Character, Integer> pair1 = new Pair<Character,Integer>('a', 2);
        Pair<Character, Integer> pair2 = new Pair<Character,Integer>('a', 3);
        assertTrue(pair1.compareTo(pair2) < 0);
        
        Pair<Character, Integer> pair3 = new Pair<Character,Integer>('g', 2);
        Pair<Character, Integer> pair4 = new Pair<Character,Integer>('a', 3);
        assertTrue(pair3.compareTo(pair4) > 0);
        
        Pair<Character, Integer> pair5 = new Pair<Character,Integer>('a', 2);
        Pair<Character, Integer> pair6 = new Pair<Character,Integer>('a', 2);
        assertTrue(pair5.compareTo(pair6) == 0);
        
    }

    
  
 

}
