package my_projects;

public class Stu_Task {
	
	int c,d;
	
	public Stu_Task() {
		
		System.out.println("Name");
	}
	
    public Stu_Task(int a,int b) {
		
		System.out.println(a+b);
		c=a;
		d=b;
		
    }
    public void add() {
		
    	System.out.println(c+d);
	}
	public static void main(String[] args) {
	
	Stu_Task s1 = new Stu_Task();
	Stu_Task s2 = new Stu_Task(25,75);
	
	}

}
