package my_projects;

public class Palindrome {
	
public static void main(String[] args) {
	
	int rem=0,n1;
	int n=4321;
	n1=n;
	
	while (n>0) {
		
		rem=(rem*10)+n%10;
		n=n/10;
		
	}System.out.println("" +rem);
	
	if (n1==rem) {
		
		System.out.println("Given number is Palindrome");
		
	} else {
		
		System.out.println("Not a Palindrome number");

	}
}

}