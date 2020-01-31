/* Branch.java            by Kevin Wang
 * 
 * Write the following classes:
 * 1. BankTeller
 *     a. name
 *     b. teller ID
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

public class Branch {
    private String address;
    private String phoneNumber;
    private BankTeller bankTeller;
    
    public Branch(String address, String phoneNumber, BankTeller bankTeller) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankTeller = bankTeller;
    }
    
    public String toString() {
        return address + ": " + phoneNumber + ": " + bankTeller;
    }
}