package my_projects;

import java.util.Scanner;

public class Result_Marks {

	public void Grade(int mark) {

		if (mark < 50) {

			System.out.println("Fail");
		} else if (mark >= 50 && mark < 60) {
			System.out.println("D Grade");

		} else if (mark >= 60 && mark < 70) {
			System.out.println("C Grade");

		} else if (mark >= 70 && mark < 80) {
			System.out.println("B Grade");

		} else if (mark >= 80 && mark < 90) {
			System.out.println("A Grade");

		} else if (mark >= 90 && mark < 100) {
			System.out.println("S Grade");

		} else {
			System.out.println("Invalid Marks");

		}

	}

	public static void main(String[] args) {

		Result_Marks obj = new Result_Marks();

		System.out.println("Enter Tamil Mark");
		Scanner sc2 = new Scanner(System.in);
		int mark1 = sc2.nextInt();
		obj.Grade(mark1);

		System.out.println("Enter English Mark");
		Scanner sc3 = new Scanner(System.in);
		int mark2 = sc3.nextInt();
		obj.Grade(mark2);

		System.out.println("Enter Maths Mark");
		Scanner sc4 = new Scanner(System.in);
		int mark3 = sc4.nextInt();
		obj.Grade(mark3);
	}
        
}
