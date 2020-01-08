public class MethodPractice {
    private boolean isEvenTest, multipleTest;
    private double minimum3Test;
    private int gcdTest;
    
    public MethodPractice() {
        boolean isEvenTest = false;
        boolean multipleTest = false;
        double minimum3Test = 0.0;
        int gcdTest = 0;
    }
    
    // Insert the Problem #1 method here
    public boolean isEven(int number) {
        isEvenTest = number % 2 == 0;
        return isEvenTest;
    }

    // Insert the Problem #2 method here
    public boolean multiple(int first, int second) {
        multipleTest = second % first == 0;
        return multipleTest;
    }
  
    // Insert the Problem #3 method here
    public double minimum3(double first, double second, double third) {
        minimum3Test = Math.min(first, Math.min(second, third));
        return minimum3Test;
    }
    
    // Insert the Problem #4 method here
    public int GCD(int first, int second) {
        gcdTest = 0;
        // should only return 0 if one of the parameters are 0 or negative.
        for (int i=Math.min(first, second); i>0; i-=1) {
            if (first % i == 0    &&   second % i == 0) {
                gcdTest = i;
                break;
            }
        }
        return gcdTest;
    }
    
    public String toString() {
        return
            "isEvenTest:   " + isEvenTest   +
          "\nmultipleTest: " + multipleTest +
          "\nminimum3Test: " + minimum3Test +
          "\ngcdTest:      " + gcdTest;
    }
}

/* Updated Tier List
 * 1 - Shizune (obviously)
 * 2 - Hanako (Tied for first???)
 * 3 - Rin (Very cool)
 * 4 - Lilly (Extremely cool)
 * 5 - Misha (Yes)
 * 6 - Emi (SHE HAS NO LEGGSSSSSSSS)
 * 7 - Hisao (Hisao bad he's just constantly gloomy and sad)
 */