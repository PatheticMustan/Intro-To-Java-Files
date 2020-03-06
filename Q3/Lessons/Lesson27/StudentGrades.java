/* StudentGrades.java            by Kevin Wang
 * 
 * Write a program that allows a user to enter any desired amount of
 * student grades, stores the grades in an array, then prints the
 * results to the screen.
 * Then, find the average of the grades.
 */

import java.util.*;
import java.util.Arrays;

public class StudentGrades {
    public static void main (String[] args) {
        Scanner william = new Scanner(System.in);
        
        System.out.println("How many grades do you want to enter?");
        int len = william.nextInt();
        int[] grades = new int[len];
        
        for (int i=0; i<len; i++) {
            System.out.println("Grade #" + (i+1) + ": ");
            grades[i] = william.nextInt();
        }
        
        System.out.println(Arrays.toString(grades));
        
        // now we average it all
        double sum = 0.0;
        for (int grade: grades) {
            sum += grade;
        }
        
        System.out.println(sum / grades.length);
        
        william.close();
    }
}