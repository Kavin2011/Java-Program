package my_projects;

import java.util.Scanner;

public class delivery_task {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter the weight in kg" );
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();

		System.out.println("Enter the distance in km");
		Scanner sc1 = new Scanner(System.in);
		int distance = sc1.nextInt();

		if (weight<=5) {
			if (distance <= 0) {

				System.out.println("Dispatch By Post");
			}

		} else if (distance <= 250) {
			if (weight >= 5)

				System.out.println("Dispatch By Lorry");
			
		} else if (distance <= 50) {

			if (weight <= 100) {
			}
			System.out.println("Dispatch By Van");

		} else {
			System.out.println("Dispatch By Train");

		}

	}
}