package my_projects;


import java.util.Scanner;

public class Sumof_Odd {
	

		
		static Scanner sc;

		public static void main(String[] args) {
			
			int number,oddsum=0;
			sc=new Scanner(System.in);
			
			System.out.println("Enter any Number: ");
			number=sc.nextInt();
			
			for (int i = 1; i <=number; i++) {
				
				if (i%2 != 0 )
					oddsum=oddsum+i;
				
				}
			System.out.println("The sum of ODD Number" + "  "   +oddsum);
		      
				
			}
			
	 
		}

