/* Kevin Wang
 * Have the user enter an integer. Display
 *     a) its square root
 *     b) its absolute value
 *     c) a random value between 0 and that integer
 * 
 * Have the user enter a string. Display
 *     a) its length
 *     b) the last 6 characters
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Lesson11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ron = new Random();
        
        // Number
        System.out.println("What number? ");
        int number = sc.nextInt();
        
        System.out.println("Square Root: " + Math.sqrt(number));
        System.out.println("Absolute: " + Math.abs(number));
        System.out.println("Random number 0-" + number + ": " + ron.nextInt(number));
        
        // String
        System.out.print("What string?");
        /* Fix for https://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input
         * It seems that sc.nextInt() followed by sc.nextLine() does some funky stuff, so nextLine is skipped.
         * As a solution, I stuck an extra useless nextLine. B-)
         */
        sc.nextLine();
        String phrase = sc.nextLine();
        
        System.out.println("Length: " + phrase.length());
        System.out.println("Last 6 characters: " + phrase.substring(Math.max(phrase.length()-6, 0)));
    }
}