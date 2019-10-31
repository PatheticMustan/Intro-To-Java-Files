/* Stars.java            by Kevin Wang
 * 
 * Prints that super asterisk made up of asterisks.
 */

public class Stars {
   public static void main (String[] args) {
      final int size = 9;
      
      for (int i=0; i<size; i++) {
          for (int o=0; o<size; o++) {
              boolean star = false;
              
              if (i == o) star = true;
              if (i+o == size-1) star = true;
              if (i == size/2) star = true;
              if (o == size/2) star = true;
              
              if (star) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
              System.out.print(" ");
          }

         System.out.println();
      }
   }
}