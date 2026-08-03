// 14 

import java.util.Scanner;
class Ascii{
	public static void main ( String [] arga){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char : ");
		char ch = sc.next().charAt(0);
		String res =(ch >= 'A' && ch <= 'Z') ? " ASCII " : " not Ascii " ;
		System.out.println(res);
	}
}