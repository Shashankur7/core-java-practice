// 16. Multiplication table

import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();
	
		// int i = 1;
		// int tab = 1;
		// while(i <= 10){
		// 	tab = num * i;
		// 	i++;
		// 	System.out.println(tab);
		int count = 1;	
		int mul = 1;
		while(count <= 10){
				mul = num * count;
				System.out.println(mul);
				count++;
		}
	
	}

	
}

			