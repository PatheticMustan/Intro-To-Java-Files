/* DuckDuckGoose.java            by Kevin Wang
 *
 * Requirements:
 * 1) User Input: Your program must get input from the user to use in the program.
 * 
 * 2) Documentation: All programs must have the following:
 *      a. Class header comments
 *      b. Method header comments
 *      c. Block commenting (comments explaining the function of major portions of your code)
 * 
 * 3) Readability: All programs must exhibit a high level of readability.
 * 
 * 4) Naming Conventions:
 *      a. All variables must begin with a lower-case letter
 *      b. All classes must begin with an upper-case letter
 *      c. All method and class names must be descriptive and reflect their purpose
 * 
 * 5) User friendliness: Programs must have descriptive input prompts, and output statements. See the Project List #1 description for an example.
 * 
 * 6) User-controlled exit: User is asked if they want to continue or exit the program, using an appropriate dialog box.
 * 
 * 7) Program Requirements: All programs must meet the problem requirements, as stated in the problem description below.
 * 
 * 
 * 
 * PROJECTS MUST BE UPLOADED TO DROPBOX BY FRIDAY, APRIL 3 @ 11:59PM. The folder name for this project MUST read "Project #3",
 *      and include all .java files related to this project.
 * 
 * POINTS WILL BE DEDUCTED PER DAY FOR LATENESS!!!
 * 
 * 
 * 
 * You are writing a program that simulates a game (such as Duck Duck Goose). The following are the requirements:
 * 1. You must ask the user for the number of participants
 * 
 * 2. You must ask the user for the length of the cycle (for example, Duck Duck Goose has a cycle of 3, whereas Eenie Meenie Miney Mo has a cycle of 4)
 * 
 * 3. Your project must ONLY display the winner of the game (counting from 0). So, for example, if the winner is the 4th participant, your program should display 3.
 * 
 * 4. Your project MUST use a boolean array and cannot use ArrayLists.
 * 
 * 5. Your project MUST include a method with the following signature:
 *      public static int playGame(boolean[] array, int cycle)
 * 
 * In the array, true represents a player that is still in the game and false represents a player that has been eliminated.
 * You must declare and fill your array in your main method, not in the playGame method.
 * 
 * 6. The class name for your project must be DuckDuckGoose.java and you are only creating one file for this assignment.
 * 
 * 
 * 
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
 * TOTAL: 17 points
 * 
 * sample data:
 * cycle: 3
 * participants: 5
 * winner: 3
 * 
 * cycle: 5
 * participants: 3
 * winner: 0
 * 
 * cycle: 12
 * participants: 12
 * winner: 10
 */

// import JOptionPane
import javax.swing.*;
// allows me to stringify arrays to make it pretty.
import java.util.Arrays;

public class DuckDuckGoose {
    public static void main(String[] args) {
        // JFrame is named suffering, because everybody knows JOptionPane is suffering
        JFrame suffering = new JFrame();
        
        // get input, first # of cycle, then the # of people.
        int cycle = Integer.parseInt(JOptionPane.showInputDialog(suffering, "Enter cycle number."));
        int people = Integer.parseInt(JOptionPane.showInputDialog(suffering, "Enter participant number."));
        
        // init bool array, and fill it with true
        boolean[] peopleArray = new boolean[people];
        for (int i=0; i<peopleArray.length; i++) {
            peopleArray[i] = true;
        }
        
        // display the result
        // AND NOWWWW WHOOOO WINS HER? NUMBER 66! AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh
        JOptionPane.showMessageDialog(suffering, "The winner is... NUMBER " + playGame(peopleArray, cycle) + "! AHHHHHH!");
    }



    public static int playGame(boolean[] array, int cycle) {
        // We need to keep track of the current index, and how far along we are on the cycle.
        int currentIndex = 0;
        int cycleProgression = 0;
        
        // so the idea for ((array.length-1)*cycle) is that every person eliminated 
        for (int i=0; i<((array.length-1)*cycle); i++) {
            // run to next user
            if (array[currentIndex] == false) i--;
            else cycleProgression++;
            
            // ELIMINATION!
            if (cycleProgression % cycle == 0) array[currentIndex] = false;
            
            // Go on to the next valid index, wrapping around to 0 every time it gets too high.
            currentIndex = (currentIndex + 1) % array.length;
        }
        
        // return the first true in the array.
        int result = 0;
        for (int o=0; o<array.length; o++) {
            if (array[o]) return o;
        }
        
        // it would only return -1 if the entire array was false, which shouldn't happen.
        return -1;
    }
}