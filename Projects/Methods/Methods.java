/* Methods.java            by Kevin W
 * 
 * public static int factorial(int n)
 *      This method takes a nonnegative integer as a parameter and returns the product n * (n-1) * (n-2)... * 2 * 1
 * 
 * public static int firstDigit(int n)
 *     This method takes an integer as a parameter and returns the first numeric digit.
 * 
 * public static boolean allDigitsOdd(int n)
 *     This method takes an integer and returns true if all of the individual digits in the number are odd; false otherwise
 * 
 * public static boolean allDigitsSame(int n)
 *     This method takes an integer and returns true if all of the individual digits in the number are all odd or
 *    all even; false otherwise
 * 
 * public static boolean hasMidpoint(int a, int b, int c)
 *     This method takes three integers as parameters and returns true if the average of any two of them is the
 *     third.
 * 
 * This project will be graded on:
 * 1. Documentation (4 points): Your code must be fully commented and employ standard Java-style conventions.
 * 2. User-Friendliness (4 points): All interactions with the user must be clear and unambiguous.
 * 3. Methods (10 points): Each method has the proper signature and works as expected.
 */

public class Methods {
    public static void main(String[] args) {
        System.out.println("Testing factorial!");
        System.out.println(factorial(0)); // I googled it, and apparently factorial(0) is supposed to be 1???
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(9)); // 362880
        System.out.println(factorial(6)); // 720
        System.out.println(factorial(3)); // 6
        
        System.out.println("\nTesting firstDigit!");
        System.out.println(firstDigit(412));  // 4
        System.out.println(firstDigit(1253)); // 1
        System.out.println(firstDigit(9871)); // 9
        System.out.println(firstDigit(1252)); // 1
        System.out.println(firstDigit(9172)); // 9
        
        System.out.println("\nTesting allDigitsOdd!");
        System.out.println(allDigitsOdd(173));   // true
        System.out.println(allDigitsOdd(12398)); // false
        System.out.println(allDigitsOdd(11197)); // true
        System.out.println(allDigitsOdd(2019));  // false
        System.out.println(allDigitsOdd(1979));  // true
        
        System.out.println("\nTesting allDigitsSame!");
        System.out.println(allDigitsSame(66666));     // true
        System.out.println(allDigitsSame(11191));     // false
        System.out.println(allDigitsSame(1));         // true
        System.out.println(allDigitsSame(981723));    // false
        System.out.println(allDigitsSame(333333333)); // true 
        
        System.out.println("\nTesting hasMidpoint!");
        System.out.println(hasMidpoint(6, 4, 8)); // true
        System.out.println(hasMidpoint(2, 45, 92)); // false
        System.out.println(hasMidpoint(3, 4, 5)); // true
        System.out.println(hasMidpoint(6, 0, 7)); // false
        System.out.println(hasMidpoint(17, 5, 11)); // true
    }
    
    
    
    public static int factorial(int n) {
        int result = 1;
        // Loops through 2 -> N, and multiples result with I each time. 
        for (int i=2; i<=n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    
    
    public static int firstDigit(int n) {
        int result = n;
        // This works because after the "/ 10", it's cut off to an int.
        while (result >= 10) {
            result /= 10;
        }
        return result;
        /* I looked at StackOverflow, and I don't know if that counts as
         * copying code, so I wrote something else.
         * The StackOverflow code is commented out below.
         * 
         * return Integer.parseInt((n + "").substring(0, 1));
         */
    }
    
    
    
    public static boolean allDigitsOdd(int n) {
        int result = n;
        // Loop through every digit...
        while (result >= 10) {
            // If the current digit is even..
            if ((result % 10) % 2 == 0) {
                return false;
            }
            result /= 10;
        }
        
        // If we've looped through all the digits and haven't found an even digit, all the digits are odd.
        return true;
    }
    
    
    
    public static boolean allDigitsSame(int n) {
        int result = n;
        // Every single digit should be equal to the first digit.
        int lastDigit = result % 10;
        
        while (result >= 10) {
            if (result % 10 != lastDigit) {
                return false;
            }
            result /= 10;
        }
        return true;
    }
    
    
    
    public static boolean hasMidpoint(int a, int b, int c) {
        // (a + b)/2 == c    can be re-written as    a + b == c + c
        // Doing this makes sure you don't need to worry about floats, which is pretty cool I guess.
        if (a + b == c + c) return true;
        if (b + c == a + a) return true;
        if (c + a == b + b) return true;
        
        return false;
    }
}