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
    private static int branchCount = 0;
    
    public Branch(String address, String phoneNumber, BankTeller bankTeller) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankTeller = bankTeller;
    }
    
    // GS Address
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    // GS PhoneNumber
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    // GS BankTeller
    public BankTeller getBankTeller() {return bankTeller;}
    public void setBankTeller(BankTeller bankTeller) {this.bankTeller = bankTeller;}
    
    public static int getCount() {
        return branchCount;
    }
    
    public String toString() {
        return "\t" + address + "\n\t" + phoneNumber + "\n\t" + bankTeller;
    }
}