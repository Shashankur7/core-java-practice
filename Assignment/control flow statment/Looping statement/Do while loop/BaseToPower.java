// 35. WAP to find base to the power

import java.util.Scanner;
class BaseToPower{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base ");
		int base = sc.nextInt();
		
		System.out.println("enter power ");
		int power = sc.nextInt();
	
		int res = 1;
		int count = 0;

		do{
			
			 res =res * base;
			
			 count++;
			
			
		}while(count < power);
		System.out.println(res);
	}
}