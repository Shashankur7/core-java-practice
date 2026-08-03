// 6) Determine shipping charges based on weight slabs.

import java.util.Scanner;
class ShippingCharge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight : ");
		int weight = sc.nextInt();
	
		if (weight >= 500)	
		System.out.println("high charge");
		else if (weight >= 300)
		System.out.println("mid charge");
		else if (weight >= 100)
		System.out.println("low charge");
	}
}