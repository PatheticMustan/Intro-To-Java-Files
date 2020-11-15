import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		String letter = "";
		
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if (grade >= 94 && grade <= 100)
			letter = "A";
		if (grade >= 85 && grade < 94)
			letter = "B";
		if (grade >= 75 && grade < 85)
			letter = "C";
		if (grade >= 60 && grade < 75)
			letter = "D";
		if (grade < 60)
			letter = "F";
		
		System.out.println(letter);
		
		sc.close();
	}
}
