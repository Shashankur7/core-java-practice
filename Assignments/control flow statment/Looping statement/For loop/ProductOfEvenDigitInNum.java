// 33. WAP to print product of even digit in a given number

import java.util.Scanner;
class ProductOfEvenDigitInNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
	
		int p = 1;
		for (  ; num > 0 ; num /= 10){
		 	int dig = num % 10;

			if(dig % 2 == 0){
				p = p * dig;
			}
		}
		System.out.println(p);
	}
}