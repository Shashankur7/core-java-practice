package Strings;
import java.util.Scanner;

public class DigitsOnly {
	
	public static void main(String[] args) {
		System.out.println("Enter a String :");
		String res = new Scanner(System.in).nextLine();
		onlyDigit(res);
	}
	public static void onlyDigit(String res) {
		char [] ch = res.toCharArray();
		for(int i = 0 ; i<ch.length; i++) {
			if(ch[i] >= '0' && ch[i]<= '9') {
				System.out.println(ch[i]);
			}
		}
	}
}
