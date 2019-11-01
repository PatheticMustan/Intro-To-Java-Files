/* Methods.java            by Kevin W
 * 
 * public static int factorial(int n)
 *      This method takes a nonnegative integer as a parameter and returns the product n * (n – 1) * … * 2 * 1.
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
        // Test functions.
        System.out.println("TESTING FACTORIALS!");
        System.out.println(factorial(0)); // I googled it, and apparently factorial(0) is supposed to be 1???
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(9)); // 362880
        System.out.println(factorial(6)); // 720
        System.out.println(factorial(3)); // 6
        
        System.out.println("\nTESTING FIRST DIGIT!");
        System.out.println(firstDigit(412)); // 4
        System.out.println(firstDigit(1253)); // 1
        System.out.println(firstDigit(9871)); // 9
        System.out.println(firstDigit(1252)); // 1
        System.out.println(firstDigit(9172)); // 9
        
        System.out.println("\nTESTING ALL DIGITS ODD!");
        System.out.println(allDigitsOdd(173));
        
        System.out.println("\nTESTING FACTORIALS!");
        System.out.println(allDigitsSame(66666));
        
        System.out.println("\nTESTING FACTORIALS!");
        System.out.println(hasMidpoint(6, 4, 8));
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
        // Converts n into a string, takes the first character, then converts n BACK into an int.
        return Integer.parseInt((n + "").substring(0, 1));
    }
    
    
    
    public static boolean allDigitsOdd(int n) {
        // Loop through every digit...
        for (int i=0; i<(n+"").length(); i++) {
            // If the current digit is even..
            if (Integer.parseInt((n + "").substring(i, i+1)) % 2 == 0) {
                return false;
            };
        }
        
        // If we've looped through all the digits and haven't found an even digit, all the digits are odd.
        return true;
    }
    
    
    
    public static boolean allDigitsSame(int n) {
        // Every single digit should be equal to the first digit.
        int firstDigit = Integer.parseInt((n + "").substring(0, 1));
        
        // Loop through every digit...
        for (int i=0; i<(n+"").length(); i++) {
            if (Integer.parseInt((n + "").substring(i, i+1)) != firstDigit) {
                return false;
            }
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