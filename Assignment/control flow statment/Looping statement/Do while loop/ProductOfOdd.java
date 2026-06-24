// 34. WAP to print product of odd digit in a given number

import java.util.Scanner;
class ProductOfOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
	
		boolean flag = false;
		int pro = 1;
		int ld = 0;
		do{
			ld = num % 10;
			if(ld % 2 != 0){
				pro = pro  * ld;
				flag = true;
			}
			num /= 10;
		}while(num > 0);
		if(flag){
			System.out.println(pro);
		}
		else{
			System.out.println("not pro ");
		}
	}
}
				