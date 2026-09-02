package Strings;

import java.util.Scanner;
public class LastToFirstChar {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		String res = new Scanner(System.in).nextLine();
		lastChar(res);
	}
	public static void lastChar(String res) {
		for(int i = res.length()-1 ; i>=0 ; i--) {
			System.out.println(res.charAt(i));
		}
	}
}
