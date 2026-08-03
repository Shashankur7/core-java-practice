// 1) Calculate income tax based on different tax slabs.

import java.util.Scanner;

class IncomeTaxSlabs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int num = sc.nextInt();
		
		if (num <= 10000)
		System.out.println("no tax");
		else if (num <= 20000)
		System.out.println("5% tax");
		else if (num <= 30000)
		System.out.println("10% tax");
		else
		System.out.println("30% tax");
	}
}