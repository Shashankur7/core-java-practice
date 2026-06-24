// 3) Calculate discount percentage based on purchase amount.

import java.util.Scanner;

class DiscountONPurchase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int amount = sc.nextInt();
		
		if (amount <= 1000)
		System.out.println("no discount");
		else if (amount <= 2000)
		System.out.println("5% Discount");
		else if (amount <= 5000)
		System.out.println("10% Discount");
		else
		System.out.println("12% Discount");
	}
}