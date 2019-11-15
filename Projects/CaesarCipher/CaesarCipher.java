/* CaesarCipher.java            by Kevin Wang
 * 
 * A Caesar Cipher is a method of encoding a message by shifting each character by the same number of letters.
 * For example, with a shift of 5, �A� would encode to �F�. In your main method, display a menu to ask the user if
 * they want to encode or decode a phrase. Then ask the user for their shift value. The shift does not need to be
 * less than 26 but does need to be nonnegative. Assume that all messages will be uppercase only.
 * Your program must begin with a menu asking the user if they want to encode or decode a String.
 * It will be easier for you if you have two separate Scanner objects, one that deals with String input and the
 * other that deals with int input.
 * 
 * public static String encode(String str, int shift)
 *     This method takes a String and an int as parameters and returns a String, where each of the characters in the original has been shifted shift number of characters.
 * public static String decode(String str, int shift)
 *     This method takes a String and an int as parameters and returns a String, where each of the characters in the original has been shifted -shift number of characters.
 * 
 * This project will be graded on
 * 
 * 1. Documentation (4 points): Your code must be fully commented and employ standard Java-style conventions.
 * 2. User-Friendliness (4 points): All interactions with the user must be clear and unambiguous.
 * 3. Methods (8 points): Each method has the proper signature and works as expected.
 * 
 * TOTAL: 16 points
 */
import java.util.*;

// What if I don't want to use normal Java style conventions? Naming conventions, fine.
// BRACKET PLACEMENT IS MINE TO CONTROL!!! >:D

public class CaesarCipher {
    public static void main(String[] args) {
        // The examples that were originally given to us.
        System.out.println(encode("HELLO", 5)); // gives MJQQT
        System.out.println(decode("WORLD", 5)); // gives RJMGY
        System.out.println(encode(decode("HELLO", 5), 5)); // gives HELLO
        
        
        
        // Karen works at Walmart and scans your groceries.
        // She'll scan your inputs and encode/decode Caesar's secret messages.
        Scanner karen = new Scanner(System.in);
        // Karen will scan your inputs now.
        System.out.println("Would you like to encode, or decode (1-2)?\n1. Encode\n2. Decode");
        int choice = karen.nextInt();
        if (choice != 1 && choice != 2) 
            System.out.println("Invalid operation! Pick either 1, or 2.");
        
        // Take away that newline!
        // There's an issue with calling Scanner#nextLine right after Scanner#nextInt, but I made a qwik fiks peu peu peu!
        karen.nextLine();
        
        System.out.println("What string would you like to shift?");
        String msg = karen.nextLine();
        
        System.out.println("How many characters would you like to shift?");
        int shift = karen.nextInt();
        
        // Encode/Decode the message now.
        if (choice == 1) {
            System.out.println(encode(msg, shift));
        } else if (choice == 2) {
            System.out.println(decode(msg, shift));
        } else {
            // Something impossible happened??? There's already a check that checks that the input is valid, but you can never be too careful...
            System.out.println("Something happened, Alice. Something weird and wonderful!");
        }
        
        
        
        // Karen closes walmart for the day. Good night, karen!
        karen.close();
    }
    
    // The Encode/Decode methods are pretty much the same, but encode shifts the letters forward, while decode shifts the letters backwards.
    public static String encode(String str, int shift) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String.split("") is like String.toCharArray(), except that String.split("") results in an array of Strings,
        // while String.toCharArray() results in a array of characters. I don't like characters, because it's weird and strange.
        String[] message = str.split("");
        String result = "";
        
        // Loop through every character,
        for (int i=0; i<message.length; i++) {
            // If the current character is not a valid A-Za-z, just output it into the result.
            if (letters.indexOf(message[i].toUpperCase()) == -1) {
                // Sometimes I get confused between Java and Javascript. I just used === for strict type comparison, and didn't realize what was wrong...
                result += message[i];
            } else {
                // A=0, B=1, C=2... Z=25
                // Then we add the shift, wrap it around both ways, and change the number back to a letter.
                int currentCharacter = (letters.indexOf(message[i].toUpperCase()) + shift) % 26; // Z => A should work.
                // Just in case Shift is negative, because I'm still so mad I got a point off for "fail for negative" and "fail for 0".
                // Like, BRUH WHAT MAKE IT CLEARER YOU WANT NEGATIVE AND ZEROS AS WELL WTF
                while (currentCharacter < 0)
                    currentCharacter += 26;
                
                // This basically preserves case from the original string, so encode("AaAa", 1) would return "BbBb"
                if (message[i].equals(message[i].toUpperCase())) {
                    /*
                    * Ahaha! Big brain, is this not???
                    * I need to convert the number back into a letter, but Java's being a pain in the booty,
                    * and doesn't give me an easy way to convert a char to a String. I miss Javascript ;(
                    * Instead of converting characters to Strings, then using .toUpperCase, I realized I could do .toUpperCase before
                    * converting currentCharacter into a letter.Ahaha! I feel proud.
                    */
                    
                    result += letters.toUpperCase().charAt(currentCharacter);
                } else {
                    result += letters.toLowerCase().charAt(currentCharacter);
                }
            }
        }

        return result;
    }
    
    
        
    public static String decode(String str, int shift) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] message = str.split("");
        String result = "";

        for (int i=0; i<message.length; i++) {
            if (letters.indexOf(message[i].toUpperCase()) == -1) {
                result += message[i];
            } else {
                int currentCharacter = (letters.indexOf(message[i].toUpperCase()) - shift) % 26;
                while (currentCharacter < 0)
                    currentCharacter += 26;

                if (message[i].equals(message[i].toUpperCase())) {
                    result += letters.toUpperCase().charAt(currentCharacter);
                } else {
                    result += letters.toLowerCase().charAt(currentCharacter);
                }
            }
        }

        return result;
    }
}