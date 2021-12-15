package my_projects;

public class Palindrome_Prog {
	
public static void main(String[] args) {
	
	int rem,sum=0,n1;
	int n=939;
	n1=n;
	
	while (n>0) {
		
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		
	}System.out.println("" +sum);
	
	if (n1==sum) {
		
		System.out.println("Given number is Palindrome");
		
	} else {
		
		System.out.println("Not a Palindrome number");

	}
}

}
