// 17. Count digits

import java.util.Scanner;
class CountDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dit : ");
		int num = sc.nextInt();
	

		int count = 0;
		while(num > 0){
			//num = num/10;
			count++;
			num = num/10;
		}
		System.out.println(count);
	}
}