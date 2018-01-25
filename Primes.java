/**
 * Two examples of methods for determining whether an int is prime. 
 * You will be asked questions about this code on the loops test.
 * 
 * @author Jon Cooper
 * @version November 18, 2013
 */
import java.util.Arrays;

public class Primes 
{
    /**
     * Determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime1(int n)
    {
        if (n < 2) return false;
        
        for (int i=2; i<n; i++)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if (n == 2)        return true;
        else if (n % 2==0 || n < 2) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
        
        // Write blocks of code that use isPrime2 to solve the following problems:
        
        // 5. Generate a list of the first 50 prime numbers.
        static public void first50() {
            int[] results = new int[50];
            int count = 0;
            int i = 0;
            while (i < 50) {
                count++;
                if (isPrime2(count)) {
                    results[i] = count;
                    i++;
                }
            }
        
            System.out.println(Arrays.toString(results));
        }
        
        // 6. What is the 100th prime? the 1000th? The 12847th?
        static public int nthPrime(int n) {
            int i = 0;
            int count = 0;
            
            while (i < n) {
                count++;
                if (isPrime2(count)) {
                    i++;
                }
            }
            
            return count;
        }
        
        // 7. In the set of integers from 2-1000000, how many are prime?
            static public int countPrime(int start, int end) {
            int count = 0;
            
            for (int i = start; i < end; i++) {
                if (isPrime2(i)) count++;
            }
            
            return count;
        }
        
        // 8. What is the sum of the all prime numbers below 1000000?
        static public long sumPrime(int end) {
            long count = 0L;
            
            for (int i = 2; i < end; i++) {
                if (isPrime2(i)) count+=i;
            }
            
            return count;
        }
        
        // 9. What is the sum of the first 1000 prime numbers?
        static public long sumFirstPrime(int end) {
            int i = 0;
            int count = 0;
            int sum = 0;
            
            while (i < end) {
                count++;
                if (isPrime2(count)) {
                    i++;
                    sum += count;
                }
            }
            
            return sum;
        }        
        
    public static void main(String[] args)
    {
        // test isPrime1
        System.out.println( isPrime1(2) );
        System.out.println( isPrime1(9) );
        System.out.println( isPrime1(17) );
        
        // test isPrime2
        System.out.println( isPrime2(2) );
        System.out.println( isPrime2(9) );
        System.out.println( isPrime2(17) );
        
        //test Below programs
        first50();
        System.out.println(nthPrime(1000));
        System.out.println(countPrime(2, 1000000));
        System.out.println(sumPrime(1000000));
        System.out.println(sumFirstPrime(1000));
        
        // Study the isPrime1 and isPrime2 methods to answer the following:
        
        // 0. Study the method isPrime1. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.

        /**
         * 19: 2 - 18
         * 91: 2 - 90
         * 643: 2 - 642
         */
        
        // 1. Study the method isPrime2. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.

         /**
         * 19: 3 - square root (19) by 2
         * 91: 3 - square root (91) by 2
         * 643: 3 - square root (643) by 2
         */     
        
        // 2. The number 15,485,863 is the 1 millionth prime number. Suppose it is 
        //    tested in both isPrime1 and isPrime2 for primality. About how much
        //    faster will isPrime2 finish testing. Show how you determined your answer.
        
        /**
         * isPrime1: 2 - 15,485,863 = 15485862 Operations
         * isPrime2: (3 - square root(15,485,863)) / 2 = 1968 Operations
         * 
         * isPrime1 / isPrime2 = 7869 times faster
         */
        
        // 3. In isPrime2, why is the limit calculated before the loop rather than
        //    writing the loop as for (int i=3; i<=Math.sqrt(n); i=i+2)?
        
        /**
         * It makes the code more efficient by not recalculating the square root of n after each cycle
         * during the comparison.
         */
        
        // 4. The number 1 is not prime, however both prime function say that it is.
        //    Negative numbers cannot be prime either. Fix each function so that all
        //    ints less than 2 return false.

    }
        

}
