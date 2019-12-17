/* LoopDiLoop.java            by Kevin Wang
 * 
 * Write three different loops: a for loop, a
 * while loop, and a do-while loop, to print the
 * following sequence of numbers:
 * 45, 36, 27, 18, 9, 0 �9, -18, -27, -36, -45.
 */

public class LoopDiLoop {
    public static void main(String[] args) {
        
        // For Loop
        System.out.println("For Loop:");
        for (int i=45; i>=-45; i-=9) {
            System.out.print(i + ", ");
        }
        
        System.out.println("\n");
            
        
        
        // While Loop
        System.out.println("While Loop:");
        int o = 45;
        while (o >=-45) {
            System.out.print(o + ", ");
            o -= 9;
        }
        
        System.out.println("\n");
        
        
        
        // Do-While Loop
        System.out.println("Do-While Loop:");
        int p = 45;
        do {
            System.out.print(p + ", ");
            p -= 9;
        } while (p >=-45);
            
        System.out.println("\n");
    }
}