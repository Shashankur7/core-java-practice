// 16. Multiplication table

import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ente nem :");
		int num = sc.nextInt();
		//int table = 1;
		for (int i = 1 ; i <= 10 ; i++)

			System.out.println(num+"*" +i+ "= " +num * i);
			//num * i;
			//System.out.println(num * i);
			//table =num * i;
			
			//System.out.println(table );
		
	}
}