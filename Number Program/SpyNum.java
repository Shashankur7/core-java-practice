//A Spy Number is a number in which:

//Sum of digits = Product of digits

import java.util.Scanner;
class SpyNum{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();

		int temp = num ;
		int ld = 0;
		int sum = 0;
		int pro = 1;
		while(num > 0){
			ld = num % 10;
			sum += ld ;
			pro *= ld;
			num /= 10;
		}
		if (sum == pro)
			System.out.println(temp+ " Num is spy num ");
		else
			System.out.println("not spy num ");
	}
}