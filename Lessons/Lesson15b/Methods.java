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
        System.out.println(isPrime(15));
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
        List<Integer> primes = new ArrayList<Integer>();
        // Add the first value.
        primes.add(2);
        
        
        if (a < 2) {
            // Returns false for numbers 1 and below.
            return false;
        } else if (a % 2 == 0 && a != 2) {
            // Even numbers can't be prime, except for 2.
            return false;
        } else {
            for (int i=3; i/2<a/2; i+=2) {
                boolean isPrime = true;
                for (int o=0; o<primes.size() && isPrime == true; o++) {
                    if (((float)(i) / o) % 1 == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                    primes.add(i);
                    System.out.println(primes);
                }
            }
            return true;
        }
    }
}