// 8) WAP to check whether character is uppercase, lowercase, digit or none.

import java.util.Scanner;
class ChararacterType{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char : ");
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch  <= 'Z')
		System.out.println("ch is uppercase");
		else if(ch >= 'a' && ch <= 'z')
		System.out.println("ch is lowercase");
		else if (ch >= '0' && ch <= '9')
		System.out.println("ch is digit");
		else
		System.out.println("none");
	}
}