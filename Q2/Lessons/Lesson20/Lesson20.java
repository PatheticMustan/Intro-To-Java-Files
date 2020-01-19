import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        try {
            // int, should return 55.
            System.out.println(sumRange(1, 10));
        } catch (Exception e) {System.out.println("error: " + e);}
        try {
            // int incorrect range, return an error.
            System.out.println(sumRange(10, 1));
        } catch (Exception e) {System.out.println("error: " + e);}
        try {
            // double, should return 54.
            // 1.5 - 10.5 = 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 54
            // We don't skip 10 because 10 is within the range of 1.5 - 10.5
            System.out.println(sumRange(1.5, 10.5));
        } catch (Exception e) {System.out.println("error: " + e);}
        try {
            // double incorrect range, return an error.
            System.out.println(sumRange(10.5, 1.5));
        } catch (Exception e) {System.out.println("error: " + e);}
        
        System.out.println("\n\n\n");
        
        // User input
        Scanner stringScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in); // Can't be bothered to use the same scanner for scanning both numbers and strings.
        String choice = "";
        
        // Input check
        while (!choice.equals("i") && !choice.equals("d")) {
            System.out.println("Will you use an int (i) or a double (d)?");
            choice = stringScanner.nextLine();
        }
        try {
            if (choice.equals("i")) {
            System.out.println("First int:");
            int f = numberScanner.nextInt();
            System.out.println("Second int:");
            int s = numberScanner.nextInt();
            System.out.println(sumRange(f, s));
        } else {
            System.out.println("First double:");
            double f = numberScanner.nextDouble();
            System.out.println("Second double:");
            double s = numberScanner.nextDouble();
            System.out.println(sumRange(f, s));
        }
        } catch (Exception e) {System.out.println("error: " + e);}
    }
    
    public static int sumRange(int first, int second) throws Exception {
        int sum = 0;
        // Throw error if first > second
        if (first > second) throw new Exception("The second parameter cannot be greater than the first!");
        for (int i=first; i<=second; i++) sum += i;
        
        return sum;
    }
    
    public static int sumRange(double first, double second) throws Exception {
        int sum = 0;
        // Throw error if first > second
        if (first > second) throw new Exception("The second parameter cannot be greater than the first!");
        for (int i=(int)Math.ceil(first); i<=Math.floor(second); i++) sum += i;
        
        return sum;
    }
}