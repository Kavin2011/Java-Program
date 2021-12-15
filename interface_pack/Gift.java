package interface_pack;

public class Gift implements Friend_1,Friend_2 {

	@Override
	public void gift2() {
	
	System.out.println("Bag-Pack one");
	}


	@Override
	public void gift1() {
		
	System.out.println("Bag-Pack Two");
	}
		
	public static void main(String[] args) {
		
	Gift gift = new Gift();
	
	gift.gift1();
	gift.gift2();
	
	}
	
}