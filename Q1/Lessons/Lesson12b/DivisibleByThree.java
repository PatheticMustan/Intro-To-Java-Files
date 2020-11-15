import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number! I'll tell you if it's divisible by three. ");
        int input = sc.nextInt();
        
        System.out.println(input + " % 3 = " + (input%3));
        System.out.println(input + " is " + (input%3 == 0? "" : "NOT ") + "divisible by three!");
    }
}