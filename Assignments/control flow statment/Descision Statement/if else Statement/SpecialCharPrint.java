// 8) Check if char is special symbol but printable

import java.util.Scanner;

class SpecialCharPrint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char :");
		char ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
		System.out.println("not Special char");
		else
		System.out.println(ch+ " Special char printable");
	}
}