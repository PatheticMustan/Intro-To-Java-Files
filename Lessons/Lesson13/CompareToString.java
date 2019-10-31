/* CompareToString.java            by Kevin W
 * 
 * Print the results of all variables to determine the
 * difference. Comment your conclusion in your code.
 * 
 * 2. Generalize the return value of compareTo for Strings.
 * Print the results of multiple comparisons to
 * determine when the result is positive, negative, or 0.
 * Comment your conclusion in your code.
 */

public class CompareToString {
    public static void main(String[] args) {
        String a = "banyanya";
        String b = "banyanyanyanya";
        String c = "BANYANYA";
        String d = "BANYANYANYANYA";
        String e = "apple";
        String f = "APPLE";
        
        // banyanya, banyanya, 0 (0 if the same)
        System.out.println(a.compareTo(a));
        // apple, banyanya, -1 (negative because a<b)
        System.out.println(e.compareTo(a));
        // APPLE, banyanya, -33 (negative because A<b)
        System.out.println(f.compareTo(a));
        // apple, BANYANYA, 31 (positive because a>B)
        System.out.println(e.compareTo(c));
        // banyanya, BANYANYA, 31 (positive because b>B)
        System.out.println(e.compareTo(c));
        // banyanya, banyanyanyanya, -6 (negative because banyanya is a prefix of banyanyanyanya)
        System.out.println(a.compareTo(b));
        // banyanyanyanya, banyanya, 6 (positive because banyanyanyanya has a prefix of banyanya)
        System.out.println(b.compareTo(a));
        
        
        /* Results:
         * 
         * There's a list of priorities in the strings. Lower is better.
         * 1. Caps are lower...
         * 2. A is lower than B, B is lower than C...
         * 3. Shorter strings are lower...
         * 
         * 
         * If we were sorting a list of strings in an array using compareTo,
         * (-#) Negative numbers go to the back
         * (0) Zero stays the same.
         * (#) Positive numbers go to the front.
         * 
         * compareTo returns a negative number if it's lexiographically before the input.
         * compareTo returns a 0 if it's lexiographically the same as the input.
         * compareTo returns a positive number if it's lexiographically after the input.
         * 
         * I hate compareTo.
         */
    }
}