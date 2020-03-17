/* ArrayMethods.java            by Kevin Wang
 * 
 * Complete the following methods with the given signatures. All user input and output must occur in your main
 * method. You are permitted to create other methods if you feel they would help you complete the task. Call your
 * java file ArrayMethods. This is to be submitted to DropBox by March 16, in a folder called ArrayMethods. You
 * are only completing one java file for this mini-project. For this program, you may use Scanner or JOptionPane.
 * 
 * In your main method, display a menu to ask the user for their desired task. The options are listed below. Once
 * the user chooses a task, ask them for their desired array size. Then, prompt them to fill the array with integer
 * values. When displaying an array, all entries must be on the same line (see below for sample output). When the
 * process is complete, ask the user if they want to do it again.
 * 
 *     public static int[] reverseArray(int[] arr)
 *         This method takes an integer array as a parameter and returns the array in reverse order.
 *     public static int smallestValue(int[] arr)
 *         This method takes an integer array as a parameter and returns the smallest value in the array.
 *     public static int largestValue(int[] arr)
 *         This method takes an integer array as a parameter and returns the largest value in the array.
 * 
 * This project will be graded on:
 *     1. Documentation (4 points): Your code must be fully commented and employ standard Java-style conventions.
 *     2. User-Friendliness (4 points): All interactions with the user must be clear and unambiguous.
 *     3. Methods (12 points): Each method has the proper signature and works as expected.
 * 
 * TOTAL: 20 points
 * 
 * 1. Reverse an array
 * 2. Smallest element of an array
 * 3. Largest element of an array
 */

import java.util.Scanner;

public class ArrayMethods {
    public static void main(String[] args) {
        // test cases, wow
        int[] testCase1 = {1, 2, 3, 4, 5};    // odd , asc
        int[] testCase2 = {1, 2, 3, 4, 5, 6}; // even, asc
        int[] testCase3 = {5, 4, 3, 2, 1};    // odd, des
        int[] testCase4 = {6, 5, 4, 3, 2, 1}; // even, des
        int[] testCase5 = {2, 5, 1, 3, 4};    // odd , mixed
        int[] testCase6 = {2, 5, 1, 6, 3, 4}; // even, mixed
        
        // CHONK TESTING!
        // you can never be too careful! I'm tempted to add legitimate random test cases!
        // I don't want to lose points over some dumb off by one error, hahahahahahahahahahahahahahahahahahahaha!!!!!
        System.out.println("\nreverseArray:");
        System.out.println(ats(testCase1) + " --> " + ats(reverseArray(testCase1)));
        System.out.println(ats(testCase2) + " --> " + ats(reverseArray(testCase2)));
        System.out.println(ats(testCase3) + " --> " + ats(reverseArray(testCase3)));
        System.out.println(ats(testCase4) + " --> " + ats(reverseArray(testCase4)));
        System.out.println(ats(testCase5) + " --> " + ats(reverseArray(testCase5)));
        System.out.println(ats(testCase6) + " --> " + ats(reverseArray(testCase6)));
        
        System.out.println("\nsmallestValue:");
        System.out.println(ats(testCase1) + " --> " + smallestValue(testCase1));
        System.out.println(ats(testCase2) + " --> " + smallestValue(testCase2));
        System.out.println(ats(testCase3) + " --> " + smallestValue(testCase3));
        System.out.println(ats(testCase4) + " --> " + smallestValue(testCase4));
        System.out.println(ats(testCase5) + " --> " + smallestValue(testCase5));
        System.out.println(ats(testCase6) + " --> " + smallestValue(testCase6));
        
        System.out.println("\nlargestValue:");
        System.out.println(ats(testCase1) + " --> " + largestValue(testCase1));
        System.out.println(ats(testCase2) + " --> " + largestValue(testCase2));
        System.out.println(ats(testCase3) + " --> " + largestValue(testCase3));
        System.out.println(ats(testCase4) + " --> " + largestValue(testCase4));
        System.out.println(ats(testCase5) + " --> " + largestValue(testCase5));
        System.out.println(ats(testCase6) + " --> " + largestValue(testCase6));
        
        // user testing
        // grimReaper doesn't always take souls, he occasionally takes input as well.
        Scanner grimReaper = new Scanner(System.in);
        do {
            // grimReaper takes all, grimReaper is of new beginnings and old endings.
            System.out.println("\n\n\nPick an operation! (1-3)\n1. Reverse an array\n2. Smallest element of an array\n3. Largest element of an array");
            int option = grimReaper.nextInt();
            
            
            
            if (option >= 1 && option <= 3) {
                System.out.print("Type in the length of the array...");
                int len = grimReaper.nextInt();
                int[] inputArray = new int[len];
              
                for (int i=0; i<len; i++) {
                    // the two hardest things in programming are off by one erros and naming things
                    //                      - some programming guy, I think
                    System.out.print("Input Array: #" + (i + 1));
                    inputArray[i] = grimReaper.nextInt();
                }

                if (option == 1) System.out.println(ats(reverseArray(inputArray)));
                else if (option == 2) System.out.println(smallestValue(inputArray));
                else if (option == 3) System.out.println(largestValue(inputArray));
            } else {
                System.out.println("Invalid operation! Please pick an operation from 1 to 3.");
            }
            
            System.out.print("Do you wish to repeat? (y)");
            
            grimReaper.nextLine(); // consumes newline, too lazy to make a new scanner when I have such a simple work around right here.
        } while (grimReaper.nextLine().equals("y"));
        
        // when inputTaker closes, it will be because it has drunk the very last atoms from space.
        // Like a hungry baby, it shall consume all, then explode in a massive ball of fire. The Big Bang. woosh. Chills.
        grimReaper.close();
    }
    
    
    
    public static int[] reverseArray(int[] arr) {
        // define a new array
        int[] res = new int[arr.length];
        
        // loop through the array
        for (int i=0; i<arr.length; i++) {
            // the first item will have arr's last item, second item will have arr's second to last item, etc...
            res[i] = arr[arr.length-1 - i];
        }
        
        // res is short for result.
        return res;
    }
    
    public static int smallestValue(int[] arr) {
        // if we did something like max=0, and the user put in [1, 2, 3, 4] the 0.
        int min = arr[0];
        
        for (int v: arr) {
            if (v < min) {
                min = v;
            }
        }
        
        // you know, I have a goldfish named Golda.
        return min;
    }
    
    public static int largestValue(int[] arr) {
        // if we did something like max=0, and the user put in [-1, -2, -3, -4] the 0.
        int max = arr[0];
        
        for (int v: arr) {
            if (v > max) {
                max = v;
            }
        }
        
        // max is a bad boy...
        return max;
    }
    
    // Array To String method (ats haha acronym)
    public static String ats(int[] arr) {
        String res = "[";
        // loop through each item
        for (int i=0; i<arr.length; i++) {
            // format it, we can't have ugly looking strings!
            res += arr[i];
            if (i < arr.length-1) {
                res += ", ";
            }
        }
        // close the bracket, oh yeah yeah.
        return res + "]";
        
    }
}