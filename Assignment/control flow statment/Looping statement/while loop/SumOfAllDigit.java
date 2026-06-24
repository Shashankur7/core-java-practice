// print sum of all digit given

import java.util.Scanner;
class SumOfAllDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
	
		int i = 1;
		int sum = 0;
		int ld = 0;
		while(num > 0){
			ld = num % 10;
			sum = sum + ld;
			num /= 10;
		}

		System.out.println(sum);
	}
}
		