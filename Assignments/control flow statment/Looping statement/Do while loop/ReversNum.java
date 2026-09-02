// 18. Reverse number

import java.util.Scanner;
class ReversNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		int ld = 0;
		int rev = 0;
		do{
			ld = num % 10;
			rev = rev * 10 + ld;
			num /= 10;
		}while(num > 0);
		System.out.println(rev);
	}
}