// 10) Age based ticket price.

import java.util.Scanner;
class AgeBaseTic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		if (age <= 5)
		System.out.println("not ticket");
		else if (age <= 10)
		System.out.println("half ticket");	
		else
		System.out.println("full tickt");
	}
}