/* BankTeller.java            by Kevin Wang
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

public class BankTeller {
    private String name;
    private String tellerID;
    private static int akiraCount = 0; // Every day we stray further from god
    
    public BankTeller(String name, String tellerID) {
        this.name = name;
        this.tellerID = tellerID;
        akiraCount++; // One more Akira is born into the world.
    }
    
    // GS Name
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    // GS TellerID
    public String getTellerID() {return tellerID;}
    public void setTellerID(String tellerID) {this.tellerID = tellerID;}
    
    // GS Balance
    public float getBalance(CustomerAccount customer) {return customer.getBalance();}
    public void deposit(CustomerAccount customer, float amount) {customer.setBalance(getBalance(customer) + amount);}
    public void withdraw(CustomerAccount customer, float amount) {customer.setBalance(getBalance(customer) - amount);}
    
    public static int getCount() {
        return akiraCount;
    }
    
    public String toString() {
        return "\t" + name + "\n\t\t" + tellerID;
    }
}