/* UserInfo.java            by Kevin Wang
 * 
 * Create a class called UserInfo that will enable a user to register an account within a database. The registration must include the
 * following information:
 *     * Name
 *     * Address
 * Once registration is complete, you will then prompt the user for a username and password. Following this, you will then encrypt the
 * user's password. You will store the registration information in a class named UserInfo, with appropriate instance variables,
 * accessor/mutator methods, and a toString() method. You will also incorporate methods to handle the encryption of the password,
 * as indicated below:
 *     * You must provide an encrypt(String) method, which correctly encrypts its String parameter and returns the
 *       corresponding encrypted String. The method must have the following signature:
 *             public String encrypt(String s)
 *     * Your driver class MUST invoke the encrypt method.
 *     * You must provide the following methods for each encryption step:
 *             o removeWhitespaceAndConvertToUpper
 *             o substitute
 *             o swapHalfsForEncrypt
 *             o swapFirst2WithLast2
 *             o swapMiddleChars
 * Each of the above methods MUST have a String parameter and return a String.
 * At the end of your program, you must display the information for the user, INCLUDING the encrypted password.
 * 
 * NOTE: You may NOT store the unencrypted password in your standalone class. You may store the encrypted version. You will
 * be penalized if you store the unencrypted password in your standalone.
 */

import java.lang.Math; 

public class UserInfo {
    private String name;
    private String address;
    private String username; // Pathetic, PATHETIC MUSTAN HAAAA HAAAA HAAAA HAAAA
    private String password; // Password should be encrypted in the user driver...
    
    public UserInfo() {
        // Set defaults OwO UwU
        this.name = "";
        this.address = "";
        this.username = "";
        this.password = "";
    }
    
    // GS Name
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    // GS Address
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    
    // GS Username
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    
    // GS Password
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    

    
    
    // Encrypt the password. It's better than just chaining all the functions together, okay?
    // encrypt takes a string, and chains the five functions below to "encrypt" the password.
    public String encrypt(String s) {
        s = removeWhitespaceAndConvertToUpper(s);
        s = substitute(s);
        s = swapHalfsForEncrypt(s);
        s = swapFirst2WithLast2(s);
        s = swapMiddleChars(s);
        
        return s;
    }
    
    // Pretty simple, not sure why this is even worth any points.
    // As the name suggest, removeWhitespaceAndConvertToUpper takes a string, removes whitespace, and converts it to uppercase.
    public String removeWhitespaceAndConvertToUpper(String s) {
        return s.trim().toUpperCase();
    }
    
    // Somebody had to manually enter all these values. Poor fellow....
    // Subsitute takes a string and subsitutes certain characters with specific values.
    public String substitute(String s) {
        return s
            .replaceAll("A", "@")
            .replaceAll("E", "=")
            .replaceAll("I", "!")
            .replaceAll("J", "?")
            .replaceAll("O", "*")
            .replaceAll("P", "#")
            .replaceAll("R", "&")
            .replaceAll("S", "\\$") // The "$" messes up the regex, so we have to escape it before we put it in #replaceAll.
            .replaceAll("T", "+")
            .replaceAll("V", "^")
            .replaceAll("X", "%")
            .replaceAll(" ", "_");
    }
    
    // swapHalfs would have been a better name, we have no consistency I swear
    // swapHalfs takes a string, splits it in half, and flips the half.
    public String swapHalfsForEncrypt(String s) {
        int len = s.length();
        int half = (int)Math.ceil((float)len / 2);
        
        return
            s.substring(half, len) +
            s.substring(0, half);
    }
    
    // I mostly did my work in Notability. Oh yeah yeah.
    // swapFirst2WithLast2 takes a string, and swaps the first two characters with the last two characters.
    public String swapFirst2WithLast2(String s) {
        int len = s.length();
        int half = (int)Math.ceil((float)len / 2);
        
        return
            s.substring(len - 2, len) +
            s.substring(2, len - 2) +
            s.substring(0, 2);
    }
    
    // bruh everything is just more grinding, swapping characters
    // swapMiddleChars takes a string, and swaps the two characters to the left of the middle, and the two characters to the right of the middle.
    public String swapMiddleChars(String s) {
        int len = s.length();
        int half = (int)Math.ceil((float)len / 2);
        
        return
            s.substring(0, half - 2) +
            s.substring(half, half + 2) +
            s.substring(half - 2, half) +
            s.substring(half + 2, len);
    }
    
    
    
    // toString
    // toString returns all the relevant information about the UserInfo class.
    public String toString() {
        return
            // I wish everything was in a monospaced font, the reason for the weird spacing is because this makes
            // the text look aligned in JOptionPane
            "Name:                             " + name     + "\n" +
            "Address:                        " + address  + "\n" + 
            "Username:                    " + username + "\n" + 
            "Encrypted Password: " + password;
    }
}