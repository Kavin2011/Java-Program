package my_projects;

import java.util.Scanner;

public class SumOfEven {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		int number,evensum=0;
		sc=new Scanner(System.in);
		
		System.out.println("Enter any Number: ");
		number=sc.nextInt();
		
		for (int i = 1; i <=number; i++) {
			
			if (i%2 == 0 )
				evensum=evensum+i;
			
			}
		System.out.println("The sum of Even Number" + "  "   +evensum);
	      
			
		}
		
 
	}

