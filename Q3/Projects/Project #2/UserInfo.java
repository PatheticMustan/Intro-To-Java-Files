import java.lang.Math; 

public class UserInfo {
    private String name;
    private String address;
    
    public UserInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    // GS Name
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    // GS Address
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    

    
    
    // Encrypt stuff
    public String encrypt(String s) {
        return swapMiddleChars(swapFirst2WithLast2(swapHalfsForEncrypt(substitute(removeWhitespaceAndConvertToUpper(s)))));
    }
    
    public String removeWhitespaceAndConvertToUpper(String s) {
        return s.trim().toUpperCase();
    }
    public String substitute(String s) {
        return s
            .replaceAll("A", "@")
            .replaceAll("E", "=")
            .replaceAll("I", "!")
            .replaceAll("J", "?")
            .replaceAll("O", "*")
            .replaceAll("P", "#")
            .replaceAll("R", "&")
            .replaceAll("S", "$")
            .replaceAll("T", "+")
            .replaceAll("V", "^")
            .replaceAll("X", "%")
            .replaceAll(" ", "_");
    }
    public String swapHalfsForEncrypt(String s) {
        int len = s.length();
        int half = (int)Math.ceil(len / 2);
        return
            s.substring(half, len) +
            s.substring(0, half);
    }
    public String swapFirst2WithLast2(String s) {
        int len = s.length();
        int half = (int)Math.ceil(len / 2);
        return
            s.substring(len - 2, len) +
            s.substring(2, len - 2) +
            s.substring(0, 2);
    }
    public String swapMiddleChars(String s) {
        int len = s.length();
        int half = (int)Math.ceil(len / 2);
        return
            s.substring(0, half - 2) +
            s.substring(half, half + 2) +
            s.substring(half - 2, half) +
            s.substring(half + 2, len);

    }
}