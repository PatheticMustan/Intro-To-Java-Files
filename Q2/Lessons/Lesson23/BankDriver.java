/* BankDriver.java            by Kevin Wang
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
 * 
 * 
 *     
 * 1. Bank
 *     a. name
 *     b. Branch
 *         a. address
 *         b. phone number
 *         c. BankTeller
 *             a. name
 *             b. teller ID
 * 
 * 2. CustomerAccount
 *     a. name
 *     b. account number
 *     c. ID number
 *     d. balance
 *     e. account type
 */

public class BankDriver {
    public static void main(String[] args) {
        Bank tdbank = new Bank(
            "TD Bank",
            new Branch(
                "110 Hillside Avenue, New Hyde Park, NY 11040",
                "(516) 616-5197",
                new BankTeller(
                    "Ted the Accountant",
                    "12345-Ted-6789"
                )
            )
        );
        
        CustomerAccount missSaigon = new CustomerAccount(
            "Miss Saigon",
            "1234567890",
            "123ChrisIHaveYourSon456",
            -169,
            "Personal"
        );
        
        CustomerAccount natsumi = new CustomerAccount(
            "Natsumi Hamasaki",
            "9876543210",
            "NatsumiIsTheBestBoy",
            666,
            "Savings"
        );
        
        CustomerAccount monika = new CustomerAccount(
            "Monika Koide-Nicolaides",
            "6666666666",
            "JUSTMONIKAJUSTMONIKA",
            999999999,
            "Admin"
        );
        
        System.out.println(tdbank);
        System.out.println(missSaigon);
        System.out.println(natsumi);
        System.out.println(monika);
    }
}