package piwords;

public class BaseTranslator {
    /**
     * Converts a fractional digit array (0.abcd...) from one base to another.
     * 
     * The input array, digits, represents a fractional number between
     * 0 and 1 in baseA, where the ith digit in the array represents the
     * ith digit after the decimal point and carries a numeric value of
     * (1 / baseA)^(i + 1) * digits[i].
     * 
     * The returned array, output, represents a fractional number
     * between 0 and 1 in baseB, truncated to precisionB digits long,
     * where the ith digit in the array represents the ith digit after
     * the decimal point and carries a numeric value of
     * (1 / baseB)^(i + 1) * output[i].
     *
     * For example, if baseA is 10 (decimal) and digits is {2,5}
     * (corresponding to the decimal number 0.25), and baseB is 2
     * (binary) and precisionB is 3 (3 binary digits after the decimal
     * point), then convertBase() returns {0,1,0} (corresponding to the
     * binary number 0.010, i.e. 1/4).
     * 
     * @param digits The input array to translate. This array is not mutated.
     * @param baseA The base that the input array is expressed in. Must be 2 or greater.
     * @param baseB The base that the input array is translated into. Must be 2 or greater.
     * @param precisionB The number of digits of precision the output should
     *                   have. Must be nonnegative.
     * @return An array of size precisionB expressing digits in baseB.
     * @throws IllegalArgumentException if any value in digits is not a baseA digit, i.e.
     *            digits[i] < 0 or digits[i] >= baseA.
     */
    public static int[] convertBase(int[] digits, int baseA,
                                    int baseB, int precisionB) throws IllegalArgumentException{


    	// creating a copy of the digit array to not mutate it
    	int[] digitsCopy= new int[digits.length];
    	for (int i=0; i<digits.length; i++) {
    		if (digits[i]<0 || digits[i]>=baseA)
    			{ throw new IllegalArgumentException("Invalid digit value");}// checking for invalid values
    		else 
    		    {digitsCopy[i]=digits[i];}
    	}
    	
    	
    	int[] converted = new int[precisionB];// creating the array to be returned
 
    	for (int j=0; j<precisionB; j++) {
    	int carry = 0;
    	for (int i=digitsCopy.length-1; i>=0;i--) {
    	  long x = (baseB * digitsCopy[i]) + carry;
    	  digitsCopy[i] = (int)(x % baseA);
    	  carry = (int)(x/baseA);
    	}
    	converted[j]=carry;
    	}
    	return converted;
    	
    	
    	
    }
}
