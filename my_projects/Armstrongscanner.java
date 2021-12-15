package my_projects;
	
	import java.util.Scanner;
	
	public class Armstrongscanner 
	{
	    public static void main(String[] args) 
	    {
	        int n, count = 0, a, b, c, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer you want to check:");
	        n = s.nextInt();
	        a = n;
	        c = n;
	        while(a > 0)
	        {
	            a = a / 10;
	            count++;
	        }
	        while(n > 0)
	        {
	            b = n % 10;
	            sum=sum+(b*b*b);
	            n = n / 10;
	        }
	        if(sum == c)
	        {
	            System.out.println("Given number is Armstrong");
	        }
	        else
	        {
	            System.out.println("Given number is not Armstrong");
	        }    
	    }
	}


