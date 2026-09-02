// 14) Check if character is lowercase and between 'm'–'z'

import java.util.Scanner;

class LovecaseBetMZ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char :");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'm' && ch <= 'z')
		System.out.println("between m and z");
		else 
		System.out.println("not between");
	}
}