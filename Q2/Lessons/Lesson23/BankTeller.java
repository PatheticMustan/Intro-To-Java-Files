/* BankTeller.java            by Kevin Wang
 * 
 * Write the following classes:
 * 1. BankTeller
 *     a. name
 *     b. teller ID
 * 
 * 2. Bank
 *     a. name
 *     b. Branch
 * 3. Branch
 *     a. address
 *     b. phone number
 *     c. BankTeller
 * 4. CustomerAccount
 *     a. name
 *     b. account number
 *     c. ID number
 *     d. balance
 *     e. account type
 */

public class BankTeller {
    private String name;
    private String tellerID;
    
    public BankTeller(String name, String tellerID) {
        this.name = name;
        this.tellerID = tellerID;
    }
    
    public String toString() {
        return name + ": " + tellerID;
    }
}