// 20. Prime numbers

import java.util.Scanner;
class PrimeNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num :");
		int num = sc.nextInt();
	
		int i = 1;
		int count = 0;
		while(num >= i){
			
			if(num %  i == 0){
			count++;
			}
			i++;
		}
		System.out.println(count);

		if (count == 2)
			System.out.println(num+ "is prime num");
		else
			System.out.println("not prime");


	}


}
			