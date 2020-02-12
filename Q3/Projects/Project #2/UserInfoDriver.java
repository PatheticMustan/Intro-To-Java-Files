public class UserInfoDriver {
    public static void main(String[] args) {
        UserInfo kevin = new UserInfo("William", "Antarctica");
        
        System.out.println(kevin.getName());
        System.out.println(kevin.getAddress());
        
        System.out.println("\n\n");
        
        // Oh no, I put in the wrong name! Let me change it!
        kevin.setName("Kevin");
        kevin.setAddress("69 Nassau Drive, 11021 Great Neck NY US");
        
        System.out.println(kevin.getName());
        System.out.println(kevin.getAddress());
        
        System.out.println("\n\n");
        
        String password = "   abcdefghijklmnopqrstuvwxyz   ";
        
        // Testing
        System.out.println("Original:                          " + password);
        System.out.println("RemoveWhitespaceAndConvertToUpper: " + kevin.removeWhitespaceAndConvertToUpper(password));
        // Subsitute needs uppercase chars.
        System.out.println("Substitute:                        " + kevin.substitute(kevin.removeWhitespaceAndConvertToUpper(password)));
        System.out.println("SwapHalfsForEncrypt:               " + kevin.swapHalfsForEncrypt(kevin.substitute(kevin.removeWhitespaceAndConvertToUpper(password))));
        System.out.println("SwapFirst2WithLast2:               " + kevin.swapFirst2WithLast2(kevin.swapHalfsForEncrypt(kevin.substitute(kevin.removeWhitespaceAndConvertToUpper(password)))));
        System.out.println("SwapMiddleChars:                   " + kevin.swapMiddleChars(kevin.swapFirst2WithLast2(kevin.swapHalfsForEncrypt(kevin.substitute(kevin.removeWhitespaceAndConvertToUpper(password))))));
        System.out.println("Encrypt:                           " + kevin.encrypt(password));
        
        System.out.println("\n\n");
        
        System.out.println(kevin);
    }
}