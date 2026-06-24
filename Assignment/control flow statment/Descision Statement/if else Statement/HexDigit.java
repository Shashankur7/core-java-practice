// 17) Check if character is hex digit

import java.util.Scanner;
class HexDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char ");
		char ch = sc.next().charAt(0);
	
		if ((ch >= '0' && ch <= '9' ) || (ch >= 'A' && ch <= 'F'))
		System.out.println("is hex digit ");
		else 
		System.out.println(" not hex digit");
	}
}