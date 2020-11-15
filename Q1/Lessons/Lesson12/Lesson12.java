import java.util.Scanner;

public class Lesson12 {
	public static void main (String[] args) {
		int a, b, c;  // ax^2 + bx + c
		double discriminant, root1, root2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter the coefficient of x squared: ");
		a = sc.nextInt();
		
		System.out.print ("Enter the coefficient of x: ");
		b = sc.nextInt();
		
		System.out.print ("Enter the constant: ");
		c = sc.nextInt();
		
		// Use the quadratic formula to compute the roots.
		// Assumes a positive discriminant.
		
		discriminant = Math.pow(b, 2) - (4 * a * c);
		System.out.println("Discriminator: " + discriminant);
		
		if (discriminant > 0) {
			root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
			root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
			System.out.println ("Root #1: " + root1);
			System.out.println ("Root #2: " + root2);
		} else {
			if (discriminant == 0) {
				root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
				System.out.println ("Root #1: " + root1);
			} else {
				System.out.println("No Real Roots!");
			}
		}
		
		sc.close();
	}
}