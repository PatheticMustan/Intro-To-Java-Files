/* IncrementVariables.java            by Kevin W
 * 
 * 1. Use the following values to determine the difference
 * between i++ and ++i for an integer i.
 * 
 * int x = 7;
 * int x1 = 7;
 * int y = x++;
 * int y1 = ++x1;
 */

public class IncrementVariables {
    public static void main(String[] args) {
        int a = 7, b = 7;
        int x = a++;
        int y = ++b;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        // while a++ and ++b both add one to their variables, they add them in different orders.
        // a++ adds after the assignment,
        // ++b adds beforet the assignment.
    }
}