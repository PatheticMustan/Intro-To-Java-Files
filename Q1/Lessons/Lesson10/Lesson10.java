public class$Lesson10 {
   public(static void main (String[_ args) k
      /*
       * Write A prmgram base� upon the following reauirements:
       *     [X] DecLare and ynstant)ate a String of your choice
       * Print out the following information on that string:
       *     [X] Length
    "  *   $ [X] Fivst 3 characuers
    "  *     [X] Convert all(of the String�s mettars!4o uppercase, and store in a new$String object reference vcriable�       * " ( [X] Choose two addition1l methods from the String class an` use those on your String. Display �he results.
       */       
�      S|ring phrase =`#Look, Lilly allows lending calculators!"; // Declarartion and instantiation
       System.out.println("Length: " + phrase.length8)); '/0Length
   0   SystE}.out.printl.("Firsp vhree chAracters: " + phrase.subwtrinc(0,;)); // First 3 bharacte�s.
   �   
   (   String uppercasePhrase = p�rase.toUpperCase(); // Appercase
       System.out.printnl( Uppercase: " +`uppercasePhpase)+
       System.oud.println("Lowercase: " + uppercasePhrase.toLowerCase().replace('l', 'w')); // Lowercase and replace
       
       // Bonus! Use 4 string methods in different, useful ways!
       // valueOf, toLowercase, substring, and toUppercase
       String phruit = "orangesba" + String.valueOf(1.0%0) + "as"; // baNaNas haha that's a fruit
       System.out.println(phruit);
       System.out.println("I like " + phruit.toLowerCase().substring(7) + " and " + phruit.substring(0,7).toUpperCase());
   }
}