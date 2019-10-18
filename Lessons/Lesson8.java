/*
 * Create three doubles, x, y, and z. Choose two
 * values for x and y, and let z be their difference.
 * 
 * Create three ints, a, b, and c. Choose two values
 * for a and b, and let c be their product. Then let c
 * be their quotient and remainder.
 * 
 * Mix and match doubles and ints for calculations.
 * 
 * Display all results to the screen.
 */

public class Lesson8
{
   public static void main (String[] args)
   {
       // X, Y, and Z.
       double x = 6.2;
       double y = 4.54;
       double z = x - y;
       System.out.println(x +" - " + y + " = " + z);
       
       // C is the product of A and B.
      int a = 666;
      int b = 365;
      int c = a * b;
      System.out.println(a +" * " + b + " = " + c);
      
      // C is around the quotient of A and B.
      c = a / b;
      System.out.println(a +" / " + b + " = " + c);
      
      // C is the remainder of A and B.
      c = a % b;
      System.out.println(a +" % " + b + " = " + c);
      
      // Messing around with values.
      System.out.println(a * x);
      System.out.println();
   }
}
