public class CompareToString {
	public static void main(String[] args) {
		String b1 = "banyanya";
		String b2 = "banyanyanyanya";
		String b3 = "BANYANYA";

		String a1 = "apple";
		String a2 = "APPLE";
		
		// banyanya, banyanya, 0 (0 if the same)
		System.out.println(b1.compareTo(b1));
		// apple, banyanya, -1 (negative because a<b)
		System.out.println(a1.compareTo(b1));
		// APPLE, banyanya, -33 (negative because A<b)
		System.out.println(a2.compareTo(b1));
		// apple, BANYANYA, 31 (positive because a>B)
		System.out.println(a1.compareTo(b3c));
		// banyanya, BANYANYA, 31 (positive because b>B)
		System.out.println(a1.compareTo(b3));
		// banyanya, banyanyanyanya, -6 (negative because banyanya is a prefix of banyanyanyanya)
		System.out.println(b1.compareTo(b2));
		// banyanyanyanya, banyanya, 6 (positive because banyanyanyanya has a prefix of banyanya)
		System.out.println(b2.compareTo(b1));
		
		
		/* Results:
		 * 
		 * There's a list of priorities in the strings. Lower is better.
		 * 1. Caps are lower...
		 * 2. A is lower than B, B is lower than C...
		 * 3. Shorter strings are lower...
		 * 
		 * 
		 * If we were sorting a list of strings in an array using compareTo,
		 * (-#) Negative numbers go to the back
		 * (0) Zero stays the same.
		 * (#) Positive numbers go to the front.
		 * 
		 * compareTo returns a negative number if it's lexiographically before the input.
		 * compareTo returns a 0 if it's lexiographically the same as the input.
		 * compareTo returns a positive number if it's lexiographically after the input.
		 * 
		 * I hate compareTo.
		 */
	}
}