// 4) Classify temperature as cold, normal, hot, very hot.

import java.util.Scanner;
class Temperature{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int temp = sc.nextInt();
		
		if (temp <=10)
		System.out.println("cold");
		else if (temp <= 25)
		System.out.println("normal");
		else if (temp <= 40)
		System.out.println("hot");
		else 
		System.out.println("very hot");
	}
}