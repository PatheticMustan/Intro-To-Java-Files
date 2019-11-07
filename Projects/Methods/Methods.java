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

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Lines 32-68 are testing the functions without user input. You can remove these lines if you want.
        // Lines 69-110 are testing the functions with user input. These are actually project requirements.
        System.out.println("Testing factorial!");
        System.out.println(factorial(0));            // I googled it, and apparently factorial(0) is supposed to be 1???
        System.out.println(factorial(5));            // 120
        System.out.println(factorial(9));            // 362880
        System.out.println(factorial(6));            // 720
        System.out.println(factorial(3));            // 6

        System.out.println("\nTesting firstDigit!");
        System.out.println(firstDigit(412));         // 4
        System.out.println(firstDigit(1253));        // 1
        System.out.println(firstDigit(9871));        // 9
        System.out.println(firstDigit(1252));        // 1
        System.out.println(firstDigit(9172));        // 9

        System.out.println("\nTesting allDigitsOdd!");
        System.out.println(allDigitsOdd(173));       // true
        System.out.println(allDigitsOdd(1781));      // false
        System.out.println(allDigitsOdd(11197));     // true
        System.out.println(allDigitsOdd(2019));      // false
        System.out.println(allDigitsOdd(1979));      // true

        System.out.println("\nTesting allDigitsSame!");
        System.out.println(allDigitsSame(248066));   // true
        System.out.println(allDigitsSame(11321));    // false
        System.out.println(allDigitsSame(1));        // true
        System.out.println(allDigitsSame(208491));   // false
        System.out.println(allDigitsSame(19357135)); // true 

        System.out.println("\nTesting hasMidpoint!");
        System.out.println(hasMidpoint(6, 4, 8));    // true
        System.out.println(hasMidpoint(2, 45, 92));  // false
        System.out.println(hasMidpoint(3, 4, 5));    // true
        System.out.println(hasMidpoint(6, 0, 7));    // false
        System.out.println(hasMidpoint(17, 5, 11));  // true



        // User can decide what to test as well.
        Scanner sc = new Scanner(System.in); // I keep forgetting to put in "System.in"
        System.out.println("\n\n\nPick a method. (1-5)\n1. Factorial\n2. firstDigit\n3. allDigitsOdd\n4. allDigitsSame\n5. hasMidpoint");
        int input = sc.nextInt();
        int a, b, c; // Initializes variables so we can use them below without writing "int" 5 times
        if (input == 1) {
            // Asks for input, and uses it as argument for Factorial.
            System.out.println("Factorial: Input an integer.");
            a = sc.nextInt();
            
            System.out.println(factorial(a));
        } else if (input == 2) {
            // Asks for input, and uses it as argument for FirstDigit.
            System.out.println("FirstDigit: Input an integer.");
            a = sc.nextInt();
            
            System.out.println(firstDigit(a));
        } else if (input == 3) {
            // Asks for input, and uses it as argument for AllDigitsOdd.
            System.out.println("AllDigitsOdd: Input an integer.");
            a = sc.nextInt();
            
            System.out.println(allDigitsOdd(a));
        } else if (input == 4) {
            // Asks for input, and uses it as argument for AllDigitsSame.
            System.out.println("AllDigitsSame: Input an integer.");
            a = sc.nextInt();
            
            System.out.println(allDigitsSame(a));
        } else if (input == 5) {
            // Asks for input, and uses it as arguments HasMidpoint.
            System.out.println("HasMidpoint: Input an integer.");
            a = sc.nextInt();
            System.out.println("HasMidpoint: Input a second integer.");
            b = sc.nextInt();
            System.out.println("HasMidpoint: Input a third integer.");
            c = sc.nextInt();
            
            System.out.println(hasMidpoint(a, b, c));
        } else {
            System.out.println("Oops! Please input a number from 1-5.");
        }
    }



    public static int factorial(int n) {
        int result = 1;
        // Loops through 2 -> N, and multiples result with I each time. 
        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }



    public static int firstDigit(int n) {
        int result = n;
        // This works because after the "/ 10" changes numbers
        while (result >= 10)
            result /= 10;

        return result;
        // I looked at StackOverflow, and I don't know if that counts as
        // copying code, so I wrote my own code, out of fear of the plagarism hammer.
    }



    public static boolean allDigitsOdd(int n) {
        int result = n;
        // Loop through every digit...
        while (result > 0) {
            // If the current digit is even..
            if ((result % 10) % 2 == 0)
                return false;
            result /= 10;
        }

        // If we've looped through all the digits and haven't found an even digit, all the digits are odd.
        return true;
    }



    public static boolean allDigitsSame(int n) {
        int number = n;
        // Every single digit should be even, or odd depending on the last number.
        int lastDigitOdd = (number % 10) % 2;

        while (number >= 10) {
            if (((number % 10) % 2) != lastDigitOdd)
                return false;
            number /= 10;
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

/* Sometimes, I use "let" to declare my variables, and get confused when it doesn't work.
 * ____________________________________
 *         *_****   
 *       **  \ __ **   ________
 *      **  O  O  **  |Hmm...|
 *      *     >    *  /------
 *      *   ____   * /
 *      **     // ** 
 *        *\\_//**   
 *
 */
