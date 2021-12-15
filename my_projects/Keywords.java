package my_projects;



public class Keywords {
	
	final int Max_Speed;

    public Keywords() {
	
    	  Max_Speed=90;
	}
    
    public void mySpeed() {

    System.out.println(Max_Speed);
	}
    
	public static void main(String[] args) {
		
		Keywords speed= new Keywords();
		speed.mySpeed();
				

	}

}
