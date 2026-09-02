// 35. WAP to find base to the power

import java.util.Scanner;
class BaseToThePower{
	public static void main(String[] args){
		Scanner sc = new Scanner( System.in);
		System.out.println("enter base :");
		int base = sc.nextInt();

		System.out.println("Enter power :");
		int power = sc.nextInt();
	
		int res = 1;
		for(int i = 1; i <= power; i++){
			res = res * base;
		}
		System.out.println("res :" +res);
	}
}