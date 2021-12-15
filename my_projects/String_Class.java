package my_projects;

public class String_Class {

	public static void main(String[] args) {
	
	String s= "Welcome to Chennai 2.0 " ;
	
	int len=s.length();
	System.out.println(len);
	
	String up=s.toUpperCase();
    System.out.println(up);
    
    String low=s.toLowerCase();
    System.out.println(low);
    
    boolean e=s.endsWith(up);
    System.out.println(e);
    
    int ch= s.lastIndexOf(low);
    System.out.println(ch);
    
 
    
    
	}

}

