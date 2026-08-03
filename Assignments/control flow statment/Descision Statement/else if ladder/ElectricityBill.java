// 2) Electricity bill calculation based on unit slabs.

import java.util.Scanner;

class ElectricityBill{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit : ");
		int unit = sc.nextInt();
		
		if (unit <= 100)
		System.out.println("bill 1000");
		else if (unit <= 200)
		System.out.println("bill 2000");
		else if (unit <= 300)
		System.out.println("bill 3000");
		else
		System.out.println("5000");
	}
}