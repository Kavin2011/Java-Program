package my_projects;

public class Armstrong {

	public static void main(String[] args) {
	
	int n,a,num=0;
	
	System.out.println("Armstrong numbers from 1 to 1000");

	for(int i=1;i<=1000;i++)
		
	{
		n=i;
		while (n>0)
			
		{
			a=n%10;
			num=num+(a*a*a);
			n=n/10;
			
		}
		if (num==i) {
		
			System.out.println(i+ " " );
			
		}
		num=0;
		
	}
	
	}

}
