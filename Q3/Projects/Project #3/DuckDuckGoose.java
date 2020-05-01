/* DuckDuckGoose
 * This project will be graded on:
 * 1. Documentation and Readability (5 points): Your code must be fully commented and employ standard Java-style conventions.
 * 
 * 2. User-Controlled Exit (2 points): The user is asked if they want to continue or exit the program.
 * 
 * 3. Project Requirements (10 points):
 *      a. Ask user cycle number (1 points)
 *      b. Ask user for number of participants (1 point)
 *      c. Correctly declares and uses an array to store the participants. (2 points)
 *      d. Correctly determines the winner for my 3 different test cases (2 points each)
 */

import javax.swing.*;

public class DuckDuckGoose
{
    public static void main(String[] args)
    {
        String again = "";
        do
        {
            int peopleInput = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter participant number."));
            int cycleInput = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter cycle number."));
            
            // init bool array, and fill it with true
            boolean[] peopleArray = new boolean[peopleInput];
            for (int i=0; i<peopleArray.length; i++)
            {
                peopleArray[i] = true;
            }
            
            //display winner, and ask to restart
            JOptionPane.showMessageDialog(null, "The winner is... NUMBER " + playGame(peopleArray, cycleInput) + "! AHHHHHH!");
            again = JOptionPane.showInputDialog(null, "To go again, type in y");
        }
        while (again.equals("y"));
    }


    
    public static int playGame(boolean[] array, int cycle)
    {
        int index = 0;
        int progress = 0;
        
        //go over the alive people
        for (int i=0; i<array.length*cycle-2; i++)
        {
            // if the user is eliminated already, decrement i, as if we never incremented it.
            if (array[index])
            {
                progress = progress + 1;
            }
            else
            {
                i--;
            }
            
            //end the cycle
            if (progress % cycle == 0)
            {
                array[index] = false;
            }
            
            //make sure we don't go invalid
            index = index + 1;
            index = index % array.length;
        }
        
        //find the true
        int result = 0;
        for (int i=0; i<array.length; i++)
        {
            if (array[i])
            {
                result = i;
            }
        }
        
        //Return result.
        return result;
    }
}