// 4) Check number ends with 0

import java.util.Scanner;

class Endswith0{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : " );
		int num = sc.nextInt();
		
		if (num % 10 == 0)
		System.out.println("ends with 0");
		else
		System.out.println("not ends with 0 ");
	}
}