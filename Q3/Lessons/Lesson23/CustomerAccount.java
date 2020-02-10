/* Bank.java            by Kevin Wang
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

public class CustomerAccount {
    private String name;
    private String accountNumber;
    private String idNumber;
    private float balance;
    private String accountType;
    
    public CustomerAccount(String name, String accountNumber, String idNumber, float balance, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.idNumber = idNumber;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    // GS Name
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    // GS AccountNumber
    public String getAccountNumber() {return accountNumber;}
    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
    // GS IDNumber
    public String getIDNumber() {return idNumber;}
    public void setIDNumber(String idNumber) {this.idNumber = idNumber;}
    // GS Balance
    public float getBalance() {return balance;}
    public void setBalance(float balance) {this.balance = balance;}
    // GS AccountType
    public String getAccountType() {return accountType;}
    public void setAccountType(String accountType) {this.accountType = accountType;}
    
    public String toString() {
        return name + "\n\t" + accountNumber + "\n\t" + idNumber + "\n\t" + balance + "\n\t" + accountType;
    }
}