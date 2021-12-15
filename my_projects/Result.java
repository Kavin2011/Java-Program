package my_projects;

import java.util.Scanner;

public class Result {
	
	public static void main(String[] args) {
		
	  System.out.println("Enter Marks1");
	    Scanner sc = new Scanner(System.in);
	    int mark=sc.nextInt();
	    
		if (mark<50) {
	    	
	    	System.out.println("Fail");
	    }else if (mark>=50 && mark<60) {
			System.out.println("D Grade");
			
	    }else if (mark>=60 && mark<70) {
			System.out.println("C Grade");
			
	    }else if (mark>=70 && mark<80) {
			System.out.println("B Grade");
			
	    }else if (mark>=80 && mark<90) {
			System.out.println("A Grade");
			
	    }else if (mark>=90 && mark<100) {
			System.out.println("S Grade");
			
		} else {
			System.out.println("Invalid Marks");
		
		}
	}
}