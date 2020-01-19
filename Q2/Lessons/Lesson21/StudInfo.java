/* StudInfo.java            by Kevin Wang
 * Intro to Programming and Java
 * Great Neck South High School
 * Ms Zinn
 * 
 * Write a class called StudInfo that will represent a student at GNS. Your class should provide the following information:
 * 1) Student name
 * 2) Student address
 *     a. Street Address
 *     b. City
 *     c. State
 *     d. Zip
 * 3) Student ID number
 * 4) The student’s average, given the following scheme:
 *     a. 4 in-class exams, and 1 final exam (counts twice) = 80% of grade
 *     b. Homework/class participation grade = 20% of grade
 *     c. BOTH GRADES ARE OUT OF 100 TOTAL POINTS
 * 5) The student’s average, given the following alternative scheme:
 *     a. 3 in-class exams, and 1 final exam (counts twice) = 50% of grade
 *     b. Programming projects = 30% of grade
 *     c. Homework/class participation grade = 20% of grade
 *     d. ALL GRADES ARE OUT OF 100 TOTAL POINTS
 * 6) Quality points earned, considering the following guidelines:
 *     a. 90-100 = 4 points
 *     b. 80-89 = 3 points
 *     c. 70-79 = 2 points
 *     d. 65-69 = 1 point
 *     e. < 60 = 0 points
 * 
 * Make sure your class incorporates all of the elements of encapsulation, as discussed in class.
 * IF YOU FINISH EARLY DURING CLASS, YOU MAY BEGIN TO WRITE THE CODE FOR A
 * DRIVER CLASS THAT WILL TEST YOUR StudInfo CLASS.
 */

public class StudInfo {
    private String studentName;
    private Address studentAddress;
    // Preserve 0's.
    private String studentID;
    
    public StudInfo() {
        studentName = "";
        studentAddress = new Address();
        studentID = "";
    }
    
    
    
    // GS Name
    public String getName() {return studentName;}
    public void setName(String name) {studentName = name;}
    
    // GS Address
    public Address getAddress() {return studentAddress;}
    public void setAddress(Address address) {studentAddress = address;}
    
    // GS ID
    public String getID() {return studentID;}
    public void setID(String ID) {studentID = ID;}
    
    // S Average
    /* 4) The student’s average, given the following scheme:
     *     a. 4 in-class exams, and 1 final exam (counts twice) = 80% of grade
     *     b. Homework/class participation grade = 20% of grade
     *     c. BOTH GRADES ARE OUT OF 100 TOTAL POINTS
     * 5) The student’s average, given the following alternative scheme:
     *     a. 3 in-class exams, and 1 final exam (counts twice) = 50% of grade
     *     b. Programming projects = 30% of grade
     *     c. Homework/class participation grade = 20% of grade
     *     d. ALL GRADES ARE OUT OF 100 TOTAL POINTS
     */
    public int calcThreeAverage(int exam1Score, int exam2Score, int exam3Score, int exam4Score, int finalExamScore, int homeworkScore) {
        return (int)(((exam1Score + exam2Score + exam3Score + exam4Score + (finalExamScore * 2)) / 6 * 0.8) + (homeworkScore * 0.2)) * 100;
    }
    
    public int calcFourAverage(int exam1Score, int exam2Score, int exam3Score, int finalExamScore, int programmingScore, int homeworkScore) {
        return (int)(((exam1Score + exam2Score + exam3Score + (finalExamScore * 2)) / 5 * 0.5) + (programmingScore * 0.3) + (homeworkScore * 0.2)) * 100;
    }
    
    /* 6) Quality points earned, considering the following guidelines:
     *     a. 90-100 = 4 points
     *     b. 80-89 = 3 points
     *     c. 70-79 = 2 points
     *     d. 65-69 = 1 point
     *     e. < 60 = 0 
     */
    public int calcQualityPoints(int average) {
        if (average >= 90) return 4;
        if (average >= 80) return 3;
        if (average >= 70) return 2;
        if (average >= 65) return 1;
        // What happens to 61, 62, 63, or 64????
        // I'll count is as 0, until somebody says otherwise.
        return 0;
    }
    
    // toString
    public String toString() {
        return
              "Name:             " + studentName +
            "\nID:               " + studentID +
            "\nAddress:          " + studentAddress;
            
    }
}