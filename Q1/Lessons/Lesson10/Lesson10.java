public class Lesson10 {
	public static void main(String[] args) {
		String phrase = "Look, Lilly allows lending calculators!";
		System.out.println("Length: " + phrase.length());
		System.out.println("First three characters: " + phrase.substring(0, 3));

		String uppercasePhrase = phrase.toUpperCase();
		System.out.println("Uppercase: " + uppercasePhrase);
		System.out.println("Lowercase: " + uppercasePhrase.toLowerCase().replace('l', 'w'));
		
		// Bonus! Use 4 string methods in different, useful ways!
		// valueOf, toLowercase, substring, and toUppercase
		String fruit = "orangesba" + String.valueOf(1.0 % 0) + "as"; // baNaNas haha that's a fruit
		System.out.println(fruit);
		System.out.println("I like " + fruit.toLowerCase().substring(7) + " and " + fruit.substring(0, 7).toUpperCase());
	}
}