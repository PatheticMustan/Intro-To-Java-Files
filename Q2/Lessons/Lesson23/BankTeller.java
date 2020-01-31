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
    
    public BankTeller(String name, String tellerID) {
        this.name = name;
        this.tellerID = tellerID;
    }
    
    // get/set instance variables
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getTellerID() {return tellerID;}
    public void setTellerID(String tellerID) {this.tellerID = tellerID;}
    
    // get acc balance
    public float getBalance(CustomerAccount customer) {return customer.getBalance();}
    public void deposit(CustomerAccount customer, float amount) {customer.setBalance(getBalance(customer) + amount);}
    public void withdraw(CustomerAccount customer, float amount) {customer.setBalance(getBalance(customer) - amount);}
    
    public String toString() {
        return name + ": " + tellerID;
    }
}