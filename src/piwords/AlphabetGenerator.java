package piwords;

import java.util.List;
import java.util.Arrays;// needed for Array.sort()


public class AlphabetGenerator {
    /**
     * Given a List of (Character, Integer) pairs, where each Integer
     * represents the frequency of that Character (the number of times
     * it should appear in the result), return a char[] containing
     * each character repeated according to its requested frequency,
     * in ascending lexicographic order.
     * 
     * For example, let the list of (Character, Integer) pairs be
     * {('b', 2), ('a',1), ('c',4)}; then the output should be
     * {'a', 'b', 'b', 'c', 'c', 'c', 'c'}. 
     * 
     * Note the method should not return {'b', 'b', 'a', 'c', 'c', 'c', 'c'}
     * because the order is incorrect.
     *
     * @param frequencies A list of zero or more (Character, Integer)
     *        pairs that indicate the characters to include in the
     *        output, and how many times to repeat each one. The
     *        Integer of any given pair must be greater than or equal
     *        to 0. Multiple pairs for the same Character may be
     *        present, and act cumulatively.
     * @return A char[] in ascending lexicographic order containing
     *         the characters listed in `frequencies', each repeated
     *         according to its requested frequency.
     */    
    public static char[] generateFrequencyAlphabet(List<Pair<Character, Integer>> frequencies){
 
    	
    	if (frequencies.size()==0) {
    		char[] a= {};
    		return a;
    	}
  
    	int sizeArray= 0; // size of the array to be created
    	// looping over all elements to determine the size of the array
    	for (Pair<Character, Integer> element : frequencies)
    		{ 
    			sizeArray+= element.second;
    		}
    	
    	// creating the array
    	char[] alphabetArray= new char[sizeArray];
    	
    
    	int startWriting = 0;// lower bound index
    	for (Pair<Character, Integer> element : frequencies)// looping over all entries 
    		{ 
    			int endWriting= startWriting+element.second;// upper bound index
    		    for (int i=startWriting; i<endWriting; i++)// writing from lower bound to upper bound
    		  		{
    		    		alphabetArray[i]=element.first;
    		    		startWriting++; 
    		    	}
    		}
    	Arrays.sort(alphabetArray);// sorting the final array
    	return alphabetArray;
    	 
    	 }
    	
    			
    }

