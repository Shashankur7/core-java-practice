// 7) Determine loan eligibility based on salary range.

import java.util.Scanner;
class LoanEligibil{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sal : ");
		int sal = sc.nextInt();

		if (sal <= 10000)
		System.out.println("not eligible");
		else if (sal <= 50000)
		System.out.println("eligible of small loan");
		else if (sal <= 100000)
		System.out.println("eligible for high loan");
		else
		System.out.println("elithible for very high loan");
	}
}