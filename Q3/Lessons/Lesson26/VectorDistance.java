/* VectorDistance.java            by Kevin Wang
 * 
 * Given two vectors of length N that are represented with one-
 * dimensional arrays, write a code fragment that computes the Euclidean
 * distance between them (the square root of the sums of the squares of
 * the differences between corresponding entries).
 */

import java.lang.Math;

public class VectorDistance {
  public static double difference(int[] a, int[] b) {
    double result = 0.0;
    for (int i=0; i<a.length; i++) {
      result += Math.pow(b[i] - a[i], 2);
    }
    return Math.sqrt(result);
  }
  
  public static void main(String[] args) {
    System.out.println(difference(new int[]{2, 1, 3}, new int[]{7, -1, 0}));
  }
}