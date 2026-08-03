// 2) WAP to check given character is special character or not

import java.util.Scanner;
class SpecialCharacter{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Char : " );
	char ch = sc.next().charAt(0);
	
	if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')))
	System.out.println("Special character");
	else
	System.out.println("not Special character");
	}
}	
		