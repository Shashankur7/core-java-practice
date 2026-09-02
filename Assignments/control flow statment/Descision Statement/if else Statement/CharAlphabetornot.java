// 1) WAP to check given character is alphabet or not

import java.util.Scanner;

class CharAlphabetornot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Char : " );
		char ch = sc.next().charAt(0);
		
		
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch  <= 'z'))
			System.out.println(ch+ " is Character");
		else
			System.out.println("not Character");
	}
}