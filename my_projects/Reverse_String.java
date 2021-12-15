package my_projects;

public class Reverse_String {

	public static void main(String[] args) {
	
	String word= "ABBA";
	String word2="";
	
	for (int i=word.length()-1; i>=0;  i--) {
		
		word2=word2+word.charAt(i);
	}
		System.out.println(word2);
		
	if (word2.equals(word)) {
		
		System.out.println("Palindrome");
		
	} else {
		
		System.out.println("Not a Palindrome");

	}	
	}
	
	
	}

