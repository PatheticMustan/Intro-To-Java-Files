/* SquareMatrix.java            by Kevin Wang
 * 
 * Write a class SquareMatrix that represents a matrix, and contains the following methods and properties:
 *     - A two-dimensional array as an instance variable
 *     - Constructor that takes an integer as a parameter to create the array
 *     - Relevant accessor/mutator methods
 *     - void add(int i, int row, int column):
 *         o Adds an integer to the matrix at the specified location.
 *     - boolean isMagic()
 *         o Determines whether the matrix illustrates a magic square. This means:
 *             § The user entered n2 numbers for some number n
 *             § The numbers are only between 1 and n2, inclusive
 *             § Each of the numbers occurs exactly once in the matrix
 *             § The sums of the elements in each row, column, and the two diagonals are equal
 */

// import stuff

public class SquareMatrix {
    // woah it's a private instance variable, never saw that before
    private int[][] data;
    
    
    
    // constructor, duh
    public SquareMatrix(int size) {
        data = new int[size][size];
        // maybe I should fill it with zeros???
    }
    
    
    
    // GS data, but I'm not sure we need setData......
    public int[][] getData() {return data;}
    public void setData(int[][] newData) {data = newData;}
    
    
    
    // ezpz one liner
    public void add(int i, int row, int column) {data[row][column] = i;}
    
    
    
    // I mean squares are magic, but the real magic lies in Friendship, because "Friendship is magic™".
    public boolean isMagic() {
        int n = data.length;
        
        ///////////////////////////////////////////////////
        // The user entered n2 numbers for some number n //
        ///////////////////////////////////////////////////
        for (int[] row : data) {
            for (int num : row) {
                if (num == 0) {
                    return false;
                }
            }
        }
        
        
        //////////////////////////////////////////////////////
        // The numbers are only between 1 and n2, inclusive //
        //////////////////////////////////////////////////////
        for (int[] row : data) {
            for (int num : row) {
                if (1 > num || num > n*n) {
                    return false;
                }
            }
        }
        
        
        ///////////////////////////////////////////////////////////
        // Each of the numbers occurs exactly once in the matrix //
        ///////////////////////////////////////////////////////////
        // I'm gonna do what's called a pro gamer move
        // instead of looping over the n sized array n times, I'll just convert the array to a string, then check if it contains (i+",").
        String arrayButNowString = "";
        
        // convert 2d array to 1d vibrating string
        // the universe is made up of tiny little vibrating arrayButNowString's. I call it: "String Theory"!
        for (int[] row : data) {
            for (int num : row) {
                arrayButNowString += num + ",";
            }
        }
        
        // now check if it contains the good stuff
        for (int i=0; i<n*n; i++) {
            if (arrayButNowString.contains((i+1) + ",") == false) return false;
        }
        
        // this works because it's supposed
        
        
        ///////////////////////////////////////////////////////////////////////////////////
        // The sums of the elements in each row, column, and the two diagonals are equal //
        ///////////////////////////////////////////////////////////////////////////////////
        int sum = 0;
        int toCheckSum = 0;
        // go through the first column, and find the sum.
        for (int value : data[0]) {sum += value;}
        
        // horizontal 0th would be 0,0, 0,1, 0,2, 0,3, so it should be [i][o]
        for (int i=0; i<n; i++) {
            toCheckSum = 0;
            for (int o=0; o<n; o++) {toCheckSum += data[i][o];}
            if (toCheckSum != sum) return false;
        }
        
        // vertical 0th would be 0,0, 1,0, 2,0, 3,0, so it should be [o][i]
        for (int i=0; i<n; i++) {
            toCheckSum = 0;
            for (int o=0; o<n; o++) {toCheckSum += data[o][i];}
            if (toCheckSum != sum) return false;
        }
        
        // top left to bottom right would be 0,0, 1,1, 2,2, 3,3, so it should be [o][o]
        for (int i=0; i<n; i++) {
            toCheckSum = 0;
            for (int o=0; o<n; o++) {toCheckSum += data[o][o];}
            if (toCheckSum != sum) return false;
        }
        
        // top right to bottom left would be 0,3, 1,2, 2,1, 3,0 so it should be [o][n-1-o]
        for (int i=0; i<n; i++) {
            toCheckSum = 0;
            for (int o=0; o<n; o++) {toCheckSum += data[o][n-1-o];}
            if (toCheckSum != sum) return false;
        }
        
        return true;
    }
    
    
    
    public String toString() {
        int n = data.length;

        // https://en.wikipedia.org/wiki/Beelzebub
        String beelzebub = "";
        
        for (int[] row : data) {
            for (int num : row) {
                // crisp, clean, lock boys, it doesn't get more horsepoo than that 
                // we must regularly give offerings, or he will devour all
                String offering = String.format("%0"+(n*n+"").length()+"d", num);
                
                // here we witness a space in it's natural habitat
                beelzebub += offering + " ";
            }
            // OH GOD HE'S ONTO US AHHHH HIS MINIONS HAVE ARROWS THEY'RE SHOOTING NEWLINES NO NOT THE NEWLINEEEEES
            beelzebub += "\n";
        }
        
        // once he is satisfied he shall slumber. goodnight moon!
        return beelzebub;
    }
}