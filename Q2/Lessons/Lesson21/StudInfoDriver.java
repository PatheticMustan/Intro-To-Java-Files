public class StudInfoDriver {
    public static void main(String[] args) {
        // Really wish I could call it 'Student' instead
        StudInfo kevin = new StudInfo();
        
        kevin.setName("Kevin Wang");
        kevin.setID("990141626");
        
        Address kevinAddress = new Address();
        kevinAddress.setStreet("17 Nassau Drive");
        kevinAddress.setCity("Great Neck");
        kevinAddress.setState("NY");
        kevinAddress.setZip("11021");
        kevin.setAddress(kevinAddress);
        
        System.out.println(kevin);
        
        
        
        System.out.println("\n\n\n");
        
        
        
        // Shizune is obviously the best, she just had a bad route.
        StudInfo shizune = new StudInfo();
        
        shizune.setName("Shizune Hakamichi");
        shizune.setID("666666666");
        
        Address shizuneAddress = new Address();
        shizuneAddress.setStreet("Some large house");
        shizuneAddress.setCity("Yamaku???");
        shizuneAddress.setState("BI");
        shizuneAddress.setZip("12345");
        shizune.setAddress(shizuneAddress);
        
        System.out.println(shizune);
    }
}