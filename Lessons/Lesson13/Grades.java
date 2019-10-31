/* Grades.java            by Kevin W
 * 3. Write a program that accepts a numerical grade from
 * the user, and displays the following:
 * o A if (grade >= 94 and grade <= 100)
 * o B if (grade >= 85 and grade < 94)
 * o C if (grade >= 75 and grade < 85)
 * o D if (grade >= 60 grade and < 75)
 * o F if (grade < 60)
 */

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        String letter = "";
        
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        
        if (grade >= 94 && grade <= 100)
            letter = "A";
        if (grade >= 85 && grade < 94)
            letter = "B";
        if (grade >= 75 && grade < 85)
            letter = "C";
        if (grade >= 60 && grade < 75)
            letter = "D";
        if (grade < 60)
            letter = "F";
        
        System.out.println(letter);
    }
}
