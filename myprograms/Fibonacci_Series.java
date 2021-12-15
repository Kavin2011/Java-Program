package myprograms;

public class Fibonacci_Series {
	
	//number 1 = 0 , number 2 = 1 , n3 ; static is used for without creating object it will invoke
	
	static int n1 = 0 , n2 = 1 , n3 ;
	
	public static void main (String args[]) {
		
		//Print number 1 & number 2 first
		System.out.println(n1);
		
		System.out.println(n2);

	
	for (int i=0; i< 10 ; i++) {
		
		// add the first two numbers and print
		n3= n1+n2 ;
		
		System.out.println(n3);
		
		// after print statement n2 value swap to n1 & n3 value swap to n2
		
		n1=n2 ; // swapping concept
		
		n2=n3;		
			
       }

   }
	
}