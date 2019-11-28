/* Methods.java            by Kevin Wang
 * 
 * 1. public static int sumOfValues(int i, int j)
 *     This method accepts two integers (i ? j) and returns the sum
 *     of all integers between them, inclusive.
 * 
 * 2. public static boolean isPrime(int n)
 *     This method accepts a positive integer and returns true if
 *     the integer is prime; false otherwise
 */

import java.util.*; 

public class Methods {
    public static void main(String[] args) {
        System.out.println("Testing sumOfValues!");
        System.out.println(sumOfValues(0, 3)); // 6
        System.out.println(sumOfValues(42, 100)); // 4189
        System.out.println(sumOfValues(57, 92)); // 2682
        System.out.println(sumOfValues(666, 0)); // Isn't valid, should return 0.
        
        System.out.println("\n" + "Testing isPrime!");
        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(7)); // true
        System.out.println(isPrime(28)); // false
        System.out.println(isPrime(-4)); // false
        System.out.println(isPrime(7163)); // ???
        System.out.println(isPrime(17)); // true
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(23)); // true
    }
    
    // sumOfValues Declaration.
    public static int sumOfValues(int a, int b) {
        if (a > b) {
            return 0; // Those tricky tricksters tried to trick us! Tricky!
        } else {
            int sum = 0;
            for (int i=a; i<=b; i++) {
                sum += i;
            }
            return sum;
        }
    }
    
    public static boolean isPrime(int a) {
        float f = (float)(a);
        if (f < 2) {
            // Returns false for numbers 1 and below.
            return false;
        } else if (f % 2 == 0 && f != 2) {
            // Even numbers can't be prime, except for 2.
            return false;
        } else {
            for (int i=3; i<f; i+=2) {
                /* There are a few ways to check if N is a whole number.
                 * 1. Math.round(N) == N
                 *     The fastest method. If N is a whole number, the value shouldn't change.
                 *     If N is not a whole number, Math.round should change it's value.
                 * 
                 * 2. Math.ceil(N) == N
                 * or Math.floor(N) == N
                 *     Pretty fast, with the same reasoning as above.
                 * 
                 * 3. N % 1 == 0
                 *     Not that fast, but dead simple.
                 */
                
                
                if (Math.round(f/i) == (f/i)) {
                    // If F is divisible by any odd number between 1 and F, F is composite.
                    return false;
                }
            }
            return true;
        }
    }
}