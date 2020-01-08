public class StudentDriver {
    public static void main(String[] args) {
        // name, age, grade, numberOfAbsences, average
        Student kevin = new Student();
        kevin.setName("Kevin");
        kevin.setAge(14);
        kevin.setGrade(9);
        /// OH MY GOD IT'S    S A T A N    T H E   G I F T   G I V E R   PLEASE TAKE MERCYYYYYY
        kevin.setNumberOfAbsences(666);
        // While 42 is an F, it is also the meaning of life
        kevin.setAverage(42);
        
        System.out.println(kevin + "\n\n\n");
        
        
        
        Student william = new Student();
        william.setName("William");
        william.setAge(14);
        william.setGrade(9);
        // William has been to school on weekends UwU
        william.setNumberOfAbsences(-15);
        william.setAverage(90);
        
        System.out.println(william + "\n\n\n");
        
        
        
        Student treeSpirit = new Student();
        treeSpirit.setName("Tree Spirit");
        // A three hundred year old spirit goes to school???
        treeSpirit.setAge(300);
        treeSpirit.setGrade(4);
        // Perfect attendence, because it's a tree spirit
        treeSpirit.setNumberOfAbsences(0);
        // Tree spirits are smart.
        treeSpirit.setAverage(100);
        
        System.out.println(treeSpirit + "\n\n\n");
    }
}