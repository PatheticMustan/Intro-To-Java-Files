/* Address.java            by Kevin Wang
 * 2) Student address
 *     a. Street Address
 *     b. City
 *     c. State
 *     d. Zip
 */

public class Address {
    // Zip is a string because if it's something like 01234, we still need that 0.
    private String street, city, state, zip;
    public Address() {
        street = "";
        city = "";
        state = "";
        zip = "";
    }
    
    // GS street
    public String getStreet() {return street;}
    public void setStreet(String input) {street = input;}
    
    // GS city
    public String getCity() {return city;}
    public void setCity(String input) {city = input;}
    
    // GS state
    public String getState() {return state;}
    public void setState(String input) {state = input;}
    
    // GS zip
    public String getZip() {return zip;}
    public void setZip(String input) {zip = input;}
    
    public String toString() {
        return
            "\n    Street:   " + street +
            "\n    City:     " + city +
            "\n    State:    " + state +
            "\n    Zip:      " + zip;
    }
}