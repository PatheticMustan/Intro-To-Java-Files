/*
 * Lesson7.java
 * Kevin Wang
 * 
 * Prints all the types of variables.
 */

public class Lesson7 {
   /*
    * Prints all the types of variables.
    */
   public static void main (String[] args) {
       // initialize vars
      int meaningOfLife = 0;
      double smallPie = 0.0;
      char respectKey = 'A';
      boolean isWorldOver = true;
      
      System.out.println("int: " + meaningOfLife);
      System.out.println("double: " + smallPie);
      System.out.println("char: " + respectKey);
      System.out.println("bool: " + isWorldOver);
       
      // set values
      meaningOfLife = 42;
      smallPie = 3.1415;
      respectKey = 'F';
      isWorldOver = false;
      
      System.out.println("int: " + meaningOfLife);
      System.out.println("double: " + smallPie);
      System.out.println("char: " + respectKey);
      System.out.println("bool: " + isWorldOver);
   }
}