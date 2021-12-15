package my_projects;

public class College_Staff extends Collage_Founder {

	@Override
	public void HOD() {

		System.out.println("PREM KUMAR");
	}
	
	@Override
	public void staff() {
		
		System.out.println("BOOBALAN");
	}
	
	public static void main(String[] args) {
	
	College_Staff show = new College_Staff();
	show.chairman();
	show.college_name();
	show.HOD();
	show.staff();
	}
}



