// 13) Check if character is uppercase but not a vowel

import java.util.Scanner;
class CharIsUppercase{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char ;");
		char ch = sc.next().charAt(0);
		
		if ((ch >= 'A' && ch <= 'Z' ) &&  !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
			System.out.println("Char is uppercase but not vovel");
		else
			System.out.println("char is invalid");
	}
}