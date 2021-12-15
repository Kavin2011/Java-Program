package my_projects;

public class Key_Words {
	
	int i=14;

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		
		Key_Words r= new Key_Words();
		r.demo();
		System.out.println(r.i);
		
		}
	public void demo() {
		
		System.out.println("Demo method");
	}
	public Key_Words() {
	
	System.out.println("Constructor");
	}
    
	static {
		
		System.out.println("Static");
	}
}
