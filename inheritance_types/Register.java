package inheritance_types;

public class Register extends Location {
	
	public Register() {
		
	System.out.println("Registration on 18-09-21");
	}
	
	public void Register_Name() {
	
	System.out.println("Reg.Name - Kavin");

	}
	
	public static void main(String[] args) {
		
	Register house= new Register();
	house.Housetype();
	house.Landmark();
	house.Register_Name();
		
	}

}
