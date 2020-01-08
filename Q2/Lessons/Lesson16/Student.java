public class Student {
    // name, age, grade, numberOfAbsences, average
    private String studentName;
    private int studentAge, studentGrade, studentNumberOfAbsences, studentAverage;
    
    public Student() {
        studentName = "";
        studentAge = 0;
        studentGrade = 0;
        studentNumberOfAbsences = 0;
        studentAverage = 0;
    }
    
    
    
    // GS Name
    public String getName() {return studentName;}
    public void setName(String name) {studentName = name;}
    
    // GS Age
    public int getAge() {return studentAge;}
    public void setAge(int age) {studentAge = age;}
    
    // GS Grade
    public int getNumberOfAbsences() {return studentNumberOfAbsences;}
    public void setNumberOfAbsences(int numberOfAbsences) {studentNumberOfAbsences = numberOfAbsences;}
    
    // GS Number of Absences
    public int getGrade() {return studentGrade;}
    public void setGrade(int grade) {studentGrade = grade;}
    
    // GS Average
    public int getAverage() {return studentAverage;}
    public void setAverage(int average) {studentAverage = average;}
    
    // toString
    public String toString() {
        return
              "Name:               " + studentName +
            "\nAge:                " + studentAge +
            "\nGrade:              " + studentGrade +
            "\nNumber of Absences: " + studentNumberOfAbsences +
            "\nAverage:            " + studentAverage;
    }
}