// 17. Count digits

import java.util.Scanner;
class CountDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();

		int count = 0;
		int ld = 0;
		do {
			ld = num % 10;
			if(ld >= 0 ){
				count++;
			}
			num /= 10;
		}while(num > 0);
		System.out.println(count);
	}
}
		