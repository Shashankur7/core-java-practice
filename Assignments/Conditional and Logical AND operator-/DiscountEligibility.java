// 12

import java.util.Scanner;
class DiscountEligibility {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dis : " );
		int num = sc.nextInt();
		String res = (num >= 3000 && num <= 10000) ? " Eligible for Discount "  : " not eligible for Discount " ;
		System.out.println(res);
	}
}