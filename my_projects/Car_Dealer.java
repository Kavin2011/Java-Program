package my_projects;

public class Car_Dealer extends Car_Manufacture {
	
@Override
public void seater() {
	
	System.out.println("Seating capacity - 5");
}
@Override
	public void color() {
	
	System.out.println("Color - Blue");
	}
public static void main(String[] args) {
	
	System.out.println("My Car Specifications");
	
	Car_Dealer sale=new Car_Dealer();
	sale.brand();
	sale.engine();
	sale.model();
	sale.seater();
	sale.color();
	
}

}