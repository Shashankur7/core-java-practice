// 3) WAP to check given year is leap year or not

import java.util.Scanner;

class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year :");
		int num  = sc.nextInt();
		if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0))
		System.out.println("leap year");
		else
		System.out.println("not leap year");
	}
}