/* TenToFifty.java            Kevin Wang
 * 
 * Write a program segment to display all integers between 10 and 50 (inclusive).
 */

public class TenToFifty {
    public static void main(String[] args) {
        int tens = 1;
        int ones = 0;
        
        while(tens <= 5) {
            ones = 0;
            while (ones <= 9 && ((tens*10)+ones)<=50) {
                System.out.println("" + tens + ones++);
            }
            tens++;
        }
        
    }
}