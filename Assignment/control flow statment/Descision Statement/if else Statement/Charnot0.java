// 7) Check if char is digit but not '0'

import java.util.Scanner;	
class Charnot0{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Char : " );
		char ch = sc.next().charAt(0);
		
		if(ch >= '1' && ch <= '9')
		System.out.println("Character is digit and not 0");
		else 
		System.out.println("invalid digit");
	}
}