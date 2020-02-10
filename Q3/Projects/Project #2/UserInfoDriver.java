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
        
        String password = "P3Epe3P0oPO0-013177";
        
        
        System.out.println(kevin.encrypt(password));
    }
}