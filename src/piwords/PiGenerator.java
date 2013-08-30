package piwords;

public class PiGenerator {
    /**
     * Returns `precision' hexadecimal digits of the fractional part of pi.
     * Returns digits in most significant to least significant order.
     * 
     * @param precision The number of digits after the decimal place to
     *                  retrieve. Requires precision >= 0.
     * @return An array listing `precision' digits of pi (after the
     *         decimal point) in hexadecimal.
     */
    public static int[] computePiInHex(int precision) {
      
    	int[] digits = new int[precision]; // creating the new array
    	for (int i=1; i<=precision; i++ ) 
    	{
    		digits[i-1]=piDigit(i);
         }
    	return digits;
    	
    }

    /**
     * Computes a^b mod m.
     * 
     * For example, if a = 2, b = 3, and m = 5, this function computes
     * 2^3 mod 5, which is 3.
     *
     * The result of computing 0^0 is unspecified.
     * 
     * @param a base; requires that a >= 0.
     * @param b exponent; requires that b >= 0.
     * @param m divisor for modulo operation; requires m > 0.
     * @return a^b mod m
     */

    
    public static int powerMod(int a, int b, int m) {
        
        
    	if (b==0 && m==1) // particular case where any number is raised to the power 0 and m is 1
    		{ 
    			return 0;
    		} 
    	else if (b==0) // general case where any number is raised to the power 0 and mod is not 1 
    		{
    			return 1
    				;}
    	else 			// general case
    		{ 
    			a=a%m;
    		}
    	// cases involving a 
    	if (a==0) 		
    		{
    			return 0;
    		}// case where the number is 0
    	
       long  s = ((a%m)*(a%m))%m;// storing the product in a loop to decrease overflowing chances
       int number=(int)(s%m);// casting the number back to an int

       


       
       // exponentiation by squaring
    	if (b==1) {
    			return a%m;
    	  }
    	else if (b%2 == 0) {
    		return powerMod(number,b/2, m);}
    	else { 
    		return ((a%m)*powerMod(number,(b-1)/2, m)%m);}
    	
    	

    }
    
    /**
     * Computes the nth digit of Pi in base-16.
     * 
     * @param n The digit of Pi to retrieve in base-16; the first digit
     *          after the decimal point is n=1.
     * @return The nth digit of Pi in base-16.
     * @throws IllegalArgumentException when n is less than 0.
     */
    public static int piDigit(int n) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("n less than 0 passed into piDigit");
        
        n -= 1;
        double x = 4 * piTerm(1, n) - 2 * piTerm(4, n) -
                   piTerm(5, n) - piTerm(6, n);
        x = x - Math.floor(x);
        
        return (int)(x * 16);
    }
    
    private static double piTerm(int j, int n) {
        // Calculate the left sum
        double s = 0;
        for (int k = 0; k <= n; ++k) {
            int r = 8 * k + j;
            s += powerMod(16, n-k, r) / (double) r;
            s = s - Math.floor(s);
        }
        
        // Calculate the right sum
        double t = 0;
        int k = n+1;
        // Keep iterating until t converges (stops changing)
        while (true) {
            int r = 8 * k + j;
            double newt = t + Math.pow(16, n-k) / r;
            if (t == newt) {
                break;
            } else {
                t = newt;
            }
            ++k;
        }
        
        return s+t;
    }
}
