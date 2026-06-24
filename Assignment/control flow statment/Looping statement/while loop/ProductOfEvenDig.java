// 33. WAP to print product of even digit in a given number

import java.util.Scanner;
class ProductOfEvenDig{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		int ld = 0;
		int pro = 1;
		
		while( num != 0){
			ld = num % 10;			
			if(ld % 2 == 0){
				pro = pro * ld;
			}
			num /= 10;
		}
		System.out.println(pro);
	}
}