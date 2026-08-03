// 16) Check if character is uppercase vowel only

import java.util.Scanner;
class UppercaseVowel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cahar : ");
		char ch = sc.next().charAt(0);

		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			System.out.println("Uppercase vowel ");
		else 
			System.out.println("now Uppercase vowel");
	}
}