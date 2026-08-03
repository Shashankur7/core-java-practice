// 16. Multiplication table

import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();

		int i = 1;
		int mul = 1;
		do{
			mul = num * i;
				i++;
			System.out.println(mul);
		}while(i <= 10);
	}
}