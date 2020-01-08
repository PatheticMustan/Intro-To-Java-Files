public class Lesson18Test {
    public static void main(String[] args) {
        MethodPractice mp = new MethodPractice();
        
        boolean isEvenTest = false;
        boolean multipleTest = false;
        double minimum3Test = 0.0;
        int gcdTest = 0;
        
        //Problem 1 Test
        isEvenTest = mp.isEven(6);
        System.out.println( "isEven(6) output: " + isEvenTest );
        
        //Problem 2 Test
        multipleTest = mp.multiple(5, 10);
        System.out.println( "multiple(5, 10) output: " + multipleTest );   
        
        //Problem 3 Test
        minimum3Test = mp.minimum3(3.5, 4.5, 5.5);
        System.out.println( "minimum3(3.5, 4.5, 5.5) output: " + minimum3Test );       
        
        //Problem 4 Test
        gcdTest = mp.GCD(17, 34);//mp.GCD(71111, 25143);
        System.out.println( "GCD(71111, 25143) output: " + gcdTest );  
        
        System.out.println("\n\n\ntoString Method:\n");
        System.out.println(mp);
    }
}