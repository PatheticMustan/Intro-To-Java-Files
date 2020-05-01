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

// import shit
import org.apache.commons.lang3.StringUtils;

public class SquareMatrix {
    private int[][] data;
    
    public SquareMatrix(int size) {
        data = new int[size][size];
        // maybe I should fill it with zeros???
    }
    
    // GS data, because we need both accessor AND mutator.
    public int[][] getData() {return data;}
    public void setData(int[][] newData) {data = newData;}
    
    // ezpz
    public void add(int i, int row, int column) {data[row][column] = i;}
    
    public boolean isMagic() {
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
                if (1 > num || num > (n * n)) {
                    return false;
                }
            }
        }
        
        
        ///////////////////////////////////////////////////////////
        // Each of the numbers occurs exactly once in the matrix //
        ///////////////////////////////////////////////////////////
        for (int i=0; i<data.length*data.length; i++) {
            
        }
        // convert array to map
        // check if map contained size*size elements
        // if not return false
        
        
        ///////////////////////////////////////////////////////////////////////////////////
        // The sums of the elements in each row, column, and the two diagonals are equal //
        ///////////////////////////////////////////////////////////////////////////////////
        int sum = 0;
        // go through the first column, and find the sum.
        for (int i : data[0]) {}
        
        return true;
    }
    
    public String toString() {
        
    }
}