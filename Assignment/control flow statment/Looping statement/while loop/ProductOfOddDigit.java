// 34. WAP to print product of odd digit in a given number

import java.util.Scanner;
class ProductOfOddDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num :");
		int num = sc.nextInt();
	
		int pro = 1;
		int ld = 0;
		while(num != 0){
			ld = num % 10;
				if(ld % 2 != 0){	
					pro = pro * ld;
				}
				num /= 10;
		}
		System.out.println(pro );	
	}
}