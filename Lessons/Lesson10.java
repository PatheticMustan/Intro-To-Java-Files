public class Lesson10 {
   public static void main (String[] args) {
      /*
       * Write a program based upon the following requirements:
       *     [X] Declare and instantiate a String of your choice
       * Print out the following information on that string:
       *     [X] Length
       *     [X] First 3 characters
       *     [X] Convert all of the String’s letters to uppercase, and store in a new String object reference variable
       *     [X] Choose two additional methods from the String class and use those on your String. Display the results.
       */
       
       String phrase = "Look, Lilly allows lending calculators!"; // Declarartion and instantiation
       System.out.println("Length: " + phrase.length()); // Length
       System.out.println("First three characters: " + phrase.substring(0,3)); // First 3 characters.
       
       String uppercasePhrase = phrase.toUpperCase(); // Uppercase
       System.out.println("Uppercase: " + uppercasePhrase);
       System.out.println("Lowercase: " + uppercasePhrase.toLowerCase().replace('l', 'w')); // Lowercase and replace
       
       // Bonus! Use 4 string methods in different, useful ways!
       // valueOf, toLowercase, substring, and toUppercase
       String phruit = "orangesba" + String.valueOf(1.0%0) + "as"; // baNaNas haha that's a fruit
       System.out.println(phruit);
       System.out.println("I like " + phruit.toLowerCase().substring(7) + " and " + phruit.substring(0,7).toUpperCase());
   }
}