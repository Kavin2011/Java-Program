package my_projects;


	  
	public class Java_Pattern 
	{    
	    public static void main(String[] args) 
	    {
	    	
	    
	    	int a=7;
	    	int c=4;
	    	
	    	for (int i = 1; i<5; i++) {
	    		
	    		c--;
	    		
	    		for (int j =i; j<5;j++) {
	    			
    			System.out.print( a+ "   ");
	    			
	    		a=a+1;
	    			
				}
	    		
	    		System.out.println();
	    		
	    		a=a-1;
	    		a=a-(2*c);
				
			}
	    		    	
      }    
}